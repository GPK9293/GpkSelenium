package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMApplicationLoginPage  extends BaseTest{
public  OrangeHRMApplicationLoginPage()    //when class name is similiar to method name then it is called a constructor
	
	{
	
		PageFactory.initElements(driver, this);
	}

	
	//object Repository class
	//information about elements present in webpage
	//bussiness logics /userdefined methods for perform the operations3
	//identification of elements prsents is OHRM LoginPage
	

// /html/body/div[1]/div/div[2]/div/img
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement OrangeHRM_LogInPageImageL;
	
	// <div id="logInPanelHeading">LOGIN Panel</div>
	@FindBy(id = "logInPanelHeading")
	WebElement OrangeHRM_LogInPageTextL;
	
	//*[@id="txtUsername"]
	
	
	@FindBy(id ="txtUsername")
	WebElement UsernameL;
	
	
//*[@id="txtPassword"]
	@FindBy(id="txtPassword")
	WebElement PasswordL;
	//*[@id="btnLogin"]
	
	@FindBy(className="button")
	
	WebElement LogInButtonL;
	
	public void OrangeHRM_LogInPageImageValidation()
	{
		
		Boolean flag=OrangeHRM_LogInPageImageL.isDisplayed();
		Assert.assertTrue(flag, "OrangeHRM Application LogInPage Image is not found");
		Log.info("OrangeHRM Application LogInPage Image Element Identification Successfull");
	}
	public void OrangeHRM_LogInPageTextValidation()
	{
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		String actual_OrangeHRMApplicationLogInPageText=OrangeHRM_LogInPageTextL.getText();
		Assert.assertEquals(actual_OrangeHRMApplicationLogInPageText, expected_OrangeHRMApplicationLogInPageText,"OrangeHRM Application LogInPage Text not Found");
		Log.info("OrangeHRM Application LogInPage Text Element Identifed Successfull");
	}
	public void OrangeHRM_LogInPageLogInValidation(String userName,String password)
	{
		UsernameL.sendKeys(userName);
		PasswordL.sendKeys(password);
		LogInButtonL.click();
		Log.info("LogIn Page LogIn Functionality Elements Identified");
		
	}
	
}
