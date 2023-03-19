package seleniummousehandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver c = new ChromeDriver();
	    c.get("https://jqueryui.com/datepicker/");
	    
	    c.switchTo().frame(0);
	    
	   c.findElementById("datepicker").click();
	   
    for(int i=0;i<2;i++)
    {
    	c.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
    	
    }
	  
   
   c.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(6) > a").click();
	}

}
