package com.OrangeHRMApplicationPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMApplication_HomePage_AddEmployee extends OrangeHRMApplicationLoginPage{
	
	OrangeHRMApplicationHomePage OAHPE;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[2]/a/b")
	WebElement OrangeHRM_HomePAge_PimL;
	
	
	////*[@id="welcome-menu"]/ul/li[3]/a
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	WebElement OrangeHRMApplication_AddEmployee;
	
	//*[@id="firstName"]
	
	@FindBy(id="firstName")
	WebElement firstNameL;
	
	//*[@id="middleName"]
	@FindBy(id="middleName")
	WebElement middlenameL;
	
	//*[@id="lastName"]
	@FindBy(id="lastName")
	WebElement lastNameL;
	
	// /html/body/div[1]/div[2]/ul/li[2]/a/b
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[2]/a/b")
	WebElement OrangeHRM_HomePage_PimL;
	
	 

	////*[@id="welcome-menu"]/ul/li[3]/a
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")
	WebElement OrangeHRMApplication_AddEmployeeL;
	
	
	// /html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input")
	WebElement submitL;
	
	
	// <input class="duplexBox" type="file" name="photofile" id="photofile">
	// /html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input
	//@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input")
	@FindBy(id = "photofile")
	WebElement imageuploadL;
	
	
	public void OrangeHRMApplication_HomePage_AddEmployeePage(String firstName,String middleName, String lastName ) throws InterruptedException, IOException
	{
		
		String actualOHRM_HomePagePIMTextL=OrangeHRM_HomePage_PimL.getText();
		String expectedOHRM_HomePagePIMTextL="PIM";
		OrangeHRM_HomePage_PimL.click();
		Thread.sleep(2000);
		Assert.assertEquals(actualOHRM_HomePagePIMTextL, expectedOHRM_HomePagePIMTextL, "OrangeHRM Application HomePage PIM Text Element not Identifed ");
		Log.info("OrangeHRM Application Home Page PIM  Text identification is Succesfull");
		OrangeHRMApplication_AddEmployeeL.click();		
		firstNameL.sendKeys(firstName);
		middlenameL.sendKeys(middleName);
		lastNameL.sendKeys(lastName);

		imageuploadL.click();
	//	Runtime.getRuntime().exec("E:\\GPK_WorkSpace\\OrangeHRM_Application_POM\\AutoIT\\AutoIT_POM.exe");
		
		Thread.sleep(2000);


		
		String expectedOrangeHRMHomePage_AddEmployee="Add Employee";
		String actualOrangeHRMHomePage_AddEmployee=OrangeHRMApplication_AddEmployeeL.getText();
		Assert.assertEquals(expectedOrangeHRMHomePage_AddEmployee, actualOrangeHRMHomePage_AddEmployee, "Add Employee page Element Not found");
			
		Log.info("Home Page Add Employee Functionality Elements Identified Succesfull");
	
		submitL.click();
	}


}
