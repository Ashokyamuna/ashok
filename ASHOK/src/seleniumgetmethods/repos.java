package seleniumgetmethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repos {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.facebook.com");
		
		
		Point pt =new Point (300,20);
		c.manage().window().setPosition(pt);
	}

}
