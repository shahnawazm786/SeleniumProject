package org.general;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Page2 {
    WebDriver driver;
    @Test
    public void CommonTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://amazon.in");
        List<WebElement> elements=driver.findElements(By.xpath("//a"));
        List<String> text=new ArrayList<>();
        for(WebElement ele : elements){
            String temp=ele.getText();
            if(!temp.isEmpty()){
                text.add(temp);
            }
        }
        for(String st:text){
            System.out.println(st);
        }

        System.out.println("------------------ Removed duplicate String----------------");
        // Removing the Duplicate string
        List<String> uniqueString=new ArrayList<>(new HashSet<String>(text));
        for(String s:uniqueString){
            System.out.println(s);
        }
    }
}
