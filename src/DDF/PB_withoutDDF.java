package DDF;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PB_withoutDDF 
{
   public static void main(String[] args) throws InterruptedException 
   { 
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.policybazaar.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   //click on sign in button
	   driver.findElement(By.xpath("//a[@class='sign-in']")).click();
	   //Enter mob num
	   driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9307544891");
       //click on sign in with pw btn
	   driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
       //enter pw
	   driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("Dp98$.com");
	   //click on sign in btn
	   driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
	   //mouseover to my acc 
	   WebElement ele = driver.findElement(By.xpath("//div[text()='My Account']"));
	   Actions act=new Actions(driver);	   
       act.moveToElement(ele).perform();
       Thread.sleep(3000);
       
       //click on my profile element
	   driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
       //move focus to child woindow
	   Set<String> allIDs = driver.getWindowHandles();
       ArrayList< String> arl=new ArrayList<>(allIDs);
       driver.switchTo().window(arl.get(1));
       //getFullName
	   String acttext = driver.findElement(By.xpath("(//input[@id='outlined-secondary'])[1]")).getAttribute("value");
       String exptext="Pooja Dighe";
       if(acttext.equals(exptext))
       {
    	   System.out.println("TC pass");
       }
       else
       {
    	   System.out.println("TC fail");
       }	   
       
       driver.quit();
   }
}
