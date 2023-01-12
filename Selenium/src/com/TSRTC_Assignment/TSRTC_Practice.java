
package com.TSRTC_Assignment;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		File capturedScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(capturedScreenshot,new File(("./ApplicationsScreenshotsCaptured/")+i+" "+headerBlockLinkName+"Tsrtc.png" ));

		String WebpageURLAddress=driver.getCurrentUrl();
		System.out.println("The Webpage URL Address is : "+WebpageURLAddress);
		
		driver.navigate().back();
		headerBlock=driver.findElement(By.className("menu-wrap"));
		 headerBlockLinks=headerBlock.findElements(By.tagName("a"));				
		}

		// Object actual[]=new Object[headerBlockLinks_Size];
		// actual[i]=webpageURLAddress;
		
	
	
	driver.quit();
	
	}


}
