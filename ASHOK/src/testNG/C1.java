package testNG;

import org.testng.annotations.Test;

public class C1 {

	
	@Test( priority=0,description=" first",groups ="p",enabled= false)
	public void a1()
	{
		System.out.println("test case 1");
		
	}
	@Test( priority=1,description=" second",groups ="q")
	public void b1()
	{
		System.out.println("test case 2");
		
	}
	@Test( priority=2,description=" third",groups ="p")
	public void d1()
	{
		System.out.println("test case 3");
		
	}

	
}

