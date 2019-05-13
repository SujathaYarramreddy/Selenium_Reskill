package reskill_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		/*String actualtitle = "Under Construction: Mercury Tours";
		driver.findElement(By.linkText("Home")).click();
		String title1 = driver.getTitle();
		if (title1.equalsIgnoreCase(actualtitle)) {
			System.out.println("Home page is not working");
		}
		else {
			System.out.println("Home page is working");
		}
		driver.findElement(By.linkText("Flights")).click();
		String title2 = driver.getTitle();
		if (title2.equalsIgnoreCase(actualtitle)) {
			System.out.println("Flights page is not working");
		}
		else {
			System.out.println("Flights page is working");
		}
		driver.findElement(By.linkText("Hotels")).click();
		String title3 = driver.getTitle();
		if (title3.equalsIgnoreCase(actualtitle)) {
			System.out.println("Hotels page is not working");
		}
		else {
			System.out.println("Hotels page is working");
		}
		driver.findElement(By.linkText("Car Rentals")).click();
		String title4 = driver.getTitle();
		if (title4.equalsIgnoreCase(actualtitle)) {
			System.out.println("Car rentals page is not working");
		}
		else {
			System.out.println("Car Rentals page is working");
		}
		driver.findElement(By.linkText("Cruises")).click();
		String title5 = driver.getTitle();
		if (title5.equalsIgnoreCase(actualtitle)) {
			System.out.println("Cruises page is not working");
		}
		else {
			System.out.println("Cruises page is working");
		}
		driver.findElement(By.linkText("Destinations")).click();
		String title6 = driver.getTitle();
		if (title6.equalsIgnoreCase(actualtitle)) {
			System.out.println("Destinations page is not working");
		}
		else {
			System.out.println("Destinations page is working");
		}
		driver.findElement(By.linkText("Vacations")).click();
		String title7 = driver.getTitle();
		if (title7.equalsIgnoreCase(actualtitle)) {
			System.out.println("Vacations page is not working");
		}
		else {
			System.out.println("Vacations page is working");
		}*/
		String actualtitle = "Under Construction: Mercury Tours"; //page title can get it from page tab
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkText = new String[linkElements.size()];
		int i =0;
		//Extract the link texts of each link elements
		for (WebElement e:linkElements) {
			linkText[i] = e.getText();
			i++;
			
		}
		for (String t : linkText) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equalsIgnoreCase(actualtitle)) {
				System.out.println("\"" +t+ "\"" + "\" + is Under Construction");
			}
			else {
				System.out.println("\"" +t+ "\"" + "\" + is Working");	
			}
		
			driver.navigate().back();
			//driver.navigate().to("URL");
			//driver.navigate().forward();
			//driver.navigate().refresh();
			
		}
		driver.quit();
	}

}
