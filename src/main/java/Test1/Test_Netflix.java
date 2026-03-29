package Test1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base1.OpenBrowser;
import Page1.Netflixpage;


public class Test_Netflix extends OpenBrowser {

	

	@Test
	public void validation() 
	
	{	
		
		Netflixpage tp= new Netflixpage(driver);
			
tp.clicksignin();	
tp.mobilenumber("6362638953");
tp.continuebutton();


String title = tp.getPageTitle();
 Assert.assertTrue(title.contains("Netflix"), "Page title does not match!");
 System.out.println("Page title is: " + title);
		
	}
	
	
}
