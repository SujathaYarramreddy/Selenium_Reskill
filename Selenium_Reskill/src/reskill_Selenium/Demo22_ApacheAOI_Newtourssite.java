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

public class Demo22_ApacheAOI_Newtourssite {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		File tr = new File("C:\\Selenium\\Data\\Testdatatours.xlsx");
		FileInputStream fi = new FileInputStream(tr);
		
		XSSFWorkbook wb = new XSSFWorkbook(tr);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
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
		
		
		}
		

	}

}
