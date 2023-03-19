package testdependsuponmethods;

import org.testng.annotations.Test;

public class D1
{

	@Test(priority=0)
	
	public void login()

{
	
		System.out.print("login");
}
	
	@Test (priority=1,dependsOnMethods="login")
	public void home()

	{
		
			System.out.print("home");
	}
		
	
}
