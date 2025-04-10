package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		/*
		 * 
		 	Name if library for diffrent file type
			Apche POI - read and write Excel file
			CSV 	  -opencsv Jar	
			JSON      -json-simple
			XML       -simple java  classes	

		 
		 * for .xlsx-
		 * Below all are class, hence we need to create an object-to access them
		 * 
		 *		 XSSFWorkbook- help to load the workbook
		 *		 XSSFSheet-help to  load a sheet
		 * 		 XSSSF-row- help to load a specific row
		 * 		 XSSSFcell- load cell
		 * 
		 * 
		 *  If you are using lder version .xls-
		 *		 HSSFWorkbook- help to load the workbook
		 *		 HSSFSheet-help to  load a sheet
		 * 		 HSSSF-row- help to load a specific row
		 * 		 HSSSFcell- load cell
	
		 */
		
		//step1 load the excel
		
		File src = new File("./TestData/Data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(src);
		
		System.out.println("Total sheet count in excel :"+ wb.getNumberOfSheets());
		
		wb.close();
		
	
	}

}
