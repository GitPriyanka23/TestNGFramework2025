package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel5 {
	/*
	 * 
	 * Blank cell will be treated as null
	 * You have to read specific  cell with specific method
	 * 
	 */

	public static void main(String[] args) throws InvalidFormatException, IOException{
		
		//Load Excel
		
		XSSFWorkbook wb = new XSSFWorkbook(new File("./TestData/Data.xlsx"));
		
		int row =wb.getSheet("Login").getPhysicalNumberOfRows();
		
		for(int i=0;i<row;i++) 
		{
			System.out.println(wb.getSheet("Login").getRow(i).getCell(0).getStringCellValue());
			
		}
		//close workbook
		wb.close();
			
	}

}
