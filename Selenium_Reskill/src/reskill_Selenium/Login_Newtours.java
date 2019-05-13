package reskill_Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_Newtours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("sunil");
		String username = driver.findElement(By.name("userName")).getAttribute("value"); //to get the feteched value in the text box
		System.out.println(username);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> opt = sel.getOptions();
		System.out.println(opt.size());
		for (int i = 0; i < opt.size(); i++) {
			System.out.println(opt.get(i).getText()); //to print the data in drop down
			
		}
		sel.selectByVisibleText("2");
		WebElement DDFrom = driver.findElement(By.name("fromPort"));
		Select selFrom = new Select(DDFrom);
		List<WebElement> opt1 = selFrom.getOptions();
		System.out.println(opt1.size());
		for (int j = 0; j < opt1.size(); j++) {
			System.out.println(opt1.get(j).getText());
		}
		selFrom.selectByVisibleText("London");
		driver.findElement(By.xpath("//*[@type='radio' and @value='Business']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Sujatha");
		driver.findElement(By.name("passLast0")).sendKeys("Yarramreddy");
		driver.findElement(By.name("passFirst1")).sendKeys("Adithya");
		driver.findElement(By.name("passLast1")).sendKeys("Yeraballi");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//*[@name='ticketLess' and @value='checkbox']")).click();
		//driver.findElement(By.xpath("(//*[@name='ticketLess' and @value='checkbox'])[2]")).click();
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));//both check boxes has same values
		for (WebElement e : checkbox) {
			e.click();
			
		}
		/*for (int i = 0; i < checkbox.size()-1; i++) {
			checkbox.get(i).click(); //to click on sigle checkbox using for loop.
			
		}*/
		driver.findElement(By.name("buyFlights")).click();
		

	}

}
