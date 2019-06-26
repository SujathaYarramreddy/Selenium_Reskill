package reskill_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpathsiblingspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		WebElement post = driver.findElement(By.linkText("Posts"));
		Actions action = new Actions(driver);
		action.moveToElement(post).build().perform();
		action.click();
		WebElement postall = driver.findElement(By.xpath("(//*[@href='edit.php'])[2]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(postall).click();
		action1.build().perform();
		
		
	}

}
