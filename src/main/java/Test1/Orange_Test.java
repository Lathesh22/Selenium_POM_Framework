package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base1.OpenBrowser;
import Page1.OrangeHRMpage;

public class Orange_Test extends OpenBrowser
{
   @Test(priority = 1)
	public void valid()
	{
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		OrangeHRMpage orp = new OrangeHRMpage(driver);
		orp.enterusername("Admin");
		orp.enterpassword("admin123");
		orp.enterbutton();
		
		
	
	}
	
	
	
	@Test(priority = 2)
	public void invalid()
	{
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		OrangeHRMpage orp = new OrangeHRMpage(driver);
		orp.enterusername("name");
		orp.enterpassword("admin123");
		orp.enterbutton();
		
		String error = orp.getErrorMessage();
	    System.out.println("Error message is: " + error);

	    Assert.assertTrue(error.contains("Invalid credentials"),
	        "Expected error message not found! Actual: " + error);
		
	}
	
	
	
	
}
