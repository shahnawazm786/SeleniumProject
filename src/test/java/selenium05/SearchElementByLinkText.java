package selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.*;

import selenium04.BaseClass;

public class SearchElementByLinkText extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///F:/AutomationClass_WorkSpace/SeleniumProject/src/test/resources/Demo.html");
		//getLinkText();
		//getLinkText("facebook");
		//showPartialLink();
		showByClass();
		
	}
	static void getLinkText() {
	WebElement linkElement=	driver.findElement(By.linkText("Click here"));
	linkElement.click();
	System.out.println(driver.getTitle());
	}

	static void getLinkText(String siteName) {
		driver.navigate().back();// back to the local web site
		List<WebElement> linkElement=driver.findElements(By.linkText("Click here"));
		for(WebElement ele:linkElement) {
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
		}
		if(siteName.equals("facebook")) {
			linkElement.get(1).click();
		} else if(siteName.equals("linkedin")) {
			linkElement.get(2).click();	
		}
		else {
			linkElement.get(0).click();	
		}
		
	}
	static void showPartialLink() {
		WebElement linkElement=	driver.findElement(By.partialLinkText("Google"));
		linkElement.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	static void showByClass() {
		//firstsection
		List<WebElement> linkElement=driver.findElements(By.className("firstsection"));
		
		for(WebElement el:linkElement) {
			System.out.println(el.getTagName());
		}
		//background
		System.out.println("background class");
			linkElement=driver.findElements(By.className("background"));
		
		for(WebElement el:linkElement) {
			System.out.println(el.getTagName());
		}
	}
}
