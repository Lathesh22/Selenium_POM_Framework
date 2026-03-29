package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage { //Here in this class create a class and find all the address of the element need to performe later create constructo amnd create new methods for passing data thats it.
	
	private WebDriver driver;
	
	private  By usernametextbox = By.id("Email");
	private By usernpasswrodtextbox = By.id("Password");
	private By loginbutton = By.xpath("//button[@type='submit']");
	
	
	public LoginPage(WebDriver driver)
	{
	this.driver= driver;	
		
	}
	
	
	public void enterusername(String username) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(usernametextbox).clear();
		driver.findElement(usernametextbox).sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(usernpasswrodtextbox).clear();
		driver.findElement(usernpasswrodtextbox).sendKeys(password);
		
	}
public void login() {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(loginbutton).click();
		
		
	}
	
	
}
