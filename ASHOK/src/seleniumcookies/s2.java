package seleniumcookies;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {

	public static void main(String[] args)
	{
	
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			    ChromeDriver c = new ChromeDriver();
				c.get("http://www.google.com");
				c.manage().deleteAllCookies();
				
				Set<Cookie> s = c.manage().getCookies();
				System.out.print("number of cookies "+s.size());
			
				
				c.quit();
				
				
			}

		}
	


