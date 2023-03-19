package seleniumgetmethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.facebook.com");
		
		
		Dimension d =new Dimension(500,200);
		c.manage().window().setSize(d);
		
	}

}
