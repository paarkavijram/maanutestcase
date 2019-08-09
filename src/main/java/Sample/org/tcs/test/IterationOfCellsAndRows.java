package Sample.org.tcs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IterationOfCellsAndRows {

	public static void main(String[] args) throws IOException
	{
		File loc=new File("C:\\Users\\jram1\\eclipse-workspace\\pgm\\org.tcs.test\\testdata\\Book12.xlsx");
		FileInputStream fs=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s=w.getSheet("Paar");
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r=s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{ 
			Cell c=r.getCell(j);
			int a=c.getCellType();
			System.out.println(a);
		}
	}
	
	
	}
}
