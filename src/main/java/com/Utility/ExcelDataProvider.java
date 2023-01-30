package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {  //add dependencies apache poi & poi-ooxml
	XSSFWorkbook wb;
   public ExcelDataProvider() throws Exception {
	String excelpath="C:\\Users\\HP\\eclipse-workspace\\Batch16_AutomationPractice\\TestData\\ExcelData.xlsx";
	FileInputStream fis=new FileInputStream(excelpath);
	wb=new XSSFWorkbook(fis);
   }
   
   public String getStringData_Excel(String SheetName,int row,int cell) {
	   return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
   }
	
}
