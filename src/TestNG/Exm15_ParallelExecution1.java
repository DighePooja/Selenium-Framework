package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exm15_ParallelExecution1 
{
	@Test
    public void OpenfaceBookApp() throws InterruptedException 
    {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  Thread.sleep(4000);
	  
	  driver.close();
	}
}
