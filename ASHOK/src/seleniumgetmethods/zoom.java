package seleniumgetmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoom {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.facebook.com");
		
		
		c.executeScript("document.body.style.zoom='200%'");
		
		Thread.sleep(3000);
		
		c.executeScript("document.body.style.zoom='100%'");
		
		Thread.sleep(3000);
		
		c.executeScript("document.body.style.zoom='20%'");
		
		Thread.sleep(4000);
		
		c.quit();
		
				
	}

}
