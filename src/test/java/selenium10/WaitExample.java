package selenium10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium04.BaseClass;

public class WaitExample extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///C:/Users/ADMIN/Desktop/HTMLPage/JSExample.html");
		//getButton();
		getButtonExplicitWait();
	}
	
	static void getButton() {
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele=driver.findElement(By.id("Button2"));
		ele.click();
	}
	static void getButtonExplicitWait() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.pollingEvery(Duration.ofMillis(100));
		WebElement ele=wait.pollingEvery(Duration.ofMillis(100))
		.until(ExpectedConditions.elementToBeClickable(By.id("Button2")));
		ele.click();
	}

}
