package com.TestNG;

import org.testng.annotations.Test;

public class Annotations{
@Test (priority=1)
public void ApplicationLaunch() {
System.out.println("Gmail applicationLaunch");	
	
}	

@Test(priority=2)
public void closeApplication(){
	
System.out.println("closed gmail application");

}

@Test(priority=3)
public void compose() {
System.out.println("compose gmail application");
}
@Test(priority=4)
public void inbox() {
System.out.println("inbox gmail application");
}
}