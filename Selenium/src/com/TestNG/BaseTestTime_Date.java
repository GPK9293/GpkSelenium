package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestTime_Date {
WebDriver driver;
String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
@BeforeTest
public void applicationLaunch()
{
	System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterTest
public void applicationClose()
{
	driver.close();
}
}
