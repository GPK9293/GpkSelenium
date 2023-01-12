package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class LoginFunctionality {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get(urlAddress);
		// <input name="txtUsername" id="txtUsername" type="text">
		WebElement usernameElement=driver.findElement(By.id("txtUsername"));
		usernameElement.sendKeys("GPK9293");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		WebElement passwordElement=driver.findElement(By.name("txtPassword"));
		 passwordElement.sendKeys( "Gpk@9293");   
	  //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		    WebElement loginElement=driver.findElement(By.name("Submit"));      
	 	         loginElement.click();
		          
		          
		          
		          
		          
		          
		          
		          
		
		
		
		
	}

}
