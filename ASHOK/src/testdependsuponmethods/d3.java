package testdependsuponmethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class d3 {

	public class a1 {
		ChromeDriver driver;
		@Test(priority=0, description="visitin website ",groups="K")
		public void visiting()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		    driver.get("http:\\www.google.com");
		}
		
		@Test(priority=1, description="maximising ",groups="K")
		public void max()
		{
			driver.manage().window().maximize();
		}

		@Test(priority=2, description="refreshing website ",groups="K")
		public void refresh()
		{
			driver.navigate().refresh();
		}
		
		@Test(priority=3, description="clicking ",dependsOnGroups="K")
		public void clicking()
		{
			driver.findElementByLinkText("Images").click();
		}
		
		@Test(priority=4, description="quitting ",timeOut=3000,dependsOnGroups="K")
		public void quit() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();
		}

	}
}
