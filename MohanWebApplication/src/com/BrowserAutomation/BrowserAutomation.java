package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\MohanWebApplication\\BrowsersDriverFiles\\chromedriver.exe");
	
	ChromeDriver chrome=new ChromeDriver();
	chrome.get("http://bing.com");
	chrome.navigate().to("http://amazon.in");
	chrome.close();
	
	}
}
