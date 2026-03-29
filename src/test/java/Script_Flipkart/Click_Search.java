package Script_Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2500);
		 System.out.println("Flipkart opened succesfully");
		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Thread.sleep(1500);
		search.click();
		System.out.println("Clicked on search text field");
		search.sendKeys("Lg washing machine");
		Thread.sleep(2000);
		System.out.println("Enetered the value Succesfully");
		
		WebElement clicks = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		clicks.click();
		
		Thread.sleep(1500);
		System.out.println("Products dsiplayed succesfully");
		
		WebElement  save = driver.findElement(By.partialLinkText("₹17,990"));
		save.click();
		System.out.println("Clicked succesfully");
		
		Thread.sleep(1500);
		driver.quit();
		
	}

}

