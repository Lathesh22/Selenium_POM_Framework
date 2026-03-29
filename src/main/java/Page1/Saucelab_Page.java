package Page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucelab_Page {

	protected WebDriver driver;
	
	public Saucelab_Page(WebDriver driver) {
	
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='user-name']")
WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	
	WebElement button;
	
	
	@FindBy(css=".error-message-container")
	WebElement errormessage;

	
	
	public void enterusernmae(String user) {
		username.sendKeys(user);
	}
	
	public void enterpasswortd(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterbutton() {
		button.click();

	}
	
	public String getErrorMessage() {
	    return errormessage.getText();
	}
	
}
