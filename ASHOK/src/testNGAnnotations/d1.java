package testNGAnnotations;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class d1
	
	{
		
		
			ChromeDriver driver;
		
			
		@Test(priority=0)
			public void t1()
			{
				System.out.println("Test case 1");
			
			}
			
			@BeforeTest
			public void bt()
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			    driver.get("https:\\jqueryui.com/");
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
				driver.findElementByLinkText("Slider").click();
			}
		
		
	}



