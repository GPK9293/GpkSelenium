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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class OrangeHRM_AddEmployee extends OrangeHRM_PIM_AddEmployeeValidation
{
@SuppressWarnings("deprecation")
@Test(priority=5)// giving priority to execute tests in an order
public void OrangeHRMAddEmployee() throws IOException, InterruptedException
{
		
	// <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	// initializing excel file
	String path="./src/excel/AddEmployeeTestData.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	// getting last row of the sheet in excel file
	    int rowCount=sheet.getLastRowNum();
	    for(int i=1;i<=rowCount; i++) 
	    {
		Row row=sheet.getRow(i);
	
		// initializing properties file
		String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
		FileInputStream proFile=new FileInputStream(fileSource);
		Properties pr=new Properties();
		pr.load(proFile);
			// importing add employee element from property
		By homePageAddEmployeeElement=By.id(pr.getProperty("HomePageAddEmployeePropertyById"));
		WebElement homePageAddEmployee=driver.findElement(homePageAddEmployeeElement);
		homePageAddEmployee.click();

			By addEmployeeFirstNamePropertyByNameL=By.name(pr.getProperty("AddEmployeeFirstNamePropertyByName"));
			WebElement addEmployeeFirstNameElement=driver.findElement(addEmployeeFirstNamePropertyByNameL);
			Cell cell14=row.getCell(14);
			String expectedEmployeeFirstNameData=cell14.getStringCellValue();
			addEmployeeFirstNameElement.sendKeys(expectedEmployeeFirstNameData);
			System.out.println(expectedEmployeeFirstNameData);
			
			// <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
			By addEmployeeMiddleNamePropertyByNameL=By.name(pr.getProperty("AddEmployeeMiddleNamePropertyByName"));
			WebElement addEmployeeMiddleNameElement=driver.findElement(addEmployeeMiddleNamePropertyByNameL);
			Cell cell15=row.getCell(15);
			String expectedEmployeeMiddleNameData=cell15.getStringCellValue();
			addEmployeeMiddleNameElement.sendKeys(expectedEmployeeMiddleNameData);
			System.out.println(expectedEmployeeMiddleNameData);
			
			// <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
			By addEmployeeLastNamePropertyByNameL=By.name(pr.getProperty("AddEmployeeLastNamePropertyByName"));
			WebElement addEmployeeLastNameElement=driver.findElement(addEmployeeLastNamePropertyByNameL);
			Cell cell16=row.getCell(16);
			String expectedEmployeeLastNameData=cell16.getStringCellValue();
			addEmployeeLastNameElement.sendKeys(expectedEmployeeLastNameData);
			System.out.println(expectedEmployeeLastNameData);
			// <input class="duplexBox" type="file" name="photofile" id="photofile">
			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.TAB).build().perform();

			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(5000);
			Runtime.getRuntime().exec("E:\\GPK_WorkSpace\\Selenium\\AutoITScripts\\Gonnabathula.exe");
			
			

			
			
			// <input class="formInputText" maxlength="10" type="text" name="employeeId" value="0072" id="employeeId">
			
			By addEmployeeIdPropertyL=By.id(pr.getProperty("AddEmployeeIdPropertyById"));
			WebElement addEmployeeIdElement=driver.findElement(addEmployeeIdPropertyL);
			String expectedEmployeeIdNumber=addEmployeeIdElement.getAttribute("value");
			Cell cell17=row.createCell(17);
			cell17.setCellValue(expectedEmployeeIdNumber);
		
			// 	<input type="button" class="" id="btnSave" value="Save">
			By AddEmployeeSaveButtonPropertyByIdL=By.id(pr.getProperty("AddEmployeeSaveButtonPropertyById"));
			WebElement addEmployeeSaveButtonElement=driver.findElement(AddEmployeeSaveButtonPropertyByIdL);
			addEmployeeSaveButtonElement.click();
			// <input value="G" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
			// <input value="Prasanna" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
			// <input value="Kumar" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
			// <input value="0073" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		
			
			// Personal Details Text Start 		

			Cell cell20=row.getCell(20);
			
			String expectedPersonalDetailsPageText=cell20.getStringCellValue();
			System.out.println("expected Employee Personal Details Text is : "+expectedPersonalDetailsPageText);

			// <h1>Personal Details</h1>
			// //*[@id="pdMainContainer"]/div[1]/h1
			// /html/body/div[1]/div[3]/div/div[2]/div[1]/h1
			By actualPersonalDetailsPageTextL=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
			WebElement actualPersonalDetailsPageTextElement=driver.findElement(actualPersonalDetailsPageTextL);
			String actualPersonalDetailsPageText=actualPersonalDetailsPageTextElement.getText();
			System.out.println("Actual Employee Personal Details Text is : "+actualPersonalDetailsPageText);

			Cell cell21=row.createCell(21);
			cell21.setCellValue(actualPersonalDetailsPageText);
			
			if(actualPersonalDetailsPageText.equals(expectedPersonalDetailsPageText))
			{
				System.out.println("Successfully Landed at Employee Personal Details Page");

					
				By PersonalDetailsEmployeeIdpropertyL=By.id(pr.getProperty("PersonalDetailsEmployeeIdpropertyById"));
				WebElement PersonalDetailsEmployeeIdElement=driver.findElement(PersonalDetailsEmployeeIdpropertyL);
				String actualPersonalDetailsEmployeeIdNumber=PersonalDetailsEmployeeIdElement.getAttribute("value");
				Cell cell18=row.createCell(18);
				cell18.setCellValue(actualPersonalDetailsEmployeeIdNumber);
				System.out.println(actualPersonalDetailsEmployeeIdNumber);
				if(actualPersonalDetailsEmployeeIdNumber.equals(expectedEmployeeIdNumber))
				{
					String employeeIdPass="Actual and Expected Employee Id is Equal";
					System.out.println(employeeIdPass);
					Cell cell19=row.createCell(19);
					cell19.setCellValue(employeeIdPass);
				}
				else
				{
					String employeeIdFail="Actual and Expected Employee Id are not Equal";
					System.out.println(employeeIdFail);
					Cell cell19=row.createCell(19);
					cell19.setCellValue(employeeIdFail);
				}
				
				
				// personal details employee First name
				
				By PersonalDetailsEmployeeFirstnamepropertyL=By.id(pr.getProperty("PersonalDetailsEmployeeFirstnamepropertyById"));
				WebElement PersonalDetailsEmployeeFirstnameElement=driver.findElement(PersonalDetailsEmployeeFirstnamepropertyL);
				String actualPersonalDetailsEmployeeFirstnameText=PersonalDetailsEmployeeFirstnameElement.getAttribute("value");
				Cell cell22=row.createCell(22);
				cell22.setCellValue(actualPersonalDetailsEmployeeFirstnameText);
				System.out.println(actualPersonalDetailsEmployeeFirstnameText);
				if(actualPersonalDetailsEmployeeFirstnameText.equals(expectedEmployeeFirstNameData))
				{
					String firstNamePass="Actual and Expected Employee First Name is Equal";
					System.out.println(firstNamePass);
					Cell cell23=row.createCell(23);
					cell23.setCellValue(firstNamePass);
				}
				else
				{
					String firstNameFail="Actual and Expected Employee First Name are not Equal";
					System.out.println(firstNameFail);
					Cell cell23=row.createCell(23);
					cell23.setCellValue(firstNameFail);
				}
				
				System.out.println();
				// personal details employee Middle name
						
						By PersonalDetailsEmployeeMiddlenamepropertyL=By.id(pr.getProperty("PersonalDetailsEmployeeMiddlenamepropertyById"));
						WebElement PersonalDetailsEmployeeMiddlenameElement=driver.findElement(PersonalDetailsEmployeeMiddlenamepropertyL);
						String actualPersonalDetailsEmployeeMiddlenameText=PersonalDetailsEmployeeMiddlenameElement.getAttribute("value");
						Cell cell24=row.createCell(24);
						cell24.setCellValue(actualPersonalDetailsEmployeeMiddlenameText);
						System.out.println(actualPersonalDetailsEmployeeMiddlenameText);
						if(actualPersonalDetailsEmployeeMiddlenameText.equals(expectedEmployeeMiddleNameData))
						{
							String middleNamePass="Actual and Expected Employee Middle Name is Equal";
							System.out.println(middleNamePass);
							Cell cell25=row.createCell(25);
							cell25.setCellValue(middleNamePass);
						}
						else
						{
							String middleNameFail="Actual and Expected Employee Middle Name are not Equal";
							System.out.println(middleNameFail);
							Cell cell25=row.createCell(25);
							cell25.setCellValue(middleNameFail);
						}
				
						System.out.println();
						
											
						
						
				
						// personal details employee last name
						
						By PersonalDetailsEmployeeLastnamepropertyL=By.id(pr.getProperty("PersonalDetailsEmployeeLastnamepropertyById"));
						WebElement PersonalDetailsEmployeeLastnameElement=driver.findElement(PersonalDetailsEmployeeLastnamepropertyL);
						String actualPersonalDetailsEmployeeLastnameText=PersonalDetailsEmployeeLastnameElement.getAttribute("value");
						Cell cell26=row.createCell(26);
						cell26.setCellValue(actualPersonalDetailsEmployeeLastnameText);
						System.out.println(actualPersonalDetailsEmployeeLastnameText);
						if(actualPersonalDetailsEmployeeLastnameText.equals(expectedEmployeeLastNameData))
						{
							String lastNamePass="Actual and Expected Employee Last Name is Equal";
							System.out.println(lastNamePass);
							Cell cell27=row.createCell(27);
							cell27.setCellValue(lastNamePass);
						}
						else
						{
							String lastNameFail="Actual and Expected Employee Last Name are not Equal";
							System.out.println(lastNameFail);
							Cell cell27=row.createCell(27);
							cell27.setCellValue(lastNameFail);
						}
						// AutoIT Implementation
						
								
			}
					
		
			}
	    
			
		
		// saving the excel file

		FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
		
		workbook.write(file1);  
 }

}