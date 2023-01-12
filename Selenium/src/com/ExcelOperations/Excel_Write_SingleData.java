package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_SingleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\GPK.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.createRow(9);
		Cell cell=row.createCell(9);
		cell.setCellValue("Gonnabathula");
	FileOutputStream file1=new FileOutputStream("E:\\GPK_WorkSpace\\Selenium\\src\\excel\\GPK.xlsx");
	workbook.write(file1);
	workbook.close();
	}

}
