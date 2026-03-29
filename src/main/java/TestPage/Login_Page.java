package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	private WebDriver driver;
	
	
	private By search = By.xpath("(//input[@type=\"text\"])[1]");
	private By button = By.xpath("//button[@type=\"submit\"]");
	private By  offer = By.xpath("//a[text()=\"Offer Zone\"]");

	
	public Login_Page() {
		
		this.driver = driver;
			
	}
	
	public void searchbutton(String searchbar) {
		
		
		driver.findElement(search).sendKeys(searchbar);
		
	}
public void clickbutton() {
		
		
		driver.findElement(button).click();
		
	}

public void offerbutton() {
	
	driver.findElement(offer).click();	
	
}


}
