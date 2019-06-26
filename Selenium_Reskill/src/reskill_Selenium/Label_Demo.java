package reskill_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Label_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[contains(text(),'Email')]"));
		System.out.println(driver.findElement(By.xpath("//*[@id='email']//parent::td//parent::tr//preceding-sibling::tr/td/label")).getText()); //parent Xpath
		//--Another Xpath using 'ancestor' - //*[@id='email']//ancestor::tr//preceding-sibling::tr/td/label
		//child:- following-sibling -//*[@id='email]//parent::td//following-sibling::td//*[@name='pass']
		
	}

}
