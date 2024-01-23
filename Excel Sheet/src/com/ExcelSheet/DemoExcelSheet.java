package com.ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcelSheet {

	public void ReadExcelSheet() {

		try {
			FileInputStream fis =new FileInputStream("E:\\Selenium Software\\Excel files\\myfile.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet objsheet= workbook.getSheetAt(0);
			XSSFRow row= objsheet.getRow(1);

			String value = row.getCell(0).getStringCellValue();
			//	 System.out.println(value);
			String pwd = row.getCell(1).getStringCellValue();
//						System.out.println(pwd);

			int rowcount= objsheet.getLastRowNum();
			for(int i=0; i<=rowcount;i++) {
				XSSFRow row1= objsheet.getRow(i);
				int col_count= row1.getLastCellNum();
				for(int j=0;j<col_count;j++) {
					System.out.println(row1.getCell(j).getStringCellValue());
				}
				System.out.println("**************");
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
