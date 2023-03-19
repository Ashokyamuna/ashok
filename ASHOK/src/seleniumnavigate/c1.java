package seleniumnavigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("http://www.google.com");
	    Thread.sleep(3000);
	    
	    c.findElementByLinkText("Images").click();
	    Thread.sleep(3000);
	    
	    c.navigate().forward();
	    
	    c.navigate().back();
	    
	    
	    
	    
	    
	    	
	    
	    
	    
	}

}
