package nahla.ba;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NahlaBihac {

	
	public static void main (String[] args) {
		
	   String dir = System.getProperty("user.dir");

       System.setProperty("webdriver.chrome.driver", dir + "\\executable\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
       driver.navigate().to("https://nahla.ba/");
       
       driver.findElement(By.id("menu-item-29")).click();
      
       driver.navigate().back();
       
       Assert.assertEquals(driver.getCurrentUrl(), "https://nahla.ba/", "You're on incorrect page.");
       
       driver.navigate().forward();
       
       Assert.assertEquals(driver.getCurrentUrl(), "https://bihac.nahla.ba/", "You're on incorrect page.");
       
	}
	
}
