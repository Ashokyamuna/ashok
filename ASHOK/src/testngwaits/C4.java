package testngwaits;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class C4 {
	
    @Test
	public void t1()
	{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver c= new ChromeDriver();
		c.get("http://www.facebook.com");
		c.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		c.navigate().refresh();//4
		System.out.println(c.getTitle());//4
		System.out.println(c.getCurrentUrl());//4
		WebElement ele = c.findElementByLinkText("ashok"); //4
		ele.click();//4
		c.quit();//4
	}

}


