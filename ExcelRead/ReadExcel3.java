package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel3 {

	public static void main(String[] args) throws InvalidFormatException, IOException{
		
		//Load Excel
		
		XSSFWorkbook wb = new XSSFWorkbook(new File("./TestData/Data.xlsx"));
		
		//Get Specific type of data
		String value =wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		System.out.println("Value from another sheet:"+wb.getSheet("user").getRow(0).getCell(2).getStringCellValue());
		
		//close workbook
		wb.close();
			
	}

}
