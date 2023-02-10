package com.leaftaps.UI.base.utility;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData(String excelFileName) throws IOException {
		//open excelsheet
		XSSFWorkbook book = new XSSFWorkbook("./Data/" + excelFileName + ".xlsx");
		//get where data is available
		XSSFSheet sheet = book.getSheetAt(0);
		//get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count:" + rowCount);
		//get colm count
		XSSFRow headerRow = sheet.getRow(0);
		short colCount = headerRow.getLastCellNum();
		System.out.println("column count:" + colCount);
		//for storing data and sending data to data provider , creating 2d array
		String[][] data = new String[rowCount][colCount];
		for (int i=1; i<= rowCount; i++) {
			//get each row out of the sheet
			XSSFRow eachRow = sheet.getRow(i);
			for(int j=0; j < colCount; j++) {
				XSSFCell eachCell = eachRow.getCell(j);
				String value = eachCell.getStringCellValue();
				data[i- 1][j] = value;

			}

			}book.close();
			return data;
	}}







