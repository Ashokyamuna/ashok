package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s3 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
		c.get("http://www.facebook.com");
		
		WebElement s4 = c.findElementByTagName("img");
		System.out.print("Number of images"+s4.getSize());		
		WebElement s5 = c.findElementByTagName("div");
		System.out.print("Number of links"+s5.getSize());
		
		
		WebElement s6 = c.findElementByTagName("input");
		System.out.print("Number of elements with input tag"+s6.getSize());
		
		c.quit();
		

	}

}
