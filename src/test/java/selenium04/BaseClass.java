package selenium04;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	protected static void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	protected static void getUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get(url);
		driver.manage().window().maximize();	
	}
	protected static void close() {
		driver.quit();
		//driver.close();
	}
}
