package com.APSRTC;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSRTC_GET_LINKS {
	static Logger logger=LogManager.getLogger(APSRTC_GET_LINKS.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		String applicationUrlAddress="https://www.apsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		List<WebElement> homePageLink_APSRTC=driver.findElements(By.tagName("a"));
		int aPSRTC_HomePage_Link=homePageLink_APSRTC.size();
		System.out.println("The Total links in TSRTC Application Home Page is :" +aPSRTC_HomePage_Link);
		for(int i=0;i<aPSRTC_HomePage_Link;i++)
		{
			String aPSRTC_HomePage_Link_Name=homePageLink_APSRTC.get(i).getText();
			System.out.println(i +" " +aPSRTC_HomePage_Link_Name);
			System.out.println("LOG4j Test");
			
		}
		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		driver.close();


	}

}
