package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.navigate().to("file:///C:/Users/ASUS/Downloads/In1dex.html");
		
//		WebElement address = driver.findElement(By.id("alertBtn"));
//		
//		address.click();
//		
//		Alert a = driver.switchTo().alert();
//		 String text = a.getText();
//		 System.out.println(text);
//		 Thread.sleep(1500);
//		 WebElement confirm = driver.findElement(By.id("confirmBtn"));
//			confirm.click();
//			Thread.sleep(2000);
//			Alert a1 = driver.switchTo().alert();
//			 a1.accept();
//			 Thread.sleep(1500);
		 
		Thread.sleep(2000);
		
		 WebElement prompt = driver.findElement(By.id("promptBtn"));
			prompt.click();
	
			Thread.sleep(2000);
			
			Alert a1 = driver.switchTo().alert();
			a1.sendKeys("Upload");
			Thread.sleep(1500);
			
			 a1.accept();
			 driver.quit();
		 
		 
	}

}
