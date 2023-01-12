package com.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTitle_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String OrangeHRM_Application_URL_Address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");

ChromeDriver driver= new ChromeDriver();

driver.get(OrangeHRM_Application_URL_Address);

String expected_OrangeHRM_Application_Login_Title="OrangeHRM";

System.out.println("The Expected OrangeHRM Application Login Title is:"+expected_OrangeHRM_Application_Login_Title);

String actual_OrangeHRM_Application_Login_Title=driver.getTitle();

System.out.println("The Actual OrangeHRM Application Login Title is:" +actual_OrangeHRM_Application_Login_Title);

if(actual_OrangeHRM_Application_Login_Title.equals(expected_OrangeHRM_Application_Login_Title))
{
	System.out.println("The Actual and Expected Login Title of OrangeHRM Application is Matched - Pass");
}
else
{
	System.out.println("The Actual and Expected Login Title of OrangeHRM Application is not Matched - Fail");
}
String expectedLoginPanelText="LOGIN Panel";

System.out.println("The Expected Login Page panel text is :" +expectedLoginPanelText);

// <div id="logInPanelHeading">LOGIN Panel</div>

WebElement actualLogInPanelElement=driver.findElementById("logInPanelHeading");

String actualLogInPanelText=actualLogInPanelElement.getText();

System.out.println("The Actual Login Page panel text is :" +actualLogInPanelText);
if(actualLogInPanelText.equals(expectedLoginPanelText))
{
	System.out.println("Actual and Expected Login Panel text is matching - Pass");
	
}
else
{
	System.out.println("The Actual and Expected Login Panel text is not matching - Fail");
	
}
//<input name="txtUsername" id="txtUsername" type="text">

driver.findElementById("txtUsername").sendKeys("GPK9293");

//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

WebElement password=driver.findElementByName("txtPassword");

password.sendKeys("Gpk@9293");

//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

WebElement LoginButton=driver.findElementByClassName("button");

LoginButton.click();

String expected_OrangeHRM_HomePage_Title="orangeHRM";

System.out.println("The Expected OrangeHRM Application HomePage Title is:" +expected_OrangeHRM_HomePage_Title);

String actual_OrangeHRM_HomePage_Title=driver.getTitle();

System.out.println("The Actual OrangeHRM Application HomePage Title is:" +actual_OrangeHRM_HomePage_Title);

if(actual_OrangeHRM_HomePage_Title.equalsIgnoreCase(expected_OrangeHRM_HomePage_Title))
{
	System.out.println("The Actual and Expected HomePage Title of OrangeHRM Application is Matched -Pass");
}
else
{
	System.out.println("The Actual and Expected HomePage Title of OrangeHRM Application is not Matched - Fail");
}

String expectedHomePageURLAddress="orangehrm";
System.out.println("The Expected HomePage URL Address is :" +expectedHomePageURLAddress);
String actualHomePageURLAddress=driver.getCurrentUrl();
System.out.println("The Actual HomePage URL Address is :" +actualHomePageURLAddress);
if(actualHomePageURLAddress.contains(expectedHomePageURLAddress))
{
	System.out.println("The Actual and Expected HomePage URL Address is matching - Pass");
}
else
{
	System.out.println("The Actual and Expected HomePage URL Address is not matching - Fail");
}
// <b>Admin</b>

String expectedAdminElementText="Admin";

System.out.println("The Expected Text of Admin Element is :" +expectedAdminElementText);

WebElement adminElement=driver.findElementByLinkText("Admin");
String actualAdminElementText=adminElement.getText();

System.out.println("The Actual Text of Admin Element is :" +actualAdminElementText);
if(actualAdminElementText.equals(expectedAdminElementText))
{
	System.out.println("The Actual and Expected Text of Admin Element is matching - Pass ");

}
else
{
	System.out.println("The Actual and Expected Text of Admin Element is - Fail");

}


driver.quit();
	}

}
