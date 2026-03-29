package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriveer.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("file:///C:/Users/ASUS/Downloads/Index.html");
		
		Thread.sleep(1500);
		
		  WebElement address = driver.findElement(By.id("fruits"));
		  Thread.sleep(1500);
		  Select s = new Select(address);
		  Thread.sleep(1000);
		  
		  s.selectByValue("apple");
		  Thread.sleep(1000);
		  s.selectByValue("mango");
		  Thread.sleep(1000);
		
		s.deselectAll();
		Thread.sleep(1500);
		driver.quit();
		
		
		
		
		
		
		
	}

}
