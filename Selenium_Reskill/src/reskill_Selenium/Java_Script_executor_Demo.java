package reskill_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java_Script_executor_Demo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//--document is command to execute the particular script -we can learn through java script
		String title = js.executeScript("return document.title").toString(); //since we are using return using toString() method
		System.out.println(title);
		String URL = js.executeScript("return document.URL").toString();
		System.out.println(URL);
		//Using Driver getting title and URL
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		String title1 = driver.getTitle();
		System.out.println(title1);
		//--Getting the domain
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		//--To find the element and send the value
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		js.executeScript("history.go(0)"); //to Refresh the web page
		Thread.sleep(2000);
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		WebElement web = (WebElement)js.executeScript(" return document.getElementById('txtUsername')");
		System.out.println(web.getAttribute("value"));
		//js.executeScript("document.getElementById('txtPassword').value='admin123'");
		js.executeScript("document.querySelector('input#txtPassword').value='admin123'"); //querySelector is like CSS selector
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		//Page down using JavaScript Executor
		//js.executeScript("window.scrollBy(0,800)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//to go to end of the line
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//to go to top of the line
		//Page down using Actions class
		/*Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Page down using Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN); */
		//js.executeScript("document.getElementById('ohrmList_chkSelectRecord_67').scrollIntoView()"); //to page down using Java script
		//--print the Table data using Webdriver
		/*List<WebElement> columns = driver.findElements(By.tagName("td"));
		for (WebElement webElement : columns) {
			System.out.println(webElement.getText());
		}*/
		//--print the Table data using Java Script
		String table = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		System.out.println(table);
		//--To print entire HTML of that elementid
		/*String html = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
		System.out.println(html);*/
		//--to go back and forward using driver
		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();*/
		//--to go back and forward using driver
		Thread.sleep(2000);
		js.executeScript("window.history.back()");	
		Thread.sleep(2000);
		js.executeScript("window.history.forward()");	
		js.executeScript("alert('Welcome to the session on Selenium')");
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept();
		js.executeScript("confirm('Enter the credential')");
		alert = driver.switchTo().alert();
		alert.dismiss();
		js.executeScript("prompt('Enter Yes/No','Enter the Option')");
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Yes");
		Thread.sleep(3000);
		
		
		
	}

}
