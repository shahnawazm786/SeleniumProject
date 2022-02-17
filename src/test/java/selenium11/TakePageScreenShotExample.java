package selenium11;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

import selenium04.BaseClass;

public class TakePageScreenShotExample extends BaseClass {

	static By btn2=By.id("text1");
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///C:/Users/ADMIN/Desktop/HTMLPage/JSExample.html");
		//getPageScreenshot();
		getElementScreenshot();
	}
	static void getPageScreenshot() throws IOException {
		try {
		WebElement ele=driver.findElement(btn2);
		ele.click();
		}catch(ElementNotInteractableException ne) {
			ne.printStackTrace();
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File("src/test/resources/screen/testfail.png"));
			
		}
	}
	static void getElementScreenshot() throws IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele=null;
		ele=driver.findElement(btn2);
		ele.sendKeys("Hello, I am going to be captured");
		//ele.click();
		
		File src=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("src/test/resources/screen/elementcap1.png"));
		
		//driver.close();
	
	}
	
}
