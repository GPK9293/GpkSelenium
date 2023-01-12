package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Write_MultipleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


FileInputStream file = new FileInputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\OrangeHRM_LoginTestData.xlsx");
XSSFWorkbook workBook = new XSSFWorkbook(file);
XSSFSheet sheet = workBook.getSheet("Sheet1");

Row row=sheet.getRow(2);
Cell userNameRowOfCell=row.getCell(0);
Cell passwordRowOfCell=row.getCell(4);

String userName=userNameRowOfCell.getStringCellValue();
System.out.println("userName : "+userName);

String password=passwordRowOfCell.getStringCellValue();
System.out.println("password : "+password);

System.setProperty("webdriver.chrome.driver",
"E:\\GPK_WorkSpace\\Selenium\\BrowsersDriverFiles\\chromedriver.exe");

driver = new ChromeDriver();
driver.get(applicationUrlAddress);

driver.manage().window().maximize();

// Implicit Wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



String expected_LogInPage_logInPanelText="LOGIN Panel";
System.out.println(" The expected LogIn Page Text is : "+expected_LogInPage_logInPanelText);

WebElement actual_LogInPageElement=driver.findElement(By.id("logInPanelHeading"));
String actual_LogInPageText=actual_LogInPageElement.getText();
System.out.println(" The actual Text of the LogIn Page is :"+actual_LogInPageText);

if(actual_LogInPageText.equals(expected_LogInPage_logInPanelText))
{
System.out.println(" Reached at the LogIn page : "+" PASS ");
}
else
{
System.out.println(" Failed to Reach LogIn Page :"+ " FAIL ");
}


WebElement userNameElement=driver.findElement(By.id("txtUsername"));
userNameElement.sendKeys(userName);

WebElement passwordElement=driver.findElement(By.name("txtPassword"));
passwordElement.sendKeys(password);

WebElement logInButtonElement=driver.findElement(By.className("button"));
logInButtonElement.click();

WebElement welComeAdminElement=driver.findElement(By.id("welcome"));
String actual_welComeAdminElementText=welComeAdminElement.getText();

String expected_HomePageText="Admin";

if(actual_welComeAdminElementText.contains(expected_HomePageText))
{
System.out.println(" Landed at HomePage Successfully - PASS");
Cell testResultCell=row.createCell(7);
testResultCell.setCellValue("Landed at HomePage Successfully - PASS");


}
else
{
System.out.println(" Failed to land at the HomePage - FAIL");
Cell testResultCell=row.createCell(7);
testResultCell.setCellValue("Failed to land at the HomePage - FAIL");
}

welComeAdminElement.click();

// Thread.sleep(10000);

WebElement logOutElement=driver.findElement(By.linkText("Logout"));
logOutElement.click();

FileOutputStream file1 = new FileOutputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\OrangeHRM_LoginTestResultData.xlsx");
workBook.write(file1);
workBook.close();
driver.quit();


	}

}
