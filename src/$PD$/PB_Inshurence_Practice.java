package $PD$;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB_Inshurence_Practice 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
    	FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx") ;
 	    Sheet sh = WorkbookFactory.create(file).getSheet("DDf");
 	   
       WebDriver driver=new ChromeDriver();
  	   driver.get("https://www.policybazaar.com/");
  	   driver.manage().window().maximize();
  	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  	   //click on sign in
  	   driver.findElement(By.xpath("//a[@class='sign-in']")).click();
  	   //enter mob num
  	   driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
  	   //sign in with pw
  	   driver.findElement(By.xpath("//a[@id='central-loggin-with-pwd']")).click();
  	   //enter pwd
  	   driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
       //click on sign in
  	   driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
  	   //
  	   driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();



  	   
  	   
	}
}
