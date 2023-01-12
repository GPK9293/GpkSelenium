package com.Google;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");

		ChromeDriver chrome=new ChromeDriver();

		chrome.get("http://google.com");

		String ExpectedGoogleTitle="Google";

		System.out.println("The Expected result of Google HomePage Title is :" +ExpectedGoogleTitle );

		String ActualGoogleTitle=chrome.getTitle();


		System.out.println("The Actual result of Google HomePage Title is :" +ActualGoogleTitle);


		System.out.println("The Initial Character of Actual Google title is:" +ActualGoogleTitle.charAt(0));
		System.out.println("The Initial Character of Expected Google title is:" +ExpectedGoogleTitle.charAt(0));

		if((ActualGoogleTitle.charAt(0))==(ExpectedGoogleTitle.charAt(0)))

		{
		if(ExpectedGoogleTitle.equalsIgnoreCase(ActualGoogleTitle))
		{
		System.out.println("Expected and Actual Titles are matching");
		}
		else
		{
		System.out.println("Expected and Actual titles are not Matching");
		}

		}

		String Expected_GoogleHomePageURLAddress="http://google.com";

		System.out.println("The Expected Google Home Page URL Address is :" +Expected_GoogleHomePageURLAddress);

		String Actual_GoogleHomePageURLAddress=chrome.getCurrentUrl();

		System.out.println("The Actual Google Home Page URL Address is :" +Actual_GoogleHomePageURLAddress);

		if(Actual_GoogleHomePageURLAddress.contains(Expected_GoogleHomePageURLAddress))

		{
		System.out.println("The Expected and Actual Google Home Page URL Address is matched - Pass");
		}

		else
		{
		System.out.println("The Expected and Actual Google Home Page URL Address is not matched - Fail");
		}



		chrome.quit();




	}

}
