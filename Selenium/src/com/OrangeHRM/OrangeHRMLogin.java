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

public class OrangeHRMLogin extends OrangeHRM_LoginPageValidation {
	
	@Test(priority=2)// giving priority to execute tests in an order
	public void OrangeHRM_Login() throws IOException
	{
		// initializing Excel 
		String path="./src/excel/AddEmployeeTestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		
		// Initializing Properties file
		String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
		FileInputStream proFile=new FileInputStream(fileSource);
		Properties pr=new Properties();
		pr.load(proFile);		
		
			//Importing username element property from property file 

            // <input name="txtUsername" id="txtUsername" type="text">
            By loginPageUsernamePropertyL=By.id(pr.getProperty("LoginPageUsernamePropertyById"));
            WebElement usernameElement=driver.findElement(loginPageUsernamePropertyL);
            // importing username data from excel
            Cell cell6=row.getCell(6);
            String usernameData=cell6.getStringCellValue();
            usernameElement.sendKeys(usernameData);
            // importing password element property from property file
            // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
            
            By LoginPagePasswordPropertyL=By.id(pr.getProperty("LoginPagePasswordPropertyById"));
            WebElement passwordElement=driver.findElement(LoginPagePasswordPropertyL);
            
            // importing password data from excel
            Cell cell7=row.getCell(7);
            String passwordData=cell7.getStringCellValue();
           passwordElement.sendKeys(passwordData);
                        
            // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
           
           // importing login element property from properties file
           By loginButtonpropertyL=By.className(pr.getProperty("LoginPageLoginButtonPropertyByClassName"));
          WebElement loginButton=driver.findElement(loginButtonpropertyL);
          loginButton.click();
		 
		// saving the excel file
		FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
	
			workbook.write(file1);
	}
}
