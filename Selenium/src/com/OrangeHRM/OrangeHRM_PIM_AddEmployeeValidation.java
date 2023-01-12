package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeHRM_PIM_AddEmployeeValidation extends OrangeHRM_HomePageValidation{

	@Test(priority=4)// giving priority to execute tests in an order
	public void PIM_Validation() throws IOException
	{
		String path="./src/excel/AddEmployeeTestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
			Row row=sheet.getRow(1);
		
			String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
			FileInputStream proFile=new FileInputStream(fileSource);
			Properties pr=new Properties();
			pr.load(proFile);
				
			
				// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
				By homePagePIM_PropertyByIdL=By.id(pr.getProperty("HomePagePIM_PropertyById"));
				WebElement homePagePIM_Element=driver.findElement(homePagePIM_PropertyByIdL);
				Actions act=new Actions(driver);
				act.moveToElement(homePagePIM_Element).build().perform();
				Cell cell11=row.getCell(11);
				String expected_AddEmployeePageText=cell11.getStringCellValue();
				System.out.println("Expected Home Page Add Employee Text is : "+expected_AddEmployeePageText);
				
				// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a> 
				By homePageAddEmployeeElement=By.id(pr.getProperty("HomePageAddEmployeePropertyById"));
				WebElement homePageAddEmployee=driver.findElement(homePageAddEmployeeElement);

				String actualhomePageAddEmployeeText=homePageAddEmployee.getText();
				Cell cell12=row.createCell(12);
				cell12.setCellValue(actualhomePageAddEmployeeText);
				System.out.println("Actual Home Page Add Employee Text is : "+actualhomePageAddEmployeeText);
				if(actualhomePageAddEmployeeText.equals(expected_AddEmployeePageText))
				{

					String addEmployeePassResult="Succesfully Landed at Add Employee Page";
					System.out.println(addEmployeePassResult);
					Cell cell13=row.createCell(13);
					cell13.setCellValue(addEmployeePassResult);
			        

				}
		else
		{
			String addEmployeeFailResult="Failed to Land at Add Employee Page";
			System.out.println(addEmployeeFailResult);
			Cell cell13=row.createCell(13);
			cell13.setCellValue(addEmployeeFailResult);

		}
		System.out.println();


				FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
				
				workbook.write(file1); 
}
}