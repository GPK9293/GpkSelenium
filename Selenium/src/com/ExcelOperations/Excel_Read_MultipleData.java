package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\OrangeHRM_LoginTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
        for(int row=0; row<rowCount; row++)
        {
        	Row sheetRow=sheet.getRow(row);
       int cellCount=sheetRow.getLastCellNum();
        for(int cell=0; cell<cellCount; cell++)
        {
        	Cell rowOfCell=sheetRow.getCell(cell);
        	String testData=rowOfCell.getStringCellValue();
        	System.out.print(testData+"  ");
        }
        System.out.println();
        }
		workbook.close();
		
	}

}
