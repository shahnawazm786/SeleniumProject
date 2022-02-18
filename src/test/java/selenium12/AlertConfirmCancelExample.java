package selenium12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import selenium04.BaseClass;

public class AlertConfirmCancelExample extends BaseClass {

	static By btn1=By.xpath("//button[contains(text(),'Alert Box')]");
	static By btn2=By.xpath("//button[contains(text(),'Confirm Alert Box')]");
	static By btn3=By.xpath("//button[contains(text(),'Prompt Alert Box')]");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// https://nxtgenaiacademy.com/alertandpopup/
		setup();
		getUrl("https://nxtgenaiacademy.com/alertandpopup/");
		//getAlert1();
		//getAlert2();
		getAlert3();
	}
	
	static void getAlert1() {
		driver.findElement(btn2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// handle alert
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}
	
	static void getAlert2() {
		driver.findElement(btn2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// handle alert
		Alert al=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		al.dismiss();
	}
	static void getAlert3() throws InterruptedException {
		driver.findElement(btn3).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// handle alert
		Alert al=driver.switchTo().alert();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Hello!!!!");
		//al.sendKeys("Hello I am sending data");
		Thread.sleep(5000);
		String txt=al.getText();
		al.accept();
		System.out.println(txt);
	}
	

}
