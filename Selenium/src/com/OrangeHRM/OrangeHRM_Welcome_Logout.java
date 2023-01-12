package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHRM_Welcome_Logout extends OrangeHRM_AddEmployee {
	@Test(priority=6)
	public void HomePageLogout() throws IOException
	{
		System.out.println();
		String path="./src/excel/AddEmployeeTestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
			Row row=sheet.getRow(1);
		
			String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
			FileInputStream proFile=new FileInputStream(fileSource);
			Properties pr=new Properties();
			pr.load(proFile);
		
			By welcomAdminPropertyL=By.id(pr.getProperty("HomePageWelcomeAdminPropertyById"));

			WebElement welcomAdminElement=driver.findElement(welcomAdminPropertyL);
			
		welcomAdminElement.click();
		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		By logoutElementL=By.linkText(pr.getProperty("HomePageLogoutPropertyByLinkText"));
		WebElement logoutElementProperty=driver.findElement(logoutElementL);
		logoutElementProperty.click();
		
		
		By loginPanelL=By.id(pr.getProperty("LogInPanelHeadingPropertyById"));
		 WebElement loginPanelElement=driver.findElement(loginPanelL);
		 String actualLoginPanelText=loginPanelElement.getText();
		 Cell cell28=row.getCell(28);
		String expectedloginPanelText=cell28.getStringCellValue();
		System.out.println("Expected Login Page Text is "+expectedloginPanelText);
		Cell cell29=row.createCell(29);
		cell29.setCellValue(actualLoginPanelText);
		System.out.println("Actual Login Page Text is "+actualLoginPanelText);
		
		
		if(actualLoginPanelText.equals(expectedloginPanelText))
		{
			String loginPageTextSuccessResult="Both Actual and Expected Text of Login Page are equal";
			System.out.println(loginPageTextSuccessResult);
			Cell cell30=row.createCell(30);
			cell30.setCellValue(loginPageTextSuccessResult);
		}

			else
			{
				String loginPageTextFailResult="Fail to land at Login Page";
				System.out.println(loginPageTextFailResult);
				Cell cell30=row.createCell(30);
				cell30.setCellValue(loginPageTextFailResult);	
			}
	
	FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
	
	workbook.write(file1);  
}
}
