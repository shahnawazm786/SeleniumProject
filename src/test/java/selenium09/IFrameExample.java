package selenium09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium04.BaseClass;

public class IFrameExample extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///C:/Users/ADMIN/Desktop/HTMLPage/frames.html");
		driver.switchTo().frame("contactus");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mohammad");
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shahnawaz");
		driver.switchTo().defaultContent();
		multiFrameHanding();
		driver.switchTo().defaultContent();
		getDiv();
	}
	//to find element from the iframe/frame/frameset is challenging
	// iframe is element to include another file into html
	// Ex:- Home.html
	// Contactus.html
	// Protofolio.html
	
	// NoSuchElement exception will be throw - when your xpath is wrong, the element is not into dom, 
	// the element present into the iframe /frame/frameset 
	// to handle the the third criteria
	// you have findout iframe -> switch the iframe
	static void multiFrameHanding() {
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shahnawaz");
		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("shahnawaz");
		
	}
	static void getDiv() {
		String text=driver.findElement(By.xpath("//div")).getText();
		System.out.println(text);
	}
	

}
