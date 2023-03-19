package seleniumgetmethods;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.facebook.com");
		
		System.out.println(c.getTitle());
		
		
		System.out.print(c.getCurrentUrl());
		
		Dimension s= c.manage().window().getSize();
		System.out.print("height is "+s.getHeight());
		System.out.print("widht is "+ s.getWidth());
		
		
		Point pt =c.manage().window().getPosition();
		System.out.println("X value is "+ pt.getX());
        System.out.println("Y value is "+ pt.getY());
		
        
        Capabilities f= c.getCapabilities();
        System.out.println("Browser name "+f.getBrowserName());
        System.out.println("version is "+f.getVersion());
        System.out.println("platform is "+f.getPlatform());
        
        
		
		c.quit();
		
		
				}

}
