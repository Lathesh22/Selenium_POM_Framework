package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebElement address = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		 Thread.sleep(1500);
		 
	Point location = address.getLocation();
	
	Thread.sleep(1500);
	int y= location.getY();
	Thread.sleep(1500);
	int x= location.getX();
	Thread.sleep(1500);
	
	
	 Point P = new Point(x, y);
	 
	driver.manage().window().setPosition(P);
	Thread.sleep(1000);
	driver.quit();
	
	}
	

}
