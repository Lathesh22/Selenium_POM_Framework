package USing_Keyboard_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Without_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		 WebElement address  = driver.findElement(By.xpath("//input[@id='email']"));
		 Thread.sleep(1500);
		 address.sendKeys("Lathu123@gmail.com");
		 WebElement rm = driver.findElement(By.xpath("//input[@type='text']"));
		 Thread.sleep(1500);
		 rm.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1500);
		 rm.sendKeys(Keys.DELETE);
		 Thread.sleep(3000);
		 driver.quit();
		
		
	}

}
