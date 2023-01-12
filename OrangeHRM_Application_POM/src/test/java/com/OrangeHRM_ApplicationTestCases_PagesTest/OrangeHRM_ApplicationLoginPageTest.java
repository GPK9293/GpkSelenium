package com.OrangeHRM_ApplicationTestCases_PagesTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplicationLoginPage;
import com.Utility.Log;

public class OrangeHRM_ApplicationLoginPageTest extends BaseTest{
	
	OrangeHRMApplicationLoginPage OALP;
	@Test(priority=1)
	public void OHRM_LoginPageImageValidationTest()
	{
		OALP=new OrangeHRMApplicationLoginPage();
		OALP.OrangeHRM_LogInPageImageValidation();
		Log.info("OrangeHRM Application LogIn Page Image validation is Succesfull");
	}
	@Test(priority=2)
	public void OHRM_LoginPageTextValidationTest()
	{
		OALP=new OrangeHRMApplicationLoginPage();
		OALP.OrangeHRM_LogInPageTextValidation();
		Log.info("OrangeHRM Application LogIn Page Text validation is Succesfull");
	}
	
	@Test(priority=3)
	public void OHRM_LoginPageLogInValidationTest()
	{
		OALP=new OrangeHRMApplicationLoginPage();
		OALP.OrangeHRM_LogInPageLogInValidation("GPK9293","Gpk@9293");
		Log.info("OrangeHRM Application LogIn functionality is Succesfull");
	}

}
