package testNGAsserts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class t2 {
	
	public class t1

	{
		
		@Test
		public void t2()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			 ChromeDriver c= new ChromeDriver();
		     c.get("http://www.google.com");
		    Assert.assertEquals(c.getTitle(),"Google");
		    
		   WebElement ele = c.findElementByLinkText("Images");
		   
		   Assert.assertTrue(ele.isDisplayed());
		   Assert.assertFalse(ele.isSelected());
		   c.quit();
		}
		

		
	}

}
