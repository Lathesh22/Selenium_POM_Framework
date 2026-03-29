package HandlingDisableElement;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task_Netflix {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "./Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.netflix.com/in/");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(1000);
//		WebElement address = driver.findElement(By.id(":r0:"));
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView()", address);
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
     	Thread.sleep(1000);
     js.executeScript("document.body.style.zoom='500%'");
     	Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		Thread.sleep(1000);
	File temp = ts.getScreenshotAs(OutputType.FILE);
	Thread.sleep(1500);
	File perm = new File("./SeleniumScreenshot/scrrenshot1.jpg");
	Thread.sleep(1000);
FileHandler.copy(temp, perm);
Thread.sleep(1000);

Date d = new Date();
System.out.println(d);
Thread.sleep(1000);
   String s = d.toString().replace(":", "-");
   System.out.println(s);
Thread.sleep(1000);
	driver.quit();	
	}

}
