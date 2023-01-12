package com.OrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_LoginTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		FileInputStream file = new FileInputStream
		("E:\\\\GPK_WorkSpace\\\\Selenium\\\\src\\\\excel\\\\OrangeHRM_LoginTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		int rowCount=sheet.getLastRowNum();
        for(int row=1; row<=rowCount; row++)
        {
        	Row sheetRow=sheet.getRow(row);
        
        	Cell rowOfCell=sheetRow.getCell(0);
        	String username=rowOfCell.getStringCellValue();
        	System.out.println("username : "+username);
        	 rowOfCell=sheetRow.getCell(4);
        	String password=rowOfCell.getStringCellValue();
        	System.out.println("password : "+password);
           
        	
		System.setProperty("webdriver.chrome.driver",
		"E:\\\\GPK_WorkSpace\\\\Selenium\\\\BrowsersDriverFiles\\\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		String expected_LogInPage_logInPanelText="LOGIN Panel";
		System.out.println(" The expected LogIn Page Text is : "+expected_LogInPage_logInPanelText);

		WebElement actual_LogInPageElement=driver.findElement(By.id("logInPanelHeading"));
		String actual_LogInPageText=actual_LogInPageElement.getText();
		System.out.println(" The actual Text of the LogIn Page is :"+actual_LogInPageText);

		if(actual_LogInPageText.equals(expected_LogInPage_logInPanelText))
		{
		System.out.println(" Reached at the LogIn page : "+" PASS ");
		
		WebElement userNameElement=driver.findElement(By.id("txtUsername"));
		userNameElement.sendKeys(username);

		WebElement passwordElement=driver.findElement(By.name("txtPassword"));
		passwordElement.sendKeys(password);

		WebElement logInButtonElement=driver.findElement(By.className("button"));
		logInButtonElement.click();
		
		
		String expectedUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
		WebElement welComeAdminElement=driver.findElement(By.id("welcome"));
		String actual_welComeAdminElementText=welComeAdminElement.getText();

		String expected_HomePageText="Admin";

		if(actual_welComeAdminElementText.contains(expected_HomePageText))
		{
		System.out.println(" Landed at HomePage Successfully - PASS");
		Cell testResultCell=sheetRow.createCell(7);
		testResultCell.setCellValue("Landed at HomePage Successfully - PASS");

		welComeAdminElement.click();

		// Thread.sleep(10000);

		WebElement logOutElement=driver.findElement(By.linkText("Logout"));
		logOutElement.click();

		
		
		}
		
		}
		else
		{
			File OrangeHRM_Login_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(OrangeHRM_Login_Screenshot,new File("E:\\GPK_WorkSpace\\Selenium\\OrangeHRM_ScreenshotsCaptured\\username_"+username+".png"));
		
			System.out.println(" Failed to land at the HomePage - FAIL");
		Cell testResultCell=sheetRow.createCell(7);
		testResultCell.setCellValue("Failed to land at the HomePage - FAIL");
		
		}
		}
		
		FileOutputStream file1 = new FileOutputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\OrangeHRM_LoginTestResultData.xlsx");
		workBook.write(file1);
		driver.quit();
		
        
        }
workBook.close();
		
	}

}
