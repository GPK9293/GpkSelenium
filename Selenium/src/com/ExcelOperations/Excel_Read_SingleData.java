package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\GPK.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String testData=cell.getStringCellValue();
System.out.println(testData);
workBook.close();
	}

	
}
