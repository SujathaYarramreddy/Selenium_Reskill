package reskill_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.tagName("title")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(8000);
		//to click on the ok button of the alert
		alert.accept();
		//to click on cancel button
		/*alert.dismiss();
		//to get the text of alert
		alert.getText();
		//want to pass some values in to alert
		alert.sendKeys("Yes");*/
		
		

	}

}
