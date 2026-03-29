package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BASIC {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		 WebElement adddress = driver.findElement(By.id("dropdown-class-example"));
		 Select s = new Select(adddress);
		boolean result = s.isMultiple();
		 
		 if(result==true)
		 {
			 System.out.println("Is multiple");
		 }
		 else
		 {
			 System.out.println("Is Single");
		 }
		s.selectByValue("option2n") ;
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
	}

}
