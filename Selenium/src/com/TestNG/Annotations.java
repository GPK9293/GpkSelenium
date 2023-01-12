package com.TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
@BeforeMethod
	public void applicationLaunch()
	{
		System.out.println("Gmail Application Launched Successfully");
	}
	
	 	
	@Test(priority=1)
	public void inbox()
	{
		System.out.println("Gmail Inbox Application Launched Successfully");
	}
	@AfterMethod
	public void CloseApplication()
	{
		System.out.println("Gmail Closed Application Successfully");
	}
	
@Test(priority=2)
public void ComposeMail()
{
	System.out.println("Compose Mail functionality Test  Executed Successfully ");
	
}
@Test(enabled=false)
public void Draft()
{
	System.out.println("Draft Functionality Executed Successfully");
}








}

