package FRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  WebDriver      driver;
	//Constructor
	
	LoginPage( WebDriver driver)
	{
		this.driver= driver;
	}
	
	//Locators
	
 By  username_loc = By.xpath("//input[@name='username']");
 By  password_loc = By.xpath("//input[@name='password']");
 By  login_loc = By.xpath("//button[@type='submit']");
 
 
	//Action methods
	public void SetUserName(String user)
	{
		driver.findElement(login_loc).sendKeys(user);
		
	}
	
	public void SetPassword(String password)
	{
		driver.findElement(password_loc).sendKeys(password);
		
	}

	public void Button()
	{
		driver.findElement(login_loc).click();
		
	}
	
}
