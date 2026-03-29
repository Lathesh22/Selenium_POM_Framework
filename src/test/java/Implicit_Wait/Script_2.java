package Implicit_Wait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Script_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");


      WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	    WebElement usn = driver.findElement(By.name("email"));
	    
	    ew.until(ExpectedConditions.visibilityOf(usn));
	    
	    WebElement password = driver.findElement(By.id("pass"));

	    ew.until(ExpectedConditions.visibilityOf(password));
	    
	     WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

		    ew.until(ExpectedConditions.visibilityOf(login));
		    
	     usn.sendKeys("Lathesh@123gmail.com");
	     password.sendKeys("Abcd@1234");
	     login.click();
	     driver.quit();
	}

}
