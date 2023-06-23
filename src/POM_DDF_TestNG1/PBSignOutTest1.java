package POM_DDF_TestNG1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PBSignOutTest1 //Integrate TestNG -->Annotations 
{
	//Declaire Globaly
	PBLoginInPage login;
	PBMobNumPage mobnum;
	PBPwdPage passwd;
	PBHomePage movepointer;
	PBMyAccPage myacc;
	Sheet sh;
	WebDriver driver;
	
   @BeforeClass
   public void OpenBrowser() throws EncryptedDocumentException, IOException 
   {
	   FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx") ;
	   sh = WorkbookFactory.create(file).getSheet("DDf");
	   
	   //Initialize Locally
	   driver=new ChromeDriver();	   
	   driver.get("https://www.policybazaar.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	  
	    //Initialize Locally
	    login=new PBLoginInPage(driver);
	    mobnum=new PBMobNumPage(driver);
	    passwd=new PBPwdPage(driver);
	    movepointer=new PBHomePage(driver);
	    myacc=new PBMyAccPage(driver);

	   
   }
   @BeforeMethod
   public void LogIntoApp() throws InterruptedException 
   {
	   login.ClickPBLoginInPageSignIn();
	   String mobilenum = sh.getRow(1).getCell(0).getStringCellValue();
	   mobnum.inpPBMobNumPageMobNum(mobilenum);
	   mobnum.ClickPBMobNumPageSignInWithPW();
	   String password = sh.getRow(2).getCell(0).getStringCellValue();
	   passwd.inpPBPwdPageEnterPW(password);
	   passwd.ClickPBPwdPageSignIn();
	   Thread.sleep(2000);

   }
   @Test
   public void MyAcc() throws InterruptedException 
   {
	   movepointer.MouseOverPBHomePageMyAcc();
	   Thread.sleep(2000);
	   myacc.ClickPBMyAccPageSignOut();
	   Thread.sleep(2000);

   }
   @AfterMethod
   public void LogOut() throws InterruptedException 
   {
	   
   }
   @AfterClass
   public void CloseBrowser() 
   {
	   driver.quit();

   }
}
