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

public class OrangeHRM_HomePageValidation extends OrangeHRMLogin {
	
	@Test(priority=3)// giving priority to execute tests in an order
	public void HomePageValidation() throws IOException
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
			  
	   // <a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
	  
			// importing expected home page welcome element property from properties file
		    Cell cell8=row.getCell(8);
			String expectedHomePageText=cell8.getStringCellValue();
			By welcomAdminPropertyL=By.id(pr.getProperty("HomePageWelcomeAdminPropertyById"));

			WebElement welcomAdminElement=driver.findElement(welcomAdminPropertyL);
			String actualHomePageText=welcomAdminElement.getText();
			// exporting actual home page text to excel
			Cell cell9=row.createCell(9);
			cell9.setCellValue(actualHomePageText);
			
			System.out.println("Actual Home Page Text is : "+actualHomePageText);
			System.out.println("Expected Home Page Text is : "+expectedHomePageText);
			
			if(actualHomePageText.contains(expectedHomePageText)) 
			{
				
				String homePageSuccessText="Successfully Landed at HomePage";

				System.out.println(homePageSuccessText);
				System.out.println();

				// exporting home page success text to excel
				Cell cell10=row.createCell(10);
				cell10.setCellValue(homePageSuccessText);
		
			}
			else
					{
						String homePageFailText="Fail to Land at HomePage";

						System.out.println(homePageFailText);
						System.out.println();

						// exporting home page fail text to excel
						Cell cell10=row.createCell(10);
						cell10.setCellValue(homePageFailText);
					}
						
					System.out.println();
					
					// saving the excel file

					FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
					
					workbook.write(file1);  
			 }
}
