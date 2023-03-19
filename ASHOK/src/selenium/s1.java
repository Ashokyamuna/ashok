package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.facebook.com");
		
		c.manage().window().maximize();
		
		c.navigate().refresh();
		
		Thread.sleep(3000);
		
		c.quit();
		
		
		
	}
	
}
