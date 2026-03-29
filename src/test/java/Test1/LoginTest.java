package Test1;



import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void TestValidLogin() {
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterusername("admin@yourstore.com");
		
		loginpage.enterpassword("admin");
		loginpage.login();
		
		System.out.println("The tile of the page is : "+driver.getTitle());
		
		 String expectedTitle = "Dashboard / nopCommerce administration";
		    String actualTitle = driver.getTitle();
		    Assert.assertEquals(actualTitle, expectedTitle, 
		                        "Login Failed! Title didn't match");
		
		
	}

}
