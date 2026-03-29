package Geturls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Url {

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.close();
		
	}
}
