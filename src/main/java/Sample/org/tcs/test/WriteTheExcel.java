package Sample.org.tcs.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTheExcel {

	public static void main(String[] args) throws IOException
	{
		File loc=new File("C:\\Users\\jram1\\eclipse-workspace\\pgm\\org.tcs.test\\testdata\\Book12.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("Paar");
		Row r=s.createRow(6);
		Cell c=r.createCell(5);
		c.setCellValue("kavi");
		FileOutputStream fo=new FileOutputStream(loc);
		w.write(fo);
		System.out.println("done");
	}
	
}
