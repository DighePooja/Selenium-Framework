package POM_DDF_TestNG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest //TestNg Integration with TestClass-->Assertion and annotations
{  
	PBSignInPage sign;
	PBMobnumPage mobnum;
	PBPasswordPage pass;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet sh;
	   @BeforeClass
	   public void OpenBrowser() throws EncryptedDocumentException, IOException
	   {
		   FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx");
		   sh= WorkbookFactory.create(file).getSheet("DDF");
		   driver=new  ChromeDriver();
		   driver.get("https://www.policybazaar.com/");
		   driver.manage().window().maximize();	   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   
		    sign=new PBSignInPage(driver);
		    mobnum=new PBMobnumPage(driver);
		    pass=new PBPasswordPage(driver);
		    home=new PBHomePage(driver);
		    myacc=new PBMyAccPage(driver);
		    profile=new PBProfilePage(driver);
	   }	   
	   @BeforeMethod
	   public void LoginToApp() throws InterruptedException
	   {
		   sign.ClickPBSignInPageSignIN();
		   mobnum.InpPBMobnumPageMobNum(sh.getRow(1).getCell(0).getStringCellValue());
		   mobnum.ClickPBMobnumPageSignInWithPW();
		   pass.InpPBPasswordPagePW(sh.getRow(2).getCell(0).getStringCellValue());
           pass.ClickPBPasswordPageSignIn();
           Thread.sleep(3000);
	   }   
	   @Test
	   public void VerifyFullName() throws InterruptedException
	   {
		   home.MouseoverPBHomePageMyAcc();
		   Thread.sleep(3000);
		   myacc.ClickPBMyAccPageMyProfile(); 
		   profile.SwithPBProfilePageChildWindow();
		   Thread.sleep(2000);
		   String acttext=profile.VerifyPBProfilePageFullName();
		   String exptext =sh.getRow(0).getCell(0).getStringCellValue();	  		   
		   Assert.assertEquals(acttext, exptext,"Failed Both result are diff");
	   }	   
	   @AfterMethod
	   public void LogOut()
	   {
		   
	   }	   
	   @AfterClass
	   public void CloseBrowser() throws InterruptedException
	   {
		  Thread.sleep(3000); 
		  driver.quit();
	   }
}
