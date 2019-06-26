package reskill_Selenium;

import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo20_WriteintoExcel_DataFramework {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		
		File Fexcel = new File("C:\\Users\\IBM_ADMIN\\Documents\\Test1.xls");
		WritableWorkbook writebook = Workbook.createWorkbook(Fexcel);
		writebook.createSheet("Sujatha", 0); //sheet1
		WritableSheet writesheet = writebook.getSheet(0);
		Label data = new Label(0,0,"Sujatha");//(column,row,data)
		writesheet.addCell(data);
		
		Label data1 = new Label(0,1,"Selenium");
		writesheet.addCell(data1);
		
		writebook.createSheet("Swathi", 1);//sheet2
		WritableSheet writesheet1 = writebook.getSheet(1);//writing in to the sheet
		Label data2 = new Label(0,5,"Framework");
		writesheet1.addCell(data2); //adding data to the sheet
		
		writebook.write();
		writebook.close();
		//Now Fetching from the workbook
		
		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\IBM_ADMIN\\Documents\\Test1.xls"));
		Sheet sheet = null;
		int noofsheets = workbook.getNumberOfSheets();
		Cell cell1 = null;
		for (int p = 0; p < noofsheets; p++) {
			sheet = workbook.getSheet(p);
			int noofrows = sheet.getRows();
			int noofcoloumns = sheet.getColumns();
			System.out.println(sheet.getRows() + "\t" +sheet.getColumns());
			System.out.println("Data Present in each sheet" +p);
			for (int i = 0; i < noofrows; i++) {
				for (int j = 0; j < noofcoloumns; j++) {
					
					cell1 = sheet.getCell(j,i);
					if (cell1.getContents().length()>0) {
						System.out.println(cell1.getContents());
					}
				}
				
			}
			
		}
		
		
		workbook.close();

	}

}

