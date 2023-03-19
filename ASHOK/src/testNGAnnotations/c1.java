package testNGAnnotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 
{
	public class a1 {

		/*before test   : run only once before all the test cases started its execution
		 * after test   : run only once after all the test cases finished its executin
		 * 
		 * 
		 * before class: run only once, after before test
		 * after class: run only once, before after test 
		 * 
		 * before method:  run before each test case 
		 * After method:   run after each test case 
		 * 
		 * before test : visit
		 *   before class: max 
		 *       before method: refresh   tc1: title   after method: deleting cookies
		 *       before method: refresh   tc2 : click   aftermethod: deleting cookies 
		 *   after class : url
		 * after test : quit
		 * * 
		 * */
		ChromeDriver driver;
		@BeforeMethod
		public void bm()
		{
			System.out.println("before method");
			driver.navigate().refresh();
		}
		
		@AfterMethod
		public void am()
		{
			System.out.println("after method");
			driver.manage().deleteAllCookies();
		}
		@BeforeClass
		public void bc()
		{
			System.out.println("before class");
			driver.manage().window().maximize();
		}
		
		@AfterClass
		public void ac()
		{
			System.out.println("after class");
			System.out.println(driver.getCurrentUrl());
		}
		
		@Test(priority=0)
		public void t1()
		{
			System.out.println("Test case 1");
			System.out.println(driver.getTitle());
		}
		
		@BeforeTest
		public void bt()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		    driver.get("http:\\www.google.com");
			System.out.println("Before test ");
		}
		
		@AfterTest
		public void at()
		{
			System.out.println("after test");
			driver.quit();
		}
		
		@Test(priority=1)
		public void t2()
		{
			System.out.println("Test case 2");
			driver.findElementByLinkText("Images").click();
		}
	}
	
}
