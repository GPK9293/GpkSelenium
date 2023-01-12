package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AllBrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");
		 
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.get("http://bing.com");
		
		chrome.navigate().to("http://amazon.in");
		
		//close will close the Browser if it has only one Tab opened
		
		//chrome.close();
		
		//quiet will close the Browser with all the Tab's Opened
		
		 chrome.quit();
		 
		 //Automation Edge Browser
		
		 System.setProperty("webdriver.edge.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\msedgedriver.exe");
		 
		EdgeDriver edge=new EdgeDriver();
		edge.get("http://Flipkart.com");
		
		edge.close();
		 
		 //Automation OperaBrowser
		
		System.setProperty("webdriver.opera.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\operadriver.exe");
		
		OperaDriver opera=new OperaDriver();
		
		opera.get("http://Youtube.com");
		
		opera.quit();
		
		//Automating Internet explorer Browser
		
	//	System.setProperty("webdriver.ie driver","../BrowsersDriverFiles/IEDriverServer.exe");
		
		
		//InternetExplorerDriver ie=new InternetExplorerDriver();
		
		//Automation FireFore Browser
		
		System.setProperty("webdriver.gecko.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\geckodriver.exe");
		 
		FirefoxDriver fire=new FirefoxDriver();
		
		fire.get("http://hotstar.com");
		
		fire.quit();
		
    }
}