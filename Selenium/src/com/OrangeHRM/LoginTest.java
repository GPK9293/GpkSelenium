package com.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String OrangeHRM_Application_URL_Address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		String username="GPK9293";
		String password="Gpk@9293";
		
		System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");

ChromeDriver driver= new ChromeDriver();

driver.get(OrangeHRM_Application_URL_Address);

String Expected_OrangeHRM_Application_Login_Title="OrangeHRM";

System.out.println("The Expected OrangeHRM Application Login Title is:"+Expected_OrangeHRM_Application_Login_Title);

String Actual_OrangeHRM_Application_Login_Title=driver.getTitle();

System.out.println("The Actual OrangeHRM Application Login Title is:" +Actual_OrangeHRM_Application_Login_Title);

if(Actual_OrangeHRM_Application_Login_Title.equals(Expected_OrangeHRM_Application_Login_Title))
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
	System.out.println("Actual and Expected Login Panel text is not matching - Fail");
	
}
//<input name="txtUsername" id="txtUsername" type="text">

WebElement usernameElement=driver.findElementById("txtUsername");
usernameElement.sendKeys(username);

//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

WebElement passwordElement=driver.findElementByName("txtPassword");

passwordElement.sendKeys(password);

//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

WebElement LoginButton=driver.findElementByClassName("button");

LoginButton.click();

String Expected_OrangeHRM_HomePage_Title="orangeHRM";

System.out.println("The Expected OrangeHRM Application HomePage Title is:" +Expected_OrangeHRM_HomePage_Title);

String Actual_OrangeHRM_HomePage_Title=driver.getTitle();

System.out.println("The Actual OrangeHRM Application HomePage Title is:" +Actual_OrangeHRM_HomePage_Title);

if(Actual_OrangeHRM_HomePage_Title.equalsIgnoreCase(Expected_OrangeHRM_HomePage_Title))
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



// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

WebElement welcomeAdminElement=driver.findElementById("welcome");
String welcomeAdminText=welcomeAdminElement.getText();
System.out.println("The text of WebElement WelcomeAdmin is:" +welcomeAdminText);


// <b>Admin</b>

// driver.quit();
	}

}
	

 