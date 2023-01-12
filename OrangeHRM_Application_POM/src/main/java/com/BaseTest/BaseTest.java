package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utility.Log;

public class BaseTest 
{

	public static WebDriver driver; // assigning driver as Global variable
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	@BeforeMethod
	public void setup()
	{
		// initializing chrome driver 
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("Chrome browser Succefully Launched");
		
		// Navigating to Orange HRM URRL Address
		driver.get(applicationUrlAddress);
		Log.info("Successfully Navigated to OrangeHRM Application Login Page");
		// Maximizing the current window
		driver.manage().window().maximize();
		// giving implicit wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		// requesting the driver to close after method 
		driver.close();
	}
	
	
	

}
