package selenium02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startup();
		findElementInPage();
		registerUser();
	}
	static void startup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");

		driver=new ChromeDriver();
		//driver.get("file:///F:/AutomationClass_WorkSpace/SeleniumProject/src/test/resources/index.html");
		driver.get("https://www.google.com");
	}
	static void findElementInPage() {
		// findElement() -> single element
//		// findElements() -> mulitple element
//		List<WebElement> ele=driver.findElements(By.tagName("p"));
//		System.out.println("Number of Element -> "+ele.size());
	/*
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("selenium");
		ele.sendKeys(Keys.ENTER);
		*/
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.tagName("a"));
		
	}
	static void registerUser() {
		//WebElement ele=driver.findElement(By.id("username"));
		
		//ele.sendKeys("selenium");
		
	}
	// selenium driver used following locator
	// id
	// name
	// cssSelector
	// xpath
	// link
	// partilaLink

}
