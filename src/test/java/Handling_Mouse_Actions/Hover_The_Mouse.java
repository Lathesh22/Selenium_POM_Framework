package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Hover_The_Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1500);
		
		Actions a = new  Actions(driver);
		Thread.sleep(1555);
		a.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
