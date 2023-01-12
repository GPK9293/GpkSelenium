package com.Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		String applicationUrlAddress="https://www.youtube.com/";
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();

		
		WebElement searchBarElement=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
		searchBarElement.sendKeys("Malgudi Days Telugu");
		// <yt-icon class="style-scope ytd-searchbox"><svg viewBox="0 0 24 24" preserveAspectRatio="xMidYMid meet" focusable="false" class="style-scope yt-icon" style="pointer-events: none; display: block; width: 100%; height: 100%;"><g class="style-scope yt-icon"><path d="M20.87,20.17l-5.59-5.59C16.35,13.35,17,11.75,17,10c0-3.87-3.13-7-7-7s-7,3.13-7,7s3.13,7,7,7c1.75,0,3.35-0.65,4.58-1.71 l5.59,5.59L20.87,20.17z M10,16c-3.31,0-6-2.69-6-6s2.69-6,6-6s6,2.69,6,6S13.31,16,10,16z" class="style-scope yt-icon"></path></g></svg><!--css-build:shady--></yt-icon>
		//WebElement searchButtonElement=driver.findElement(By.className("style-scope ytd-searchbox"));
		//searchButtonElement.click();
		
		// <yt-icon class="style-scope ytd-searchbox"><svg viewBox="0 0 24 24" preserveAspectRatio="xMidYMid meet" focusable="false" class="style-scope yt-icon" style="pointer-events: none; display: block; width: 100%; height: 100%;"><g class="style-scope yt-icon"><path d="M20.87,20.17l-5.59-5.59C16.35,13.35,17,11.75,17,10c0-3.87-3.13-7-7-7s-7,3.13-7,7s3.13,7,7,7c1.75,0,3.35-0.65,4.58-1.71 l5.59,5.59L20.87,20.17z M10,16c-3.31,0-6-2.69-6-6s2.69-6,6-6s6,2.69,6,6S13.31,16,10,16z" class="style-scope yt-icon"></path></g></svg><!--css-build:shady--></yt-icon>
		WebElement searchElement=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button"));
		 searchElement.click();
			
		
	}

}
