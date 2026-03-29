package Script_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[]args)
	{
		
		System.setProperty("wedriver.geckodriver", "./Selenium/geckodriver.exe");
		
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("https://mynta.com/");
		
	}
}
