package TestNG_Clas;

import org.testng.annotations.Test;

/*
 1) Open the app
 
 2) login
 
 3) logout
 */
public class Class_1 {
	
	@Test
	void open_the_app()
	{
		System.out.println("Opened Succesfully");
	}
	@Test
	void login()
	{
		System.out.println("Logged In");
	}
	
	@Test
	void logout()
	{
		System.out.println("Logged Out");
	}

}
