package seleniumnavigate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class c2 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
	 
	 
	 String parent=driver.getWindowHandle();
	  Set<String> s1 = driver.getWindowHandles();
	  
	 Iterator<String> I = s1.iterator();  
	   
	  
	  while(I.hasNext())
	     {
	       String child_window=I.next();
	       if(!parent.equals(child_window))
	    	   
	    	 
	         driver.switchTo().window(child_window);
	         System.out.println(driver.getTitle());
	         Thread.sleep(4000);
	         
	         driver.findElementByLinkText("Maven").click();
	         Thread.sleep(4500);
	         driver.close();
	     	  }
	       

    driver.switchTo().window(parent);
    System.out.println(driver.getTitle());
    Thread.sleep(5000);
    driver.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    driver.quit();
         
	       }
	    
	     }
	  

	
	


	
	
	  
	    
	    


	


