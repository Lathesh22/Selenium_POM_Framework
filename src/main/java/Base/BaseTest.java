package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest { //mention all the browser action in the base class by creating different methods like below
	
	
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setup(){
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F");
		
	}
	
	
	@AfterMethod
	public void teardown(){
		
		
	 if(driver!=null)
	 {
		 driver.quit();
	 }
	 
	 
	}
	
	

}
