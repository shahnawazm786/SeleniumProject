package selenium04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.WebDriver;


public class FindElementByNameExample extends BaseClass {

	//static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		setup();
		
		getUrl("https://askomdch.com/account/");
		
		registerUser("mohammad3","test3@automation.com","1234567");
		
		verifyData();
	}
	
	static void registerUser(String username,String email,String pass) throws Exception {
		//Thread.sleep(10000);
		WebElement inputUname=driver.findElement(By.id("reg_username"));
		WebElement inputEmail=driver.findElement(By.name("email"));
		WebElement inputPassword=driver.findElement(By.id("reg_password"));
		WebElement btnSubmit = driver.findElement(By.name("register"));
		inputUname.sendKeys(username);
		inputEmail.sendKeys(email);
		inputPassword.sendKeys(pass);
		//Thread.sleep(5000);
		btnSubmit.click();
	}
	static void verifyData() {
		String message=driver.findElement(By.xpath("(//p)[3]")).getText();
		System.out.println(message);
	}
	

}
