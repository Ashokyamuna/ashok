package testNGAsserts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class t1

{
	
	@Test
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver c= new ChromeDriver();
	     c.get("http://www.facebook.com");
	    Assert.assertNotEquals(c.getTitle(),"Facebook");
	   
	}
	

	
}
