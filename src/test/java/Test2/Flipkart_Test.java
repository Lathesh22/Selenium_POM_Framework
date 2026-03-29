package Test2;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import BaseTest.BaseTest1;
import TestPage.Login_Page;

public class Flipkart_Test extends BaseTest1{
	
	@Test
	public void testvalidation() {

	Login_Page l_p = new Login_Page();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	l_p.searchbutton("Mobile");
	l_p.clickbutton();
	l_p.offerbutton();
	
	System.out.println("The Pages opened succesfully");
	
	String actual_result= driver.getTitle();
	String expected_result = "Offerzone";
	
}
}