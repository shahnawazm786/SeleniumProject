package selenium06;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import selenium04.BaseClass;

public class FindElementUsingXPath extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("https://askomdch.com/account/");
		boolean isDisplayed=false;
		try {
			//isDisplayed=driver.findElement(By.xpath("//input[@type='input']")).isDisplayed();
			isDisplayed=driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		}catch(NoSuchElementException nse) {
			System.out.println("//input[@type='input'] -> Element not found");
			nse.printStackTrace();
		}
		
		if(isDisplayed) {
			System.out.println("Element found");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testautomation@gmail.com");
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("registerautomation@gmail.com");
		}
		
	}
	

}
