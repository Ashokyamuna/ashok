package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class dropdownbox {

	public static void main(String[] args) throws InterruptedException
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("https://courses.letskodeit.com/practice");
	    
	
		WebElement ele=c.findElementById("multiple-select-example");
		
		Select s =new Select(ele);
		
		
	    s.selectByIndex(0);
		
		Thread.sleep(3000);
		
        s.selectByValue("Orange");
		
		Thread.sleep(3000);
		
		
         s.selectByVisibleText("Peach");
		
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
	s.deselectByIndex(1);
	
	
	c.quit();
	
	
		
		
		
}

}
