package selenium08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium04.BaseClass;

public class SelectOptionExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setup();
		getUrl("https://opensource-demo.orangehrmlive.com/");
		login();
	}
	static void login() throws InterruptedException{
		By userName=By.id("txtUsername");
		By password=By.id("txtPassword");
		By loginBtn=By.id("btnLogin");
		driver.findElement(userName).clear();;
		driver.findElement(userName).sendKeys("Admin");
		driver.findElement(password).clear();;
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginBtn).click();
		Thread.sleep(5000);
		By adminLink=By.xpath("//a//b[text()='Admin']");
		driver.findElement(adminLink).click();
		Thread.sleep(1000);
		By userManagement=By.xpath("//a[text()='User Management']");
		driver.findElement(userManagement).click();
		//Thread.sleep(2000);
		By usersLink=By.xpath("//a[text()='Users']");
		driver.findElement(usersLink).click();
		// selection of Drop down
		WebElement sel= driver.findElement(By.id("searchSystemUser_userType"));
		Select s=new Select(sel);
		List<WebElement> opt=s.getOptions();
		for(WebElement el:opt) {
			System.out.println(el.getText());
		}
	}

}
