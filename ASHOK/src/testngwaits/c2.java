package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class c2 {
	
	@Test
		public void t1()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver c= new ChromeDriver();
			c.get("http://www.google.com");
			WebDriverWait w= new WebDriverWait(c,6);
			//title
			w.until(ExpectedConditions.titleIs("Go"));
			w.until(ExpectedConditions.titleContains("oo"));
			
			//alert
			//w.until(ExpectedConditions.alertIsPresent());
			
			// findind the element and checking its visibility
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));//6
			
			//more than one
			//collecting all the images, checking its visibility
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
			
			//clickable
			//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
			
			c.quit();
		}
	}



