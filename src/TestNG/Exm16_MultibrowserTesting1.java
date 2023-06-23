package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exm16_MultibrowserTesting1 
{	
	 @Parameters("BrowserName")
	 @Test
     public void MultiBrowser(String BrowserName ) throws InterruptedException 
     {   
	    WebDriver driver=null;
		 
		if(BrowserName.equals("edge"))
		{
		    driver= new EdgeDriver();	
		}
		
		else if(BrowserName.equals("firefox"))
		{
			driver= new FirefoxDriver();		
		}
		
		else if(BrowserName.equals("chrome"))
		{
			driver= new ChromeDriver();	
		}
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.quit();
	 }
}
