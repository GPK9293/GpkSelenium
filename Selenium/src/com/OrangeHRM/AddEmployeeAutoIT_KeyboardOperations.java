package com.OrangeHRM;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class AddEmployeeAutoIT_KeyboardOperations extends BaseTestOrangeHRM  {
@SuppressWarnings("deprecation")
@Test(priority=1)
	public void AddEmployeeAutomationTestNG () throws IOException, InterruptedException
		{
				// <div id="logInPanelHeading">LOGIN Panel</div>
				String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\OrangeHRM_PropertiesFile\\OrangeHRM.properties";
				FileInputStream proFile=new FileInputStream(fileSource);
				Properties pr=new Properties();
				pr.load(proFile);
				 				
	            // <input name="txtUsername" id="txtUsername" type="text">
	            By loginPageUsernamePropertyL=By.id(pr.getProperty("LoginPageUsernamePropertyById"));
	            WebElement usernameElement=driver.findElement(loginPageUsernamePropertyL);
	            String usernameData="GPK9293";
	            usernameElement.sendKeys(usernameData);
	            
	            // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	            
	            By LoginPagePasswordPropertyL=By.id(pr.getProperty("LoginPagePasswordPropertyById"));
	            WebElement passwordElement=driver.findElement(LoginPagePasswordPropertyL);
	            
	            String passwordData="Gpk@9293";
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
					
					By addEmployeeFirstNamePropertyByNameL=By.name(pr.getProperty("AddEmployeeFirstNamePropertyByName"));
					WebElement addEmployeeFirstNameElement=driver.findElement(addEmployeeFirstNamePropertyByNameL);
					
					addEmployeeFirstNameElement.sendKeys("Gonnabathula");
					
					// Performing Tab Key Keyboard operations
					 act=new Actions(driver);
					act.sendKeys(Keys.TAB).build().perform();
					// automating first name
					act.sendKeys("Prasanna").build().perform();
					// automating middle name
					act.sendKeys(Keys.TAB).build().perform();
					// automating last name
					act.sendKeys("Kumar").build().perform();
					// focus to employee id
					act.sendKeys(Keys.TAB).build().perform();

					// focus to photograph
					act.sendKeys(Keys.TAB).build().perform();
					
					Thread.sleep(5000);

					// click on photograph element performing keyboard operation--ENTER key
					act.sendKeys(Keys.ENTER).build().perform();
					Thread.sleep(5000);
					Runtime.getRuntime().exec("E:\\GPK_WorkSpace\\Selenium\\AutoITScripts\\pic1.exe");
					Thread.sleep(40000);
				
	       }		
				
	}

}
