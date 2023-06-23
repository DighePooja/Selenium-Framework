package POM_DDF_TestNG_Utility_BaseClass3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Integrate TestNG Annotations and (assertions) with test class.

public class PBSignOutTest1  extends BaseClass //Integrate TestNG
{
	//Declaire Globaly
	PBLoginInPage login;
	PBMobNumPage mobnum;
	PBPwdPage passwd;
	PBHomePage movepointer;
	PBMyAccPage myacc;
	int TCID;
	
	
   @BeforeClass
   public void OpenBrowser() throws EncryptedDocumentException, IOException 
   {
	     InitializeBrowser();
	   
	    //Initialize Locally
	    login=new PBLoginInPage(driver);
	    mobnum=new PBMobNumPage(driver);
	    passwd=new PBPwdPage(driver);
	    movepointer=new PBHomePage(driver);
	    myacc=new PBMyAccPage(driver);

	   
   }
   @BeforeMethod
   public void LogIntoApp() throws InterruptedException, EncryptedDocumentException, IOException 
   {
	   login.ClickPBLoginInPageSignIn();
	   String mobilenum = UtilityClass.getPFData("MobNum");
	   mobnum.inpPBMobNumPageMobNum(mobilenum);
	   mobnum.ClickPBMobNumPageSignInWithPW();
	   String password = UtilityClass.getPFData("PWD");
	   passwd.inpPBPwdPageEnterPW(password);
	   passwd.ClickPBPwdPageSignIn();
	   Thread.sleep(2000);

   }
   @Test
   public void MyAcc() throws InterruptedException 
   {
	   TCID=102;
	   movepointer.MouseOverPBHomePageMyAcc();
	   Thread.sleep(2000);
	   myacc.ClickPBMyAccPageSignOut();
	   Thread.sleep(2000);

   }
   @AfterMethod
   public void LogOut(ITestResult s1) throws InterruptedException, IOException 
   {
	   if(s1.getStatus()==ITestResult.FAILURE)
	   {
		  UtilityClass.captureSS(driver, TCID);
	   }
   }
   @AfterClass
   public void CloseBrowser() 
   {
	   driver.quit();

   }
}
