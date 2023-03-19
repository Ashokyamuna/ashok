package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("https://courses.letskodeit.com/practice");
	    
	    c.findElementById("bmwradio").click();
	    Thread.sleep(3000);
	    
	    c.findElementById("benzradio").click();
	    Thread.sleep(3000);
	    
	    c.findElementById("hondaradio").click();
	    Thread.sleep(3000);
	    
	    c.quit();	    
	}
	

}
