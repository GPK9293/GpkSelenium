package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmployeeInfo_Excel extends OrangeHRM_AddEmployee {
	@Test(priority=6)
	public void AllEmployeeInfo_Excel() throws IOException
	{
		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		WebElement EL=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		EL.click();
		String path="./src/excel/AddEmployeeTestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		
			
		String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\excel\\EmployeeListTest.xlsx";
		FileInputStream proFile=new FileInputStream(fileSource);
		Properties pr=new Properties();
		pr.load(proFile);
			
		
				
			// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th[2]	
			
				// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[2]/a
				
			// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[35]/td[2]
				// /html/body/div[1]/div[3]/div[2]/div
			
           ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th[1]/input
			// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th[8]
			
			
			By webtableHeaderL=By.tagName("tr");
			WebElement webtableHeader=driver.findElement(webtableHeaderL);
			By headerCellL=By.tagName("th");
			List<WebElement> webtableRowCells=webtableHeader.findElements(headerCellL);
			int webtableRowCellsCount=webtableRowCells.size();
			System.out.println(webtableRowCellsCount);
					    	
		
	    	
    		Row row0=sheet.createRow(0);
	    	for(int j=1;j<webtableRowCellsCount;j++)
	    	{
	    		String webTableData=webtableRowCells.get(j).getText();
	    		
	    		Cell cell=row0.createCell(j);
	    		cell.setCellValue(webTableData);
	    		System.out.print(webTableData+"     ");
	    	}
	    	
			
			By tablerowsL=By.tagName("tr");
				
				List<WebElement>  tablerows=driver.findElements(tablerowsL);
				int tableCount=tablerows.size();
				
				System.out.println(tableCount);
				for(int i=1; i<tableCount; i++)
			    {
			    	WebElement tableRow=tablerows.get(i);
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
				FileOutputStream file1 = new FileOutputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\EmployeeListTest.xlsx");
				workbook.write(file1);
				workbook.close();
		}
			    
			}


