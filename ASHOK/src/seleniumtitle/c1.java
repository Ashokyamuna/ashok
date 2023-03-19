package seleniumtitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("http://www.google.com");
	    
	    
	    System.out.print(c.executeScript("return document.title"));
	    System.out.print(c.executeScript("return document.URL"));
	    
	    c.quit();
	    
	}

}
