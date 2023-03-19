package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
	


			
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			    ChromeDriver c = new ChromeDriver();
			    c.get("https://courses.letskodeit.com/practice");
			    
			    c.findElementById("bmwcheck").click();
			    Thread.sleep(3000);
			    
			    c.findElementById("benzcheck").click();
			    Thread.sleep(3000);
			    
			    c.findElementById("hondacheck").click();
			    Thread.sleep(3000);
			    
			    c.quit();	    
			}
			

		}

	}


