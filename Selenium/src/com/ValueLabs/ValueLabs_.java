package com.ValueLabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueLabs_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String valueLabs_URL_Address="https://www.valuelabs.com/";
	
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(valueLabs_URL_Address);
		driver.manage().window().maximize();
// <div class="collapse navbar-collapse nav-bar" id="navbarSupportedContent">
		WebElement valueLabsHeaderBlock=driver.findElement(By.id("navbarSupportedContent"));
      List<WebElement> valueLabsHeaderLinks=valueLabsHeaderBlock.findElements(By.tagName("a"));
int valueLabsHeaderLinksCount=valueLabsHeaderLinks.size();
System.out.println("The Number of links in Header Block of Value labs are : "+valueLabsHeaderLinksCount);

for(int i=0; i<valueLabsHeaderLinks.size(); i++ )
{
	if(valueLabsHeaderLinks.get(i).isDisplayed())
	{
		String valueLabsHeaderLinkName=valueLabsHeaderLinks.get(i).getText();
	System.out.println(i +" "+valueLabsHeaderLinkName);	
}
}
driver.quit();
	
	}
}