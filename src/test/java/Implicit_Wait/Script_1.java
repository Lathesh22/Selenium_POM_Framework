package Implicit_Wait;


import java.time.Duration;  // <-- important import

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement usn = driver.findElement(By.name("email"));
	    WebElement password = driver.findElement(By.id("pass"));
	     WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	     usn.sendKeys("Lathesh@123gmail.com");
	     password.sendKeys("Abcd@1234");
	     login.click();
	     driver.quit();
	}

} 
