package com.DesiDeals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DesiDealsApplication {

@Test
	public void NewDeals()
	{

	WebDriver driver;
	String applicationUrlAddress="https://www.desidime.com/";

	System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	System.out.println("LOG4j Test");
	
	
	
	}
}
 