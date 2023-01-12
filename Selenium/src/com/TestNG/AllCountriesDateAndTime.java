package com.TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AllCountriesDateAndTime extends BaseTestTime_Date {
	@Test
	public void AllCountiesDateAndTime_Excel() throws IOException 
	{
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// //*[@id="p0"]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]
		// //*[@id="p108"]
		
		
		
		
	String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		
		String xpathExpression2="]/td[";
				String xpathExpression3="]";
		
				FileInputStream file=new FileInputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\DateAndTime2.xlsx");
				XSSFWorkbook workBook=new XSSFWorkbook(file);
				XSSFSheet sheet=workBook.getSheet("Sheet1");
				Row row0=sheet.createRow(0);
				Cell RowOfCell0=row0.createCell(0);
				RowOfCell0.setCellValue("The City Names And Current Time");
				
			for(int i=1;i<=36;i++)
		     {
				Row row=sheet.createRow(i);

				for(int j=1; j<=8; j++)
				{
					By xpath=By.xpath(xpathExpression1+i+xpathExpression2+j+xpathExpression3);
			WebElement AllCountryDateAndTimeData=driver.findElement(xpath);
			String WebData=AllCountryDateAndTimeData.getText();
			System.out.print(WebData+"       ");
			Cell RowOfCell=row.createCell(j-1);
			RowOfCell.setCellValue(WebData);
				
				}
				System.out.println();
		}
		FileOutputStream file1 = new FileOutputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\DateAndTime2.xlsx");
		workBook.write(file1);
		workBook.close();

			
		}
		
	}

