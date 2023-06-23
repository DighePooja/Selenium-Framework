package POM_DDF_TestNG_Utility_BaseClass1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{   
	  WebDriver driver;
    public void InitializeBrowser() 
    {   	
    	   driver=new ChromeDriver();
		   driver.get("https://www.policybazaar.com/");
		   driver.manage().window().maximize();	   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	   
	}
}
