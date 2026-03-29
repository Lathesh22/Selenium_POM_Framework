package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Of_Total_Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.instagram.com/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	 int count = links.size();
	 
	 Thread.sleep(1000);
	 System.out.println(count);
	 driver.quit();
	}

}
