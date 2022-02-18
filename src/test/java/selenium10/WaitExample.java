package selenium10;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import selenium04.BaseClass;

public class WaitExample extends BaseClass {

	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///C:/Users/ADMIN/Desktop/HTMLPage/JSExample.html");
		//getButton();
		//getButtonExplicitWait();
		//takeScreenshotElement();
		handleAlert();
	}
	
	static void getButton() throws IOException {
		// implicit wait
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement ele=driver.findElement(By.id("Button2"));
		ele.click();
		}catch(Exception ex) {
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  LocalDateTime now = LocalDateTime.now();  
			String fileName=now.toString().replace('-', '_').replace(':', '_').replace(".", "_");
			System.out.println(fileName);
			FileUtils.copyFile(scrFile, new File("src/test/resources/screenshot/"+fileName+".png"));
			driver.quit();
			 
		}
	}
	static void getButtonExplicitWait() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.pollingEvery(Duration.ofMillis(100));
		WebElement ele=wait.pollingEvery(Duration.ofMillis(100))
		.until(ExpectedConditions.elementToBeClickable(By.id("Button2")));
		ele.click();
	}
	static void takeScreenshotElement() throws IOException {
		WebElement ele=null;
		try{ele=driver.findElement(By.id("Button2"));
		ele.click();}catch(Exception ex) {
		File srcFile=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("src/test/resources/screenshot/element/ele.png"));
		driver.quit();
		}
	}
	static void handleAlert() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement ele=null;
		ele=driver.findElement(By.id("Button2"));
		ele.click();
		//Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.accept();
		al.accept();
		
	}

}
