package com.Google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\MohanWebApplication\\BrowsersDriverFiles\\chromedriver.exe");
	
	ChromeDriver chrome = new ChromeDriver();
	
	chrome.navigate().to("http://Google.com");
	
	String expectedGoogleTitle="Google";
	System.out.println("The Expected Google Title of Google Home Page is :"+expectedGoogleTitle);

	String actualGoogleTitle=chrome.getTitle();
System.out.println("The Actual Google Title of Google Home Page is :"+actualGoogleTitle);

  char actualGoogleTitle_firstChar=actualGoogleTitle.charAt(0);
 
   	System.out.println("The first Character of Actual Google Title is:"+actualGoogleTitle_firstChar);
	
	char expectedGoogleTitle_firstchar=expectedGoogleTitle.charAt(0);
	System.out.println("The first Character of Expected Google Title is:"+expectedGoogleTitle_firstchar);
	
	if((actualGoogleTitle_firstChar)==(expectedGoogleTitle_firstchar));
	{
	if((expectedGoogleTitle.equalsIgnoreCase(actualGoogleTitle)))
	{
	System.out.println("Expected and Actual Google Title are equal");	
	}
	else
	{
	System.out.println("Expected and Actual Google Title are not equal");
	
	}
	
chrome.quit();
	}
}
}