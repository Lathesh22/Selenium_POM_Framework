package FRAMEWORK2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Test {

	WebDriver driver;
	
	
	@BeforeMethod
	void setup()
	{
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/account/login?ret=https%3A%2F%2Fwww.flipkart.com%2Ffpg%2Fcbc%2Fsbi%2Fstore-page%3Futm_source%3DGSN_OTA%26utm_context%3DSEM%26cmpid%3Dcontext_23394340014_gmc_pla%26entryMethod%3D23394340014%26gad_source%3D1%26gad_campaignid%3D23394340014%26gbraid%3D0AAAAADxRY59zkSuxdfcd81aBgXqxadJHu%26gclid%3DCjwKCAiAh5XNBhAAEiwA_Bu8FTWbQlmg4YuZbGDGQKc3hL_noRr4tQjEuSL0-JI14aKwqwPlAtIhyRoCHeUQAvD_BwE");
		driver.manage().window().maximize();
		
		
	}
	
	
	@org.testng.annotations.Test
	
	void test()
	{
		Page p = new Page();
		p.Enter_Mobile_Number("1234567890");
		
	}
	
	
}
