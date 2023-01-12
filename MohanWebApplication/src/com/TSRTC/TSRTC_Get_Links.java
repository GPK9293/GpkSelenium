package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Get_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationurladdress ="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\MohanWebApplication\\BrowsersDriverFiles\\chromedriver.exe");
	     driver=new ChromeDriver();
	   	 driver.get(applicationurladdress);
	   	  List<WebElement>tSRTC_HomePageLinks=driver.findElements(By.tagName("a"));
	   	  int tSRTC_HomePageLinks_Size=tSRTC_HomePageLinks.size();
	   	  System.out.println("The Numbers Of The TSRTC Application HomePage Are:"+tSRTC_HomePageLinks_Size);
	   	  for (int i=0;i<tSRTC_HomePageLinks_Size;i++)
	   	  {
	   		  String tSRTC_HomePage_Links_Name=tSRTC_HomePageLinks.get(i).getText();
	   		  
	   		  System.out.println(i+" "+tSRTC_HomePage_Links_Name);
	   		  
	   	  }
	
	}

}
