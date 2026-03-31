package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utils {

	
	public static Object[][] getTestData(String filePath, String sheetName) throws IOException
	{
		
		FileInputStream fis= new FileInputStream("./Selenium/TestData/Testing.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet  =  book.getSheet("Abc");
		
		int rows = sheet.getLastRowNum();        // total rows excluding header
	    int cols = sheet.getRow(0).getLastCellNum(); // total columns
	  
	    Object[][] data = new Object[rows][cols];
	    
	    for (int i = 1; i <= rows; i++) {        // start from 1 to skip header
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                XSSFCell cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
	    
	    
	    book.close();
	    
	   fis.close();
	   return data;
	}
}
