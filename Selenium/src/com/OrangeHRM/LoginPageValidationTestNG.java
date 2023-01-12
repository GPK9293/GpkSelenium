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

public class LoginPageValidationTestNG extends BaseTestOrangeHRM {
@Test
public void loginPageValidation() throws IOException
{
	String path="./src/excel/LogInTest.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String expectedLoginPanel=cell.getStringCellValue();
		
		
		// <div id="logInPanelHeading">LOGIN Panel</div>
		String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
		FileInputStream proFile=new FileInputStream(fileSource);
		Properties pr=new Properties();
		pr.load(proFile);
		By loginPanelL=By.id(pr.getProperty("LogInPanelHeadingPropertyById"));
		WebElement loginPanelElement=driver.findElement(loginPanelL);
		String actualLoginpanel=loginPanelElement.getText();
		
		Cell cell3=row.getCell(3);
		String expected_LoginPageTitle=cell3.getStringCellValue();
		String actual_LoginPageTitle=driver.getTitle();
		System.out.println("Expected Login page Title is : "+expected_LoginPageTitle);
		System.out.println("Actual Login page title is : "+actual_LoginPageTitle);
		Cell cell4=row.createCell(4);
		cell4.setCellValue(actual_LoginPageTitle);
	if(actual_LoginPageTitle.equalsIgnoreCase(expected_LoginPageTitle))
	
	   {
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


	}
	Cell cell1=row.createCell(1);
	cell1.setCellValue(actualLoginpanel);
	if(actualLoginpanel.equals(expectedLoginPanel))
	{
		
		String loginPageResult="Succesfully Landed at Login Page";

		System.out.println(loginPageResult);
		Cell cell2=row.createCell(2);
        cell2.setCellValue(loginPageResult);
      
	}
  	else
	{
		String loginPageFailResult="Fail to Landed at Login Page";
		System.out.println(loginPageFailResult);

		Cell cell2=row.createCell(2);
        cell2.setCellValue(loginPageFailResult);
		
	}
	System.out.println();
	
	FileOutputStream file1 = new FileOutputStream("./src/excel/LogInTest.xlsx");

		workbook.write(file1);
}

}
