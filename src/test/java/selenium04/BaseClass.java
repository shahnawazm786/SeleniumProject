package selenium04;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	static void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	static void getUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get(url);
		driver.manage().window().maximize();	
	}
	static void close() {
		driver.quit();
	}
}
