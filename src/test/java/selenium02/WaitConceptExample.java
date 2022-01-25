package selenium02;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class WaitConceptExample {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startup();
		//

	}
	static void startup()  {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");

		driver=new ChromeDriver();
		try {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			//driver.get(" https://demoqa.com/elements");
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}catch(TimeoutException te) {
			System.out.println("Unable to load the page in 2 second");
		}
	}

}
