package reskill_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement enb = driver.findElement(By.xpath("//*[@type='text']"));
		if(enb.isEnabled()) {
			enb.sendKeys("sunil");	
			
			}
		
       if(driver.findElement(By.xpath("//*[@type='text']")).isDisplayed()) {
    	   driver.findElement(By.xpath("//*[@type='password']")).sendKeys("sunil");
    	   driver.findElement(By.name("login")).click();
       }
       if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected()) {
    	   driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
       }
	}

}
