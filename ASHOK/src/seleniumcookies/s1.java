package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.google.com");
		
		
		Set<Cookie> s = c.manage().getCookies();
		System.out.print("number of cookies "+s.size());
		
		for (Cookie x:s)
		{
			
			System.out.print("Name is "+x.getName());
			System.out.print("Name is "+x.getValue());
			System.out.print("Name is "+x.getExpiry());
			
		}
		
		c.quit();
		
		
	}

}
