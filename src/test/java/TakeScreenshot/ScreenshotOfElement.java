package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");

	       WebDriver driver   = new ChromeDriver();
	       driver.manage().window().maximize();
	       Thread.sleep(1500);
	       
	       driver.navigate().to("https://www.flipkart.com/");
	       WebElement address = driver.findElement(By.xpath("//a[@title=\"Login\"]"));
	       
	       Thread.sleep(1500);
	       
	       TakesScreenshot ts = (TakesScreenshot) address;
	       
	       File temp =  ts.getScreenshotAs(OutputType.FILE);
	       Thread.sleep(1500);
	       File perm = new File("./SeleniumScreenshot/defect2.jpg");
	       Thread.sleep(1500);
	       FileHandler.copy(temp, perm);
	       Thread.sleep(1500);
	       Date d = new Date();
	    String d1=   d.toString().replace(":", "-");
	       System.out.println(d1);
	       driver.quit();
	}

}
