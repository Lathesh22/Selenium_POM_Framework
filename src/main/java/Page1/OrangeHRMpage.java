package Page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMpage {

	protected WebDriver driver;
	
	public OrangeHRMpage(WebDriver driver)
	{
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//input[@name='username']") 
	WebElement username;
	
	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	
	WebElement button;
	
	
	public void enterusername( String usn)
	{
		username.sendKeys(usn);
	}
	
	public void enterpassword( String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterbutton()
	{
		button.click();
	}

	public String getErrorMessage() {
		
		return null;
	}
}
