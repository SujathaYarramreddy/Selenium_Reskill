package reskill_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("Admin");
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[contains(@class,'fa-key')]")).click();
		//driver.findElement(By.xpath("//button[(@type='submit')]")).click(); //can use this xpath also
		//driver.findElement(By.cssSelector("button.btn.btn-primary")).click();//Css seletor path- '.' will use for CSS seletor and # for id.
		WebElement link = driver.findElement(By.id("menu-catalog"));
		Actions build = new Actions(driver);
		build.moveToElement(link).build().perform();
		build.click();
		
		
		
		
	}

}
