package reskill_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo21_ApacheAOI {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//To open the File and Read data from excel sheet
		File nf = new File("C:\\Selenium\\Data\\Testdata.xlsx");
		FileInputStream fi = new FileInputStream(nf);
		
		XSSFWorkbook wb = new XSSFWorkbook(nf);
		XSSFSheet sheet1 = wb.getSheetAt(0);//if not sure about sheetname then use it getSheetAt(int Index) method
		
		int rowcount = sheet1.getLastRowNum();
		for (int i = 0; i <=rowcount; i++) {
			String username = sheet1.getRow(i).getCell(0).getStringCellValue();
			String password = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username);
			System.out.println(password);
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			Thread.sleep(2000);
			
		}
		
	}

}
