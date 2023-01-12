package com.TSRTC;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlockLinksScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			
		WebDriver driver;
		String tSRTC_Application="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\MohanWebApplication\\BrowsersDriverFiles\\chromedriver.exe");
		
        driver=new ChromeDriver();
        driver.get(tSRTC_Application); 
        driver.manage().window().maximize();
        WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
        List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
        int headerBlockLinks_Size= headerBlockLinks.size();
        System.out.println("The Number of Links in the HeaderBlock are:"+headerBlockLinks_Size);
        for (int i=0;i<headerBlockLinks_Size;i++)
        {
        	
        	String expectedWebPageURLAddress=headerBlockLinks.get(i).getAttribute("href");
        	String headerBlockLinkNameString=headerBlockLinks.get(i).getText();
        	
			int headerBlockLinksName = 0;
			System.out.println(i+" "+headerBlockLinksName);
        	headerBlockLinks.get(i).click();
        	File captuedScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
			FileUtils.copyFile(captuedScreenshot,new File(("./ScreenshotCaptured/")+i+" "+headerBlockLinksName));
        	String webPageTitle=driver.getTitle();
        	System.out.println("The Title of "+headerBlockLinksName+" webPage is :"+webPageTitle);
        		
        	System.out.println("The Expected "+webPageTitle+" webpage URL Address is :"+expectedWebPageURLAddress);
        	
        	String actual_webPageURLAddress=driver.getCurrentUrl();
      
        	System.out.println("The actual "+ webPageTitle +" webpage URL Address is :"+actual_webPageURLAddress);
        	
        	
        	driver.navigate().back();
        	
        	headerBlock=driver.findElement(By.className("menu-wrap"));
        	
        	headerBlockLinks=headerBlock.findElements(By.tagName("a"));
        	
        	if(actual_webPageURLAddress.contains(expectedWebPageURLAddress))
        	{
        		System.out.println("The Actual and Expected URL Address is "+headerBlockLinksName+" webpage is  matched -Pass ");
        		
        	}
        	else
				
				{
					System.out.println("The Actual and Expected WebPage URL Address is not matched -Fail");
					
				}

            System.out.println();
        }
            driver.quit();
            
        	
        } 
        	
        	
        }
        	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
