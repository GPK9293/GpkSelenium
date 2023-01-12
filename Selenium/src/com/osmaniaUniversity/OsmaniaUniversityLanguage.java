package com.osmaniaUniversity;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OsmaniaUniversityLanguage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String osmaniaUrlAddress="https://www.osmania.ac.in/";
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(osmaniaUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement languageDropDownElement=driver.findElement(By.className("notranslate"));
		
		List<WebElement> languageDropDownNames=languageDropDownElement.findElements(By.tagName("option"));
		int languageDropDownNamesCount=languageDropDownNames.size();
		System.out.println("The Total Number of Languages available are : "+languageDropDownNamesCount);
		for(int language=0; language<languageDropDownNamesCount; language++)
		{
			languageDropDownNames.get(language).click();

			String selectedLanguage=languageDropDownNames.get(language).getText();
			System.out.println(language +" "+ selectedLanguage);
			File osmaniaCapturedScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(osmaniaCapturedScreenshot, new File("./OsmaniaCapturedScreenshots/"+language+" "+selectedLanguage+".png"));
			
		}
			
		driver.quit();
}
}