package Script_Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_In_flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	 int count = links.size();
	 
	 Thread.sleep(1000);
	 System.out.println(count);
	 driver.quit();
	}

}
