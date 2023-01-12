package com.OrangeHRM_ApplicationTestCases_PagesTest;

import org.testng.annotations.Test;

import com.OrangeHRMApplicationPages.OrangeHRMApplicationHomePage;
import com.Utility.Log;

public class OrangeHRMApplicationHomePageTest extends OrangeHRM_ApplicationLoginPageTest{
	OrangeHRMApplicationHomePage OAHP;
	
	@Test(priority=1)
public void OrangeHRM_HomePageImageTest() {
		
    OAHP=new OrangeHRMApplicationHomePage();
    OAHP.OrangeHRM_LogInPageLogInValidation("GPK9293","Gpk@9293");
	OAHP.OrangeHRM_HomePageImage();
	Log.info("OrangeHRM Application Home Page Image validation is Succesfull");
			

	}
	@Test(priority=2)
	public void OrangeHRM_HomePage_AdminTest() throws InterruptedException
	{
		OAHP=new OrangeHRMApplicationHomePage();
		OAHP.OrangeHRM_LogInPageLogInValidation("GPK9293","Gpk@9293");
		OAHP.OrangeHRM_HomePage_Admin();
		Log.info("OrangeHRM Application Home Page Admin Text validation is Succesfull");

		
	}

	@Test(priority=3)
	public void OrrangeHRM_HomePage_PimTest() throws InterruptedException
	{
		OAHP=new OrangeHRMApplicationHomePage();
		OAHP.OrangeHRM_LogInPageLogInValidation("GPK9293","Gpk@9293");
		OAHP.OrangeHRM_HomePage_Pim("Gonnabathula", "Prasanna", "Kumar");
		Log.info("OrangeHRM Application Home Page PIM Text validation is Succesfull");
	}


	@Test(priority=4)
	public void OrrangeHRM_HomePAge_WelcomeTest() throws InterruptedException
	{
		OAHP=new OrangeHRMApplicationHomePage();
		OAHP.OrangeHRM_LogInPageLogInValidation("GPK9293","Gpk@9293");
		OAHP.OrangeHRM_HomePage_Welcome();
		Log.info("OrangeHRM Application Home Page Welcome  Text validation is Succesfull");
		Log.info("OrangeHRM Application Home Page Logout Functionality Succesfull");

		
	}

}
