package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exm16_MultibrowserTesting2 
{	
	 @Parameters("BrowserName")
	 @Test
     public void MultiBrowser(String BrowserName ) throws InterruptedException 
     {   
		 WebDriver driver=null;
		    if(BrowserName.equals("chrome"))
			{
				driver= new ChromeDriver();	
			}
			
			else if(BrowserName.equals("firefox"))
			{
				driver= new FirefoxDriver();		
			}
			
			else if(BrowserName.equals("edge"))
			{
			    driver= new EdgeDriver();	
			}
		    
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);
			
			driver.quit();
	 }
}
