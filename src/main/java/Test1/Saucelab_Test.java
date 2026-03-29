package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base1.OpenBrowser;
import Page1.Saucelab_Page;

public class Saucelab_Test extends OpenBrowser {

	@Test(priority = 1)
	public void valid()
	{
		driver.navigate().to("https://www.saucedemo.com/");
		Saucelab_Page sp= new Saucelab_Page(driver);
		
		sp.enterusernmae("standard_user");
		sp.enterpasswortd("secret_sauce");
		sp.enterbutton();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Valid login failed!");
	}
	
	@Test(priority = 2)
	public void invalid()
	{
		driver.navigate().to("https://www.saucedemo.com/");
		Saucelab_Page sp= new Saucelab_Page(driver);
		
		sp.enterusernmae("invalid_user");
		sp.enterpasswortd("wrong_password");
		sp.enterbutton();
		
		Assert.assertTrue(sp.getErrorMessage().contains("Epic sadface"), "Invalid login failed!");
		
	}
}
