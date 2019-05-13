package reskill_Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8_Keyboardops_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Chord(key storkes) will use for to open the multiple tabs -without using Robot Framework
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(2000);
		//--To find the how many windows opened
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("tabs = " +tabs.size());
		driver.switchTo().window(tabs.get(1)); //after clicked on Gmail to go to that window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Create an account')]")).click();
		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles()); //if windows opened newly then need do getWindowHandles again
		System.out.println("After click on Create an account: tabs size = " +tabs1.size());
		driver.switchTo().window(tabs1.get(2));//after clicked on Create an account-to go that window
		Thread.sleep(3000);
		driver.switchTo().window(tabs1.get(0));//to go to home window.
		
		

	}

}
