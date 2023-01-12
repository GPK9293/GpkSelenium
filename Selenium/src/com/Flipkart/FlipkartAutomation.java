package com.Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://flipkart.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div"));


// driver.findElement(By.className("_2doB4z")).click();
// <input autocomplete="off" type="text" class="_2IX_2- VJZDxU" value="">




// <span>Enter Email/Mobile number</span>
//<input autocomplete="off" type="text" class="_2IX_2- VJZDxU" value="">
WebElement userName=driver.findElement(By.cssSelector("input._2IX_2-[type=text]"));
userName.sendKeys("9399974499");
//<input autocomplete="off" type="password" class="_2IX_2- _3mctLh VJZDxU" value="">
WebElement password=driver.findElement(By.cssSelector("input._2IX_2-[type=password]"));
password.sendKeys("9399974499g");
	}
}

 // driver.quit();


	