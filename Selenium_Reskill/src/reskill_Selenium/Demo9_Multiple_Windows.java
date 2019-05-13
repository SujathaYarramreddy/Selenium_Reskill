package reskill_Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//This is to identify the Parent Window
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window is ---->" +parentwindow);
		WebElement Clickbutton = driver.findElement(By.id("button1"));
		//To click on the Button
		for (int i = 0; i < 3; i++) {
			Clickbutton.click();
			Thread.sleep(2000);
		}

		//This is to identify the Child window
		List<String> childwindow = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Child window is --->" +childwindow);
		String lastwindow = "";
		for (int i = 1; i < childwindow.size(); i++) {
			driver.switchTo().window(childwindow.get(i));
			driver.navigate().to("https://www.google.com/");
			lastwindow = childwindow.get(i).toString();
			
		}
		//Switching back to my parent window
		driver.switchTo().window(parentwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.close();
		//Navigating Last Child window
		driver.switchTo().window(lastwindow);
		driver.get("http://newtours.demoaut.com/");
		driver.quit(); //close all open windows including last window
		
		
	}

}
