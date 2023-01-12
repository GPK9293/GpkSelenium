package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Get_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		List<WebElement> homePageLink_TSRTC=driver.findElements(By.tagName("a"));
		int tSRTC_HomePage_Link=homePageLink_TSRTC.size();
		System.out.println("The Total links in TSRTC Application Home Page is :" +tSRTC_HomePage_Link);
		for(int i=0;i<tSRTC_HomePage_Link;i++)
		{
			String tSRTC_HomePage_Link_Name=homePageLink_TSRTC.get(i).getText();
			System.out.println(i +" " +tSRTC_HomePage_Link_Name);
		}
		
		// driver.close();

	}

}
