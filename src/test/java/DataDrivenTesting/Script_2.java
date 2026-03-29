package DataDrivenTesting;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		   XSSFWorkbook book = new XSSFWorkbook();
		   XSSFSheet sheet = book.createSheet("Sheet1");
		    XSSFRow row = sheet.createRow(6);
		   XSSFCell cell = row.createCell(0);
		      cell.setCellValue("Lathesh_5");
		   XSSFCell cell1 = row.createCell(1);
		   cell1.setCellValue("5508");
		   XSSFCell cell2 = row.createCell(2);
		   cell2.setCellValue("HR");
		   FileOutputStream  fos = new FileOutputStream("./TestData/Testing.xlsx");
		   book.write(fos);
		   book.close();
		   fos.close();
		   System.out.println("Everything is doen please Check");
	
	}

}
