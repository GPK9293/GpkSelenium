package com.OrangeHRM_ApplicationTestCases_PagesTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplicationHomePage;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_HomePage_AddEmployee;
import com.Utility.Log;

public class OrangeHRMApplication_HomePage_AddEmployeeTest extends BaseTest{
	
	
	@Test(priority=1)
	public void OrangeHRMApplication_HomePage_AddEmployeePageTest() throws InterruptedException, IOException{
		  
		OrangeHRMApplicationHomePage OAHP=new OrangeHRMApplicationHomePage();
		OAHP.OrangeHRM_LogInPageLogInValidation("GPK9293","Gpk@9293");
	
		OrangeHRMApplication_HomePage_AddEmployee OAHPE=new OrangeHRMApplication_HomePage_AddEmployee();
		OAHPE.OrangeHRMApplication_HomePage_AddEmployeePage("Goonabathula", "Prasanna", "Kumar");
		Log.info("Add Employee functionality succesfull");
		
		
		
	}

}
