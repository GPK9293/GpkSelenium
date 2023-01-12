package com.RediffRegistrrationAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Rediff_BaseTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		String rediffRegistration_URL="https://register.rediff.com/register/register.php?FormName=user_details";
		System.setProperty("webdriver.chrome.driver", "E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(rediffRegistration_URL);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
