package seleniummousehandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver(); 
	    c.get("http://www.mycontactform.com");
	    WebElement ele = c.findElementByName("btnSubmit");
	    
	    
	    
	    Actions ac = new Actions(c);
	    
	    ac.moveToElement(ele).click().build().perform();
	    
	
	    
	    Thread.sleep(4000);
	    
	    c.quit();
	    
	    
	}

}
