package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement tagname = driver.findElement(By.name("username"));
		
		tagname.click();
		
		Thread.sleep(1500);
		driver.close();
	}

}
