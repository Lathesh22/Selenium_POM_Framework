package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 WebElement address = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		 Thread.sleep(1500);
		 
	 Dimension location = address.getSize();
	Thread.sleep(1500);
		int height= location.getHeight();
		int width= location.getWidth();
		Thread.sleep(1500);
		
		System.out.println("Height= "+height);
		System.out.println("Width= "+width);
		driver.quit();
	}

}
