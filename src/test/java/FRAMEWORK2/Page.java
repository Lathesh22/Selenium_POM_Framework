package FRAMEWORK2;

import org.openqa.selenium.By;

public class Page extends Base {

	
	
	 By Enter_Mobile_Number = By.xpath("//input[@type='text']");
	 By Get_the_Otp = By.xpath("//button[.='Request OTP']");
	 
	 public void Provide(String number)
	 {
		 
		 driver.findElement(Enter_Mobile_Number).sendKeys(number);
	 }
	 
	
	 public void click()
	 {
		 
		 driver.findElement(Get_the_Otp).click();
	 }
	
}
