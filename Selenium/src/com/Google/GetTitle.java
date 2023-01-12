package com.Google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		String Expected_Google_Title="Google";
		System.out.println("The Expected Google Title is :"+Expected_Google_Title);
		String Actual_Google_Title=driver.getTitle();
		System.out.println("The Actual Google Title is :" +Actual_Google_Title);
 if(Expected_Google_Title.equals(Actual_Google_Title))
 {
	 System.out.println("The Actual and Expected Google Title is matching---Pass");
 }
 else
 {
	 System.out.println("The Actual and Expected Google Title is not matching---Fail");
 }
 if(Expected_Google_Title.charAt(0)==Actual_Google_Title.charAt(0))
 {
	 if(Expected_Google_Title.equalsIgnoreCase(Actual_Google_Title))
	 {
		 System.out.println("The Actual and Expected Google Title is matching--pass");
		 
	 }
	 else
	 {
		 System.out.println("The Actual and Expected Google Title is not matching--Fail");
		 
	 }
 }
 
 driver.quit();
 
	}

}
