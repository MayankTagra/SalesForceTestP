package TryForFreeWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	public ArrayList<String> Getdata(String testname) throws IOException
	{	
		FileInputStream fs=new FileInputStream(new File("TestBook1.xlsx"));
		XSSFWorkbook ws=new XSSFWorkbook(fs);
		DataFormatter formatter =new DataFormatter();
		ArrayList<String> al=new ArrayList();

		Sheet sheet=ws.getSheet("Sheet1");
		Iterator<Row> row=sheet.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			if(r.getCell(0).getStringCellValue().equalsIgnoreCase(testname))
			{
				Iterator<Cell> cell=r.iterator();
				while(cell.hasNext())
				{
					Cell c=cell.next();
					al.add(formatter.formatCellValue(c));
				}
				/*
				System.out.println();
				System.out.println("----------------------------");
				System.out.println();
				*/
			}
		}
		
		return al;

	}

}
