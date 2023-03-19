package testdependsuponmethods;

import org.testng.annotations.Test;

public class d12 {

	
	
	@Test (priority =0,groups="U")
	public void user()
	{
		System.out.println("username");
		
	}
	
	@Test(priority =1,groups="U")
	
	public void pass()
	{
		System.out.println("password");
		
	}
	
	@Test(priority =2,groups="U")
	public void login()
	{
		System.out.println("login");
		
	}
	

	@Test(priority =3,groups="U")
	public void home()
	{
		System.out.println("home");
		
	}
}



