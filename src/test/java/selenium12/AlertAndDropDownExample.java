package selenium12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import selenium04.BaseClass;

public class AlertAndDropDownExample extends BaseClass {

	static By button=By.id("Button2");
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///C:/Users/ADMIN/Desktop/HTMLPage/JSExample.html");
		//getAlert();
		getAlertHandle();
	}
	
	static void getAlert() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(button).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	static void getAlertHandle() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(button).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		al.accept();
	}
	

}
