package com.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.RowBlocksReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataDrivenTesting {
	@DataProvider(name ="LoginData")
	public Object[][] loginByData() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\Program\\Aster\\src\\test\\resources\\Data Driven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		int rows = sheet.getLastRowNum();
		Object [][]x=new String[rows][sheet.getRow(1).getLastCellNum()];
		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getLastCellNum();
			for (int j = 1; j < cells; j++) {
				Cell cell = row.getCell(j);
				 x[i-1][j-1]  = cell.getStringCellValue();
			}
		}
		return x;
	}
}