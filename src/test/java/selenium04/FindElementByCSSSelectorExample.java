package selenium04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementByCSSSelectorExample extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("https://askomdch.com/account/");
		login();
		verifyData();
		countPTag();
		countDivTag();
		countImgTag();
		countAnchorTag();
		countSpanTag();
		//close();
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
	static void countPTag() {
		List<WebElement> listPTag=driver.findElements(By.tagName("p"));
		System.out.println("Number of P tag in the page"+listPTag.size());
	}
	static void countDivTag() {
		List<WebElement> listDivTag=driver.findElements(By.tagName("div"));
		System.out.println("Number of P tag in the page"+listDivTag.size());	
	}
	static void countImgTag() {
		List<WebElement> listImgTag=driver.findElements(By.tagName("img"));
		System.out.println("Number of P tag in the page"+listImgTag.size());
	}
	static void countAnchorTag() {
		List<WebElement> listAnchorTag=driver.findElements(By.tagName("a"));
		System.out.println("Number of P tag in the page"+listAnchorTag.size());
	}
	static void countSpanTag() {
		List<WebElement> listSpanTag=driver.findElements(By.tagName("span"));
		System.out.println("Number of P tag in the page"+listSpanTag.size());	
	}
	
//

}
