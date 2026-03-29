package Script_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2500);
		 System.out.println("Flipkart opened succesfully");
		 driver.quit();
		 
				
	}

}
