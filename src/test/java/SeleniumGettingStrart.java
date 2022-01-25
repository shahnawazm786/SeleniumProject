import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGettingStrart {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startup();
		maximizeBrowser();
		getTitle();
		getAnotherUrl();
		close();
	}
	static void startup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		}
	static void maximizeBrowser() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	static void getTitle() {
		String title=driver.getTitle();
		System.out.println("Title of the Google Application -> "+title);
	}
	static void getAnotherUrl() {
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.1");
	}
	static void close() {
		driver.quit();
	}
}

