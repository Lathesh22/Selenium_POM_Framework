package Geturls;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		String  pagesource= driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
