package com.RadioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOperation {
WebDriver driver;
String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
public void applicationLaunch()
{
	System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
public static void main(String[] args) throws InterruptedException {
	ClickOperation object=new ClickOperation();
	object.applicationLaunch();
	object.radioButtonElement();
}

public void radioButtonElement() throws InterruptedException
{
WebElement radioButtonBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));	
/*
 <input type="radio" name="group2" value="Wine" checked="">
 <input type="radio" name="group1" value="Milk">
 <input type="radio" name="group2" value="Water">
 
 
*/

List<WebElement> radioButtonElementList=radioButtonBlock.findElements(By.name("group1"));
int radioButtonElementListSize=radioButtonElementList.size();
List<WebElement> radioButtonElementList2=radioButtonBlock.findElements(By.name("group2"));

for(int i=0; i<radioButtonElementListSize; i++)
{
	radioButtonElementList.get(i).click();
	Thread.sleep(2000);
	radioButtonElementList2.get(i).click();
	List<WebElement> radioButtonElementList3=radioButtonBlock.findElements(By.tagName("input"));
	int radioButtonElementListSize3=radioButtonElementList3.size();
for(int j=0; j<radioButtonElementListSize3;j++)
{
	String checkedRadioButtonName3=radioButtonElementList3.get(j).getAttribute("checked");
	String radioButtonElementName3=radioButtonElementList3.get(j).getAttribute("value");
	System.out.println(radioButtonElementName3+"-"+checkedRadioButtonName3);
}
System.out.println();
	}


driver.quit();
}
}

