package Handling_Mouse_Actions;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(1500);
		
		Actions a = new  Actions(driver);
		Thread.sleep(1555);
		a.contextClick(element).perform();
		Thread.sleep(1200);
		System.out.println("PErformed Correctly");
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1400);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1400);
		driver.quit();
		
	}

}
