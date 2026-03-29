package Page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Netflixpage {

	protected WebDriver driver;
	
	
	
	public Netflixpage(WebDriver driver) {
	
		
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//a[.='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement entermobile;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement sendotp;
	
	
	public void clicksignin()
	{
		signin.click();
	}
	
	
	public void mobilenumber(String num)
	{
		entermobile.sendKeys(num);
	}
	
	
	public void continuebutton()
	{
		sendotp.click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
}
