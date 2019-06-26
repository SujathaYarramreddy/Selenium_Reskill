package reskill_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_KeyBoard_options_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		WebElement link = driver.findElement(By.xpath("//*[contains(@href,'http://realestate.upskills.in/wp-admin/profile.php')]"));
		Actions build = new Actions(driver);
		build.moveToElement(link).build().perform();
		build.click();
		Thread.sleep(2000);
		WebElement sublink = driver.findElement(By.linkText("Edit My Profile"));
		Actions actions = new Actions(driver);
		Actions newElement = actions.moveToElement(sublink);
		newElement.click().build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('nickname').scrollIntoView()");
		
		
		

	}

}
