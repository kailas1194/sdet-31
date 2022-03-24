package com.crm.vtiger.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getStringValue(String sheetname,int row,int cell) throws Throwable
	{
		String path="./src/main/resources/Book1.xlsx";
		FileInputStream fin= new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fin);
		String testdata=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return testdata;
	}
	
	public int getCountOfCell(String sheetname) throws Throwable {
		String path="./src/main/resources/Book1.xlsx";
		FileInputStream fin=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fin);
		int countRow=wb.getSheet(sheetname).getPhysicalNumberOfRows();
		return countRow;
	}
	
	public int getCountOfCell(String sheetname,int row) throws Throwable {
		String path="./src/main/resources/Book1.xlsx";
		FileInputStream fin=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		int countCell=wb.getSheet(sheetname).getRow(row).getPhysicalNumberOfCells();
		return countCell;
		
	}
	
	

}
