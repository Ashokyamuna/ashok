package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollers {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("https://www.seleniumeasy.com");
	    
	    
	    c.executeScript("window.ScrollBy(0,400)");
	    Thread.sleep(4000);
	    
	    c.executeScript("window.ScrollBy(0,-400)");
	    Thread.sleep(4000);
	    
	    
		
	}

}