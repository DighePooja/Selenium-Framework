package $PD$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.nykaa.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   Thread.sleep(4000);
	   
	   
	   
	   String quantity = driver.findElement(By.xpath("//div[@class='css-1hppjzv']")).getText();
	   System.out.println(quantity);
  }
}
