package Sample.org.tcs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SimpleDateFormat {

	public static void main(String[] args) throws IOException
	{
		File loc=new File("C:\\Users\\jram1\\eclipse-workspace\\pgm\\org.tcs.test\\testdata\\Book12.xlsx");
		FileInputStream fs=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s=w.getSheet("Sheet1");
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r=s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
			Cell c=r.getCell(j);
			int a=c.getCellType();
			
			if(a==1)
			{
				String s1=c.getStringCellValue();
				System.out.println(s1);
			}
			
			else if(a==0)
			{
				if(DateUtil.isCellDateFormatted(c))
				{
					Date d=c.getDateCellValue();
					SimpleDateFormat s2= new SimpleDateFormat("dd-MMM-yy");
					String format=s2.format(d);
					System.out.println(format);
				}
				else
				{
					double numericCellValue=c.getNumericCellValue();
					long l=(long)numericCellValue;
					String ba=String.valueOf(1);
					System.out.println(ba);
				}
			}

		}
		
	}}
}
