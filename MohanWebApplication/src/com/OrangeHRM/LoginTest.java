package com.OrangeHRM;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String OrangeHRM_Application_URLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\MohanWebApplication\\BrowsersDriverFiles\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	     driver.get(OrangeHRM_Application_URLAddress);
	     String expected_OrangeHRM_Application_Login_Title="orangeHRM";
	    System.out.println("The expected OrangeHRM Login Title is:"+expected_OrangeHRM_Application_Login_Title);
	    String actual_OrangeHRM_Application_Login_Title=driver.getTitle();
	    System.out.println("The actual OrangeHRM Login Title is:"+actual_OrangeHRM_Application_Login_Title);
	   
	    if(actual_OrangeHRM_Application_Login_Title.equals(expected_OrangeHRM_Application_Login_Title))
	    {
	   System.out.println("The expected and actual OrangeHRM Login Title is Matching -Pass");
	    }
	    
	else 
	{
		System.out.println("The expected and actual OrangeHRM Login Title is not Matching-Fail");
		
	}
	
	String expectedLoginPanelText="LOGIN PANEL";
	
	
	
			
	
	
	}
}
