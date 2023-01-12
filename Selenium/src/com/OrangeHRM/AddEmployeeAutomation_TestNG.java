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
import org.openqa.selenium.interactions.Actions;

public class AddEmployeeAutomation_TestNG extends BaseTestOrangeHRM {
	
	public void AddEmployeeAutomationTestNG () throws IOException
	{
		String path="./src/excel/AddEmployeeTestData.xlsx";
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
			System.out.println(expected_LoginPageTitle);
			System.out.println(actual_LoginPageTitle);
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
			System.out.println();

			System.out.println(loginPageResult);
			Cell cell2=row.createCell(2);
            cell2.setCellValue(loginPageResult);
            // <input name="txtUsername" id="txtUsername" type="text">
            By loginPageUsernamePropertyL=By.id(pr.getProperty("LoginPageUsernamePropertyById"));
            WebElement usernameElement=driver.findElement(loginPageUsernamePropertyL);
            Cell cell6=row.getCell(6);
            String usernameData=cell6.getStringCellValue();
            usernameElement.sendKeys(usernameData);
            
            // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
            
            By LoginPagePasswordPropertyL=By.id(pr.getProperty("LoginPagePasswordPropertyById"));
            WebElement passwordElement=driver.findElement(LoginPagePasswordPropertyL);
            Cell cell7=row.getCell(7);
            String passwordData=cell7.getStringCellValue();
           passwordElement.sendKeys(passwordData);
                        
            // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
           
           By loginButtonpropertyL=By.className(pr.getProperty("LoginPageLoginButtonPropertyByClassName"));
          WebElement loginButton=driver.findElement(loginButtonpropertyL);
          loginButton.click();
          String actualHomepageURl=driver.getCurrentUrl();
          String expectedHomePageURl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
          
        if(actualHomepageURl.equals(expectedHomePageURl))
       {
        	  
         // <a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
          Cell cell8=row.getCell(8);
			String expectedHomePageText=cell8.getStringCellValue();
			By welcomAdminPropertyL=By.id(pr.getProperty("HomePageWelcomeAdminPropertyById"));

			WebElement welcomAdminElement=driver.findElement(welcomAdminPropertyL);
			String actualHomePageText=welcomAdminElement.getText();
			Cell cell9=row.createCell(9);
			cell9.setCellValue(actualHomePageText);
			
			System.out.println("Actual Home Page Text is "+actualHomePageText);
			System.out.println("Expected Home Page Text is "+expectedHomePageText);
			
			if(actualHomePageText.contains(expectedHomePageText)) 
			{
				String homePageSuccessText="Successfully Landed at HomePage";

				System.out.println(homePageSuccessText);
				System.out.println();

				Cell cell10=row.createCell(10);
				cell10.setCellValue(homePageSuccessText);
				
				// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
				By homePagePIM_PropertyByIdL=By.id(pr.getProperty("HomePagePIM_PropertyById"));
				WebElement homePagePIM_Element=driver.findElement(homePagePIM_PropertyByIdL);
				Actions act=new Actions(driver);
				act.moveToElement(homePagePIM_Element).build().perform();
				
				// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a> 
				By homePageAddEmployeeElement=By.id(pr.getProperty("HomePageAddEmployeePropertyById"));
				WebElement homePageAddEmployee=driver.findElement(homePageAddEmployeeElement);
				homePageAddEmployee.click();
				// <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
				
				By addEmployeeFirstNamePropertyByNameL=By.className(pr.getProperty("AddEmployeeFirstNamePropertyByName"));
				WebElement addEmployeeFirstNameElement=driver.findElement(addEmployeeFirstNamePropertyByNameL);
				Cell cell14=row.getCell(14);
				String addEmployeeFirstNameData=cell14.getStringCellValue();
				addEmployeeFirstNameElement.sendKeys(addEmployeeFirstNameData);
				
				// <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
				By addEmployeeMiddleNamePropertyByNameL=By.className(pr.getProperty("AddEmployeeMiddleNamePropertyByName"));
				WebElement addEmployeeMiddleNameElement=driver.findElement(addEmployeeMiddleNamePropertyByNameL);
				Cell cell15=row.getCell(15);
				String addEmployeeMiddleNameData=cell15.getStringCellValue();
				addEmployeeMiddleNameElement.sendKeys(addEmployeeMiddleNameData);
				
				
				// <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
				By addEmployeeLastNamePropertyByNameL=By.className(pr.getProperty("AddEmployeeLastNamePropertyByName"));
				WebElement addEmployeeLastNameElement=driver.findElement(addEmployeeLastNamePropertyByNameL);
				Cell cell16=row.getCell(16);
				String addEmployeeLastNameData=cell16.getStringCellValue();
				addEmployeeLastNameElement.sendKeys(addEmployeeLastNameData);
				
				
				// <input class="formInputText" maxlength="10" type="text" name="employeeId" value="0072" id="employeeId">
				
				By addEmployeeIdPropertyL=By.id(pr.getProperty("AddEmployeeIdPropertyById"));
				WebElement addEmployeeIdElement=driver.findElement(addEmployeeIdPropertyL);
				String addEmployeeIdNumber=addEmployeeIdElement.getText();
				Cell cell17=row.createCell(17);
				cell17.setCellValue(addEmployeeIdNumber);
			
				
				welcomAdminElement.click();
				// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
				By logoutElementL=By.linkText(pr.getProperty("HomePageLogoutPrropertyByLinkText"));
				WebElement logoutElementProperty=driver.findElement(logoutElementL);
				logoutElementProperty.click();
				
				
				
				 loginPanelL=By.id(pr.getProperty("LogInPanelHeadingPropertyById"));
				 loginPanelElement=driver.findElement(loginPanelL);
				 String actualLoginPanelText=loginPanelElement.getText();
				 Cell cell11=row.getCell(11);
				String expectedloginPanelText=cell11.getStringCellValue();
				System.out.println("Expected Login Page Text is "+expectedloginPanelText);
				Cell cell12=row.createCell(12);
				cell12.setCellValue(actualLoginPanelText);
				System.out.println("Actual Login Page Text is "+actualLoginPanelText);
				
				
				if(actualLoginPanelText.equals(expectedloginPanelText))
				{
					String loginPageTextSuccessResult="Both Actual and Expected Text of Login Page are equal";
					System.out.println(loginPageTextSuccessResult);
					Cell cell13=row.createCell(13);
					cell13.setCellValue(loginPageTextSuccessResult);
				}

					else
					{
						String loginPageTextFailResult="Fail to land at Login Page";
						System.out.println(loginPageTextFailResult);
						Cell cell13=row.createCell(13);
						cell13.setCellValue(loginPageTextFailResult);	
					}
			}
			else
			{
				
				
				
			}
            }
			
			else
			{
				String homePageFailText="Wrong Credintials enetered Fail to Land at HomePage ";
				Cell cell10=row.createCell(10);
				cell10.setCellValue(homePageFailText);
				System.out.println(homePageFailText);
			}
			
	     	}
        
        
		
		else
		{
			String loginPageFailResult="Fail to Landed at Login Page";
			System.out.println(loginPageFailResult);
			Cell cell2=row.createCell(2);
            cell2.setCellValue(loginPageFailResult);
			
		}
		
		System.out.println("*********************************************************");
		
		FileOutputStream file1 = new FileOutputStream("./src/excel/AddEmployeeTestData.xlsx");
		workbook.write(file1);
		


	}

}
