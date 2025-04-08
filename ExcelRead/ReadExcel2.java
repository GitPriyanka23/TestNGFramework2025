package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel2 {

	public static void main(String[] args) throws InvalidFormatException, IOException{
		
		
		//Step 1-Locate the file
		File src = new File("./TestData/Data.xlsx");
		
		//Load The Excel
		XSSFWorkbook wb = new XSSFWorkbook(src);
		
		//Step 3- load sheet
		XSSFSheet sh1 = wb.getSheet("Login");
		
		//Step 4- load row
		XSSFRow r1 = sh1.getRow(2);
		
		
		//Step5 -Load cell
		XSSFCell c1 = r1.getCell(1);
		
		
		//Get Specific type of data
		String value =c1.getStringCellValue();
		
		System.out.println(value);
		
		//close workbook
		wb.close();
			
	}

}
