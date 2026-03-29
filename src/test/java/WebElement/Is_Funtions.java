package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Funtions {

	
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		
		Thread.sleep(1500);
		
	  WebElement address = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
	  if(address.isDisplayed());
			  {
		  if(address.isEnabled());
		  {
			  if(address.isSelected());
			  {
				  System.out.println("Is already Selected");
			  }
			  Thread.sleep(1500);
			  address.click();
			  }	
	
			  }
	  
	  Thread.sleep(1500);
		driver.close();	
	}
}
