package selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementByCSSSelectorExample extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("https://askomdch.com/account/");
		login();
		verifyData();
		close();
	}
	static void login() {
		WebElement inputLogin=driver.findElement(By.cssSelector(".woocommerce-Input"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement btnLogin=driver.findElement(By.name("login"));
		inputLogin.sendKeys("mohammad1");
		password.sendKeys("1234567");
		btnLogin.click();
		
	}
	static void verifyData() {
		String message=driver.findElement(By.xpath("(//p)[3]")).getText();
		System.out.println(message);
	}
//
}
