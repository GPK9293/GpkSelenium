package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
String chromedriverURLAddress="https://m.facebook.com";
driver=new ChromeDriver();
driver.get(chromedriverURLAddress);
//<input autocorrect="off" autocapitalize="off" class="_56bg _4u9z _27z2 _8qtm" autocomplete="on" id="m_login_password" name="pass" placeholder="Password" type="password" data-sigil="password-plain-text-toggle-input">

// <input autocorrect="off" autocapitalize="off" class="_56bg _4u9z _5ruq _8qtn" autocomplete="on" id="m_login_email" name="email" placeholder="Mobile number or email address" type="text" data-sigil="m_login_email">
WebElement userNameElement=driver.findElement(By.id("m_login_email"));
userNameElement.sendKeys("9666990553");
WebElement passwordElement=driver.findElement(By.id("m_login_password"));
             passwordElement.sendKeys("lallipavan");
    //<button type="button" value="Log In" class="_54k8 _52jh _56bs _56b_ _28lf _9cow _56bw _56bu" name="login" data-sigil="touchable login_button_block m_login_button" data-autoid="autoid_3"><span class="_55sr">Log In</span></button>         

	WebElement loginElement=driver.findElement(By.name("login"));
	
	loginElement.click();
	
	
	
	
	
	
	
	
	
	}

}
