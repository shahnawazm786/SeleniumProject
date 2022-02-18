package selenium12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import selenium04.BaseClass;

public class DropDownMenuExample extends BaseClass {

	static By btn=By.xpath("//button[text()='Select Languages']");
	static By inp=By.xpath("(//div[@class='ms-options'])[1]//ul//li//label//input");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("http://demos.codexworld.com/multi-select-dropdown-list-with-checkbox-jquery/");
		getDropDownFirst();
	}
	
	static void getDropDownFirst() {
		
		driver.findElement(btn).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		List<WebElement> list=driver.findElements(inp);
		System.out.println(list.size());
		for(WebElement el:list) {
			el.click();
		}
	}
}
