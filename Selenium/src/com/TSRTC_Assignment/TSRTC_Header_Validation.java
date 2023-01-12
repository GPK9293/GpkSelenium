package com.TSRTC_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Header_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
String tSRTC_UrlAddress="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(tSRTC_UrlAddress);
	driver.manage().window().maximize();

	WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	List<WebElement> headerBlockLinks=headerBlock.findElements(By.tagName("a"));

	int headerBlockLinks_Size=headerBlockLinks.size();
	System.out.println("The Number of Links in the Header Block are: "+headerBlockLinks_Size);
	for(int i=0; i<headerBlockLinks_Size; i++)
	{

		String headerBlockLinkName=headerBlockLinks.get(i).getText();
		System.out.println(i +" " +headerBlockLinkName);
		headerBlockLinks.get(i).click();
		String webpageTitle=driver.getTitle();
		System.out.println("The Title of the Webpage is : "+webpageTitle);
		String WebpageURLAddress=driver.getCurrentUrl();
		System.out.println("The Webpage URL Address is : "+WebpageURLAddress);
		
		driver.navigate().back();
		headerBlock=driver.findElement(By.className("menu-wrap"));
		 headerBlockLinks=headerBlock.findElements(By.tagName("a"));				
		}

	
	driver.quit();
	
	}

}
