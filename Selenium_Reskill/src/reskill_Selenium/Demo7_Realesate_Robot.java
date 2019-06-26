package reskill_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo7_Realesate_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in");
		driver.manage().window().maximize();
		driver.findElement(By.className("sign-in")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Howdy')]")); //can use name like this with Xpath
		WebElement link = driver.findElement(By.xpath("//*[contains(@href,'http://realestate.upskills.in/wp-admin/profile.php')]"));
		
		/* Direct perform in Actions method
		Actions build = new Actions(driver);
		build.moveToElement(link).build().perform();
		build.click();
		//driver.findElement(By.linkText("Edit My Profile")).click();
		Thread.sleep(2000);
		WebElement sublink = driver.findElement(By.linkText("Edit My Profile"));
		Actions actions = new Actions(driver);
		Actions newElement = actions.moveToElement(sublink);
		newElement.click().build().perform(); */
		
		//--Perform using contextClick() method -it uses to click on right click
		Actions RC = new Actions(driver);
		RC.contextClick(link).build().perform();
		//Robot class -to open new tab-Keyboard Ops
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());		
       /* robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println(driver.getCurrentUrl());*/
	}

}
