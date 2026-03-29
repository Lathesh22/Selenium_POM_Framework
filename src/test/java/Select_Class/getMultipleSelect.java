package Select_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getMultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriveer.chromedriver", "./Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("file:///C:/Users/ASUS/Downloads/Index.html");
		
		Thread.sleep(1500);
		
		  WebElement address = driver.findElement(By.id("fruits"));
		  Thread.sleep(1500);
		  
		  Select s = new Select(address);
		  ArrayList<String> a1 = new ArrayList<String>();
		  List<WebElement> all = s.getOptions();
		  
		  for(WebElement opt:all)
		  {
			 String list = opt.getText();
			  a1.add(list);
			 
		  }
		 // Collections.sort(a1);//ascening order
		  
		  Collections.sort(a1, Collections.reverseOrder());//Reverse the order
		  for(String a:a1)
		  {
		  
		  System.out.println(a);
		  
		  }
		  driver.quit();
	
	}
	
}
