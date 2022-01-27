package selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class LocatorExample {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		setup();
		findElementByTagName();
		findElementById();
		feedForm();
	}
	static void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	//	driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/text-box");
	}
	static void findElementByTagName() {
		// count the div tag
		List<WebElement> element=driver.findElements(By.tagName("div"));
		System.out.println("Div occured ->" + element.size());
		element=driver.findElements(By.tagName("iframe"));
		System.out.println("iframe occured ->" + element.size());
		element=driver.findElements(By.tagName("script"));
		System.out.println("script occured ->" + element.size());
		element=driver.findElements(By.tagName("img"));
		System.out.println("image occured ->" + element.size());
		element=driver.findElements(By.tagName("nav"));
		System.out.println("Navigation occured ->" + element.size());
		element=driver.findElements(By.tagName("button"));
		System.out.println("Button occured ->" + element.size());
		element=driver.findElements(By.tagName("input"));
		System.out.println("Input occured ->" + element.size());
	}
	static void findElementById() {
			boolean isDisplayed=driver.findElement(By.id("userName")).isDisplayed();
			System.out.println("Element displayed "+ isDisplayed);
			isDisplayed=driver.findElement(By.id("userName")).isEnabled();
			System.out.println("Element enabled "+ isDisplayed);
	}
	static void feedForm() throws InterruptedException {
		WebElement txtUserName=driver.findElement(By.id("userName"));
		WebElement txtEmail=driver.findElement(By.id("userEmail"));
		WebElement txtCurAddress=driver.findElement(By.id("currentAddress"));
		WebElement txtPerAddress=driver.findElement(By.id("permanentAddress"));
		WebElement btnSubmit=driver.findElement(By.id("submit"));
		txtUserName.sendKeys("Mohammad");
		txtEmail.sendKeys("mohammad@gmail.com");
		txtCurAddress.sendKeys("Shaheen Bagh, Delhi");
		txtPerAddress.sendKeys("India");
		Thread.sleep(5000);
		btnSubmit.click();
		WebElement output=driver.findElement(By.id("output"));
		String str=output.getText();
		System.out.println(str);
		
	}

}
