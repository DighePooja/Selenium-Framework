package POM_DDF_TestNG_Utility_BaseClass5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
    WebDriver driver;
	
   public void InitializeBrowser() 
   {

		  driver=new ChromeDriver();
		  driver.get("URL");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
   }
}
