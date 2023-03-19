package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) 
	
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver c = new ChromeDriver();
	c.get("https://www.mycontactform.com/");
	
	c.findElementById("user").sendKeys("Ashok123");
	
	c.findElementByName("pass").sendKeys("12345");
	
	c.findElementByClassName("btn_log").click();
	
	}

}
