package com.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestGmail {
	
	
		public WebDriver driver; // assigning driver as Global variable
		String applicationUrlAddress="https://www.google.com/intl/en-GB/gmail/about/";
		
		
		
		
		@BeforeTest
		public void setup()
		{
			// initializing chrome driver 
			System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
			driver = new ChromeDriver();
			// Navigating to Orange HRM URRL Address
			driver.get(applicationUrlAddress);
			// Maximizing the current window
			driver.manage().window().maximize();
			// giving implicit wait time
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		
		@AfterTest
		public void tearDown()
		{
			// requesting the driver to close after test 
			driver.close();
		}
		}

		

