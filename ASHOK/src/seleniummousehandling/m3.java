package seleniummousehandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m3 {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("https://jqueryui.com/slider//");
	    
	    
	    c.switchTo().frame(0);
	    
	    WebElement ele = c.findElementById("slider");
	    
	    Actions ac =new Actions (c);
	    
	    ac.dragAndDropBy(ele, 400, 0).build().perform();
	    c.quit();
	    
	    
	    
	    
	}

}
