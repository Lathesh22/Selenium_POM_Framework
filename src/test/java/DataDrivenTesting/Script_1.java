package DataDrivenTesting;



//To read single data from excel


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream Fs = new FileInputStream("./TestData/Testing.xlsx");
		   XSSFWorkbook book = new XSSFWorkbook(Fs);
		     XSSFSheet sheet = book.getSheet("Sheet1");
		        XSSFRow row = sheet.getRow(2);
		       XSSFCell cell = row.getCell(0);
		      String name = cell.getStringCellValue();
		       System.out.println(name);
		 
	}

}
