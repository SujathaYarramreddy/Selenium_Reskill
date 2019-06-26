package reskill_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(8000);
		List<WebElement> iframewindow = driver.findElements(By.tagName("iframe"));
		//List<WebElement> iframewindow = driver.findElements(By.xpath("//iframe"));
		System.out.println("Number of iframe present in application is --->" +iframewindow.size());
		for (WebElement iframe1 : iframewindow) {
			System.out.println(iframe1.getAttribute("name"));
			
		}
		for (int i = 0; i < iframewindow.size(); i++) {
			
			System.out.println(iframewindow.get(i).getAttribute("name"));
		}
		
		driver.switchTo().frame("iframe1");
		String text = driver.findElement(By.xpath("//*[@class='wpb_wrapper']//child::h2/span")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe2");
		driver.findElement(By.linkText("Selectmenu")).click();
		Thread.sleep(3000);
		
		
		

	}

}
