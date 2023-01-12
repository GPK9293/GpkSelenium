package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeMethod
	public void ApplicationLaunch() {
	System.out.println("Gmail applicationLaunch");	
		
	}	

	@AfterMethod
	public void closeApplication(){
		
	System.out.println("closed gmail application");

	}

	@Test(priority=2)
	public void compose() {
	System.out.println("compose gmail application");
	}
	@Test(priority=1)
	public void inbox() {
	System.out.println("inbox gmail application");
	}
	}

