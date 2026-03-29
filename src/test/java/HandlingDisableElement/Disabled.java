package HandlingDisableElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		driver.navigate().to("file:///C:/Users/ASUS/Downloads/index2.html");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;

	 js.executeScript("document.getElementById('t1').value ='admin'");
	 Thread.sleep(1500);
	 js.executeScript("document.getElementById('t1').value =''");
	 Thread.sleep(100);
	 driver.quit();
	 
	 
	}

}
