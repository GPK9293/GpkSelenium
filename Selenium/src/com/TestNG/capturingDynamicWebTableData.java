package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class capturingDynamicWebTableData extends BaseTestTime_Date {
@Test
public void capturingDynamicWebTableData_Excel() throws IOException 
{
	FileInputStream file=new FileInputStream("./src/excel/DateAndTime2.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("Sheet2");
		// /html/body/div[5]/section[1]/div
	
	    By webTableL=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableL);
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]
	    By tablesRowsL=By.tagName("tr");
	    List<WebElement> tableRows=webTable.findElements(tablesRowsL);
	    int tableRowsCount=tableRows.size();
	    for(int i=0; i<tableRowsCount; i++)
	    {
	    	WebElement tableRow=tableRows.get(i);
	    	By tableColumnL=By.xpath("td");
	    	List<WebElement> tableColumn=tableRow.findElements(tableColumnL);
	    	int tableColumnCount=tableColumn.size();
	    	
    		Row row=sheet.createRow(i);
	    	for(int j=0;j<tableColumnCount;j++)
	    	{
	    		String webTableData=tableColumn.get(j).getText();
	    		
	    		Cell cell=row.createCell(j);
	    		cell.setCellValue(webTableData);
	    		System.out.print(webTableData+"     ");
	    	}
	    	System.out.println();
	    }
		FileOutputStream file1 = new FileOutputStream("./src/excel/DateAndTime2.xlsx");
		workBook.write(file1);
		workBook.close();
}
	    
	}
	


