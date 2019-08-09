package Sample.org.tcs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetPgm {
	public static void main(String[] args) throws IOException
	{
	File loc=new File("C:\\Users\\jram1\\eclipse-workspace\\pgm\\org.tcs.test\\testdata\\Book12.xlsx");
	FileInputStream fs=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s=w.getSheet("Sheet1");
	Row r=s.getRow(0);
	Cell c=r.getCell(1);
	System.out.println(c);
		
		
	}

}
