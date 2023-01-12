package com.GoogleTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\LalithaWebApplication\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://google.com");
	    String ExpectedGoogleTitle="Google";
	    System.out.println("The ExpectedGoogleTitle in GoogleHomePage:"+ExpectedGoogleTitle);
	    driver.get("http://google.com");
	   
	    
	    String actualGoogleTitle=driver.getTitle();
	    
	    
	    // String ActualGoogleTitle="google.com";
	    System.out.println("The ActualGoogleTitle in GoogleHomePage;"+actualGoogleTitle);   
if((ExpectedGoogleTitle.charAt(0))==(actualGoogleTitle.charAt(0)));	    

{
if((ExpectedGoogleTitle).equalsIgnoreCase(actualGoogleTitle))
{
	
	System.out.println("The expected and actual  are equal ");
}
else
{
	System.out.println("The expected and actual  are not equal ");

}
}
driver.quit();
	}

}
