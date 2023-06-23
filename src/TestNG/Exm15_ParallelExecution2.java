package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exm15_ParallelExecution2 
{
     @Test
	 public void OpenGoogleApp() throws InterruptedException 
	    {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  Thread.sleep(4000);
		  
		  driver.close();
		}
}
