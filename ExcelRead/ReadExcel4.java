package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel4 {
	/*
	 * 
	 * Blank cell will be treated as null
	 * You have to read specific  cell with specific method
	 * 
	 */

	public static void main(String[] args) throws InvalidFormatException, IOException{
		
		//Load Excel
		
		XSSFWorkbook wb = new XSSFWorkbook(new File("./TestData/Data.xlsx"));
		
		//Get Specific type of data
		String value =wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		//Get Specific type of data
		double  num  =wb.getSheet("Login").getRow(2).getCell(1).getNumericCellValue();
			
		System.out.println(num);
		
		//Get Specific type of data
		boolean   status  =wb.getSheet("Login").getRow(2).getCell(1).getBooleanCellValue();
		
		System.out.println(status);
		
		System.out.println("Value from another sheet:"+wb.getSheet("user").getRow(0).getCell(2).getStringCellValue());
		
		//close workbook
		wb.close();
			
	}

}
