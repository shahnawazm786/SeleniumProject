package selenium07;

import org.openqa.selenium.By;

import selenium04.BaseClass;

public class XpathExample extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		getUrl("file:///C:/Users/ADMIN/Desktop/HTMLPage/Entry.html");
		getAttributeExample();
		getTextExample();
	}
	static void getAttributeExample() {
		String place=driver.findElement(By.xpath("(//input[@id='name'])[1]")).getAttribute("placeholder");
		System.out.println(place);
	}
	static void getTextExample() {
		String text=driver.findElement(By.xpath("//label[@for='male']")).getText();
		System.out.println(text);
	}

}
