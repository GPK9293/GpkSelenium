package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.Utility.Log;

public class OrangeHRMApplicationHomePage extends OrangeHRMApplicationLoginPage{
	
	
	// /html/body/div[1]/div[1]/a[1]/img
	@FindBy(xpath="/html/body/div[1]/div[1]/a[1]/img")
	WebElement OrangeHRM_HomePageImageL;
	
	// /html/body/div[1]/div[2]/ul/li[1]/a/b
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/a/b")
	WebElement OrangeHRM_HomePage_AdminL ;
	
	// /html/body/div[1]/div[2]/ul/li[2]/a/b
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[2]/a/b")
	WebElement OrangeHRM_HomePage_PimL;
	
	// /html/body/div[1]/div[2]/ul/li[3]/a/b
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[3]/a/b")
	WebElement OrangeHRM_HomePage_LeaveL;
	
	// /html/body/div[1]/div[1]/a[2]
	@FindBy(xpath = "/html/body/div[1]/div[1]/a[2]")
	WebElement OrangeHRM_HomePageWelcomeL;
	
	// /html/body/div[1]/div[1]/div[1]/ul/li[3]/a
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/ul/li[3]/a")
	WebElement OrangeHRM_LogoutL;
	
	
	////*[@id="welcome-menu"]/ul/li[3]/a
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")
	WebElement OrangeHRMApplication_AddEmployeeL;
	
	//*[@id="firstName"]
	
	@FindBy(id="firstName")
	WebElement firstNameL;
	
	//*[@id="middleName"]
	@FindBy(id="middleName")
	WebElement middlenameL;
	
	//*[@id="lastName"]
	@FindBy(id="lastName")
	WebElement lastNameL;
	
	// /html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input")
	WebElement submitL;
	
	public void OrangeHRM_HomePageImage() {
		
		Boolean image=OrangeHRM_HomePageImageL.isDisplayed();
		Assert.assertTrue(image, "OrangeHRM Application HomePage Image is not found");
		Log.info("OrangeHRM Application HomePage98 Image Element Identification Successfull");

		
	}
	public void OrangeHRM_HomePage_Admin() throws InterruptedException
	{
		String actualOHRM_HomePageAdminTextL=OrangeHRM_HomePage_AdminL.getText();
		String expectedOHRM_HomePageAdminTextL="Admin";
		OrangeHRM_HomePage_AdminL.click();
		Thread.sleep(2000);

		Assert.assertEquals(actualOHRM_HomePageAdminTextL, expectedOHRM_HomePageAdminTextL, "OrangeHRM Application HomePage Admin Text Element not Identifed ");
		Log.info("OrangeHRM Application Home Page Admin  Text identification is Succesfull");

	}

	public void OrangeHRM_HomePage_Pim(String firstName,String middleName, String lastName ) throws InterruptedException
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
		
		

		
		String expectedOrangeHRMHomePage_AddEmployee="Add Employee";
		String actualOrangeHRMHomePage_AddEmployee=OrangeHRMApplication_AddEmployeeL.getText();
		Assert.assertEquals(expectedOrangeHRMHomePage_AddEmployee, actualOrangeHRMHomePage_AddEmployee, "Add Employee page Element Not found");
			
		Log.info("Home Page Add Employee Functionality Elements Identified Succesfull");
	
		submitL.click();
	}


	public void OrangeHRM_HomePage_Welcome() throws InterruptedException
	{
		String actualOHRM_HomePageWelcomeTextL=OrangeHRM_HomePageWelcomeL.getText();
		String expectedOHRM_HomePageWelcomeTextL="Welcome Admin";
		Assert.assertEquals(actualOHRM_HomePageWelcomeTextL, expectedOHRM_HomePageWelcomeTextL, "OrangeHRM Application HomePage Welcome Text Element not Identifed ");
		OrangeHRM_HomePageWelcomeL.click();
		Thread.sleep(2000);

		OrangeHRM_LogoutL.click();
		Thread.sleep(2000);

		Log.info("OrangeHRM Application Home Page Welcome  Text identification is Succesfull");
		Log.info("OrangeHRM Application Home Page Logout  Element identification Succesfull");
	}

}
