package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFirstColumnData extends BaseTestTime_Date {
@Test
public void capturingFirstColumnData()
{
	// first row of first column property
    // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	// second row of first column property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
	// last row of first column property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpression2="]/td[1]/a";
	for(int i=1;i<=36;i++)
	{
		By xpath=By.xpath(xpathExpression1+i+xpathExpression2);
		WebElement firstColumn=driver.findElement(xpath);
		String firstColumnData=firstColumn.getText();
		System.out.println(firstColumnData);
	}
	
	
}
}
