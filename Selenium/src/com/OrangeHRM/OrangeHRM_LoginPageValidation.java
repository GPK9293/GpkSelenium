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

public class OrangeHRM_LoginPageValidation extends BaseTestOrangeHRM{

	@Test(priority=1)// giving priority to execute tests in an order
	public void OrangeHRM_LoginPageAndTitleValidation() throws IOException
	{
		// initializing Excel 
		String path="./src/excel/AddEmployeeTestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		// Importing expected login panel text from excel
			Row row=sheet.getRow(1);
			Cell cell=row.getCell(0);
			String expectedLoginPanel=cell.getStringCellValue();
			
			// Initializing Properties file
			
			// <div id="logInPanelHeading">LOGIN Panel</div>
			
			String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
			FileInputStream proFile=new FileInputStream(fileSource);
			Properties pr=new Properties();
			pr.load(proFile);
			
			//Importing login panel element property from property file 
			By loginPanelL=By.id(pr.getProperty("LogInPanelHeadingPropertyById"));
			WebElement loginPanelElement=driver.findElement(loginPanelL);
			String actualLoginpanel=loginPanelElement.getText();
			
			// importing Expected Login Title from excel 
			
			Cell cell3=row.getCell(3);
			String expected_LoginPageTitle=cell3.getStringCellValue();
			String actual_LoginPageTitle=driver.getTitle();
			System.out.println("Expected Login page Title is : "+expected_LoginPageTitle);
			System.out.println("Actual Login page title is : "+actual_LoginPageTitle);
			
			// exporting actual Login page title to excel
			Cell cell4=row.createCell(4);
			cell4.setCellValue(actual_LoginPageTitle);
		if(actual_LoginPageTitle.equalsIgnoreCase(expected_LoginPageTitle))
		
		   {
			// exporting Login page title Success result to excel
			String loginPageTitleResult="Both Actual and Expected Titles of Login Page are equal";
			System.out.println(loginPageTitleResult);
			Cell cell5=row.createCell(5);
			cell5.setCellValue(loginPageTitleResult);

	     	}
		else
		{
			String loginPageTitleResult="Both Actual and Expected Titles of Login Page are not equal";
			Cell cell5=row.createCell(5);
			cell5.setCellValue(loginPageTitleResult);
			// exporting Login page title Success result to excel


		}
		
		// exporting actual Login panel text to excel
		Cell cell1=row.createCell(1);
		cell1.setCellValue(actualLoginpanel);
		
		if(actualLoginpanel.equals(expectedLoginPanel))
		{
			
			String loginPageResult="Succesfully Landed at Login Page";

			System.out.println(loginPageResult);
			// exporting Login Page Success result to excel
			Cell cell2=row.createCell(2);
            cell2.setCellValue(loginPageResult);
          
		}
      	else
		{
			String loginPageFailResult="Fail to Landed at Login Page";
			System.out.println(loginPageFailResult);

			//  exporting Login Page Fail result to excel
			Cell cell2=row.createCell(2);
            cell2.setCellValue(loginPageFailResult);
			
		}
		System.out.println();
		// saving the excel file
		
		FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
	
			workbook.write(file1);
	}
}
