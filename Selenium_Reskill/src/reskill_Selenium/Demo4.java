package reskill_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//WebElement link = driver.findElement(By.linkText("Car Rentals")); //can write the below command to find the element
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Car Rentals')]")); 
		//Click operation with Actions and Action command
		Actions build = new Actions(driver);  //to perform the actions-mainly will use it for Alerts class
		Action moverover = build.moveToElement(link).build();
		moverover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();
		driver.navigate().back();
		build.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform(); //to use the tab key
		
		
	}

}
