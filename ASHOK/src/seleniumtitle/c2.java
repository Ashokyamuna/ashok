package seleniumtitle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("http://www.mycontactform.com");
	    
	    
	    c.executeScript("window.confirm('timeout')");
	    Thread.sleep(3000);
	    
	    Alert al = c.switchTo().alert();
	    Thread.sleep(3000);
	    
	    al.accept();
	    
	   
	    
	    
	}

}
