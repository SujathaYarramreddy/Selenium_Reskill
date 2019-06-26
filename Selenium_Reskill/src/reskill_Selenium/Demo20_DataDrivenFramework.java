package reskill_Selenium;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo20_DataDrivenFramework {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File Fexcel = new File("C:\\Users\\IBM_ADMIN\\Documents\\Test1.xls");
		WritableWorkbook writebook = Workbook.createWorkbook(Fexcel);
		writebook.createSheet("Sujatha", 0);
		WritableSheet writesheet = writebook.getSheet(0);
		Label data = new Label(0,0,"Sujatha");
		writesheet.addCell(data);
		
		Label data1 = new Label(0,1,"Selenium");
		writesheet.addCell(data1);
		
		writebook.createSheet("Swathi", 1);
		WritableSheet writesheet1 = writebook.getSheet(1);
		Label data2 = new Label(1,5,"Framework");
		writesheet1.addCell(data2);
		
		writebook.write();
		writebook.close();
		
		

	}

}
