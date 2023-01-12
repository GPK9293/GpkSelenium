package com.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmployeeId_Validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			
String orangeHRM_Application_URL_Address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
System.setProperty("webdriver.chrome.driver","E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");

ChromeDriver driver= new ChromeDriver();

driver.get(orangeHRM_Application_URL_Address);

driver.manage().window().maximize();

//<input name="txtUsername" id="txtUsername" type="text">

WebElement userName=driver.findElementById("txtUsername");
userName.sendKeys("GPK9293");
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

WebElement password=driver.findElementByName("txtPassword");

password.sendKeys("Gpk@9293");

//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

WebElement loginButton=driver.findElementByClassName("button");

loginButton.click();
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>

Actions act=new Actions(driver);


WebElement pimElement=driver.findElementByLinkText("PIM");
act.moveToElement(pimElement).build().perform();
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
WebElement addEmployeeElement=driver.findElementByLinkText("Add Employee");
addEmployeeElement.click();



String firstname="Gonnabathula";
// <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
WebElement givenFirstNameElement=driver.findElementById("firstName");
givenFirstNameElement.sendKeys(firstname);
System.out.println("The Given First Name in PIM is : "+firstname);
// <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
String middleName="Prasanna";
WebElement givenMiddleNameElement=driver.findElementById("middleName");
givenMiddleNameElement.sendKeys(middleName);
System.out.println("The Given Middle Name in PIM is : "+middleName);
// <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
String lastName="Kumar";
WebElement givenLastNameElement=driver.findElementById("lastName");
givenLastNameElement.sendKeys(lastName);
System.out.println("The Given Last Name in PIM is : "+lastName);
// <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0038" id="employeeId">
WebElement employeeIdElement=driver.findElementById("employeeId");
String assignedEmployeeId=employeeIdElement.getAttribute("value");

// <input type="button" class="" id="btnSave" value="Save">
WebElement saveElement=driver.findElementById("btnSave");
saveElement.click();


 // <input value="Gonnabathula" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
WebElement savedFirstNameElement=driver.findElementById("personal_txtEmpFirstName");
String actualFirstName=savedFirstNameElement.getAttribute("value");

System.out.println("The Actual First Name saved in PIM is : "+actualFirstName);

// <input value="Prasanna" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
WebElement savedMiddleNameElement=driver.findElementByName("personal[txtEmpMiddleName]");
String actualMiddleName=savedMiddleNameElement.getAttribute("value");
System.out.println("The Actual Middle Name saved in PIM is : "+actualMiddleName);

//<input value="Kumar" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
WebElement savedLastNameElement=driver.findElementByName("personal[txtEmpLastName]");
String actualLastName=savedLastNameElement.getAttribute("value");
System.out.println("The Actual Last Name saved in PIM is: "+actualLastName);

if(firstname.equals(actualFirstName))
{
	System.out.println("Both Given and Actual First Name is Matched - Pass");
	
}
else
{
	System.out.println("Both Given and Actual First Name is Not Matched - Fail");
}
if(middleName.equals(actualMiddleName))
{
	System.out.println("Both Given and Actual Middle Name is Matched - Pass");
	
}
else
{
	System.out.println("Both Given and Actual Middle Name is Not Matched - Fail");
}
if(lastName.equals(actualLastName))
{
	System.out.println("Both Given and Actual First Name is Matched - Pass");
	
}
else
{
	System.out.println("Both Given and Actual First Name is Not Matched - Fail");
	
}
System.out.println("The Assigned Employee Id is :"+assignedEmployeeId);

// <input value="0038" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
WebElement savedEmployeeIdElement=driver.findElementById("personal_txtEmployeeId");
String actualEmployeeId=savedEmployeeIdElement.getAttribute("value");
System.out.println("The Actual Employee Id is : "+actualEmployeeId);
if(actualEmployeeId.equals(assignedEmployeeId))
{
	System.out.println("Both Assigned and Actual Employee Id is Matched - Pass");
}
else
{
	System.out.println("Both Assigned and Actual Employee Id is Not Matched - Fail");
}
String givenFullName= firstname +" " +middleName +" "+lastName; 
System.out.println( "The  Given Full Name is : "+givenFullName);
//<h1>Gonnabathula Prasanna Kumar</h1>
// #profile-pic > h1
// //*[@id="profile-pic"]/h1

WebElement fullName=driver.findElementById("profile-pic");
String actualFullName=fullName.getText();
System.out.println("The Actual Full Name is :" +actualFullName);

if(actualFullName.contains(givenFullName))
{
	System.out.println("The Actual and Given Full Name is Matched - Pass");
}
else
{
	System.out.println("The Actual and Given Full Name is Not Matched - Fail");
}
// <a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>

WebElement welcomeAdminElement=driver.findElementByPartialLinkText("Welcome Admin");
welcomeAdminElement.click();
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

Thread.sleep(5000);

WebElement logoutElement=driver.findElementByLinkText("Logout");
logoutElement.click();

driver.quit(); 
	}

}
