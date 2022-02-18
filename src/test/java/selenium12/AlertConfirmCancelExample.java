package selenium12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import selenium04.BaseClass;

public class AlertConfirmCancelExample extends BaseClass {

	static By btn1=By.xpath("//button[contains(text(),'Alert Box')]");
	static By btn2=By.xpath("//button[contains(text(),'Confirm Alert Box')]");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://nxtgenaiacademy.com/alertandpopup/
		setup();
		getUrl("https://nxtgenaiacademy.com/alertandpopup/");
		//getAlert1();
		getAlert2();
	}
	
	static void getAlert1() {
		driver.findElement(btn2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// handle alert
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}
	
	static void getAlert2() {
		driver.findElement(btn1).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// handle alert
		Alert al=driver.switchTo().alert();
		al.dismiss();
	}
	
	

}
