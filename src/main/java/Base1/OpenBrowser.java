package Base1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {
	
	  protected WebDriver driver;
	 
	
	 @BeforeMethod
	 public void firstset()
	 {
		  
	 driver =  new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	
	 }
	 
	 @AfterMethod
	 public void closing( ITestResult result ) throws IOException 
	 {
		 
		 
		 
		if(result.getStatus()==ITestResult.FAILURE) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
		 File temp	 = ts.getScreenshotAs(OutputType.FILE);
		 
		 String name = result.getName();
		 
		 String  format  = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()); 
		 
		 File perm =  new File("./Selenium/SeleniumScreenshot/"+ name +"_"+format +".jpg");
		 
		 FileUtils.copyFile(temp, perm);
		 
			System.out.println("Screenshot captured successfully"+ name);
			
		}
		 
		 
		 
		 
		 driver.quit();
		 
	 }

}
