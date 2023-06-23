package POM_DDF_TestNG_Utility_BaseClass4;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Integrate TestNG Assertion and Annotains with test calss-->Baseclass and utility class

public class PBLoginTest extends BaseClass 
{  
	PBSignInPage sign;
	PBMobnumPage mobnum;
	PBPasswordPage pass;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	int TCID;
	
	   @BeforeClass
	   public void OpenBrowser() throws EncryptedDocumentException, IOException
	   {
		  
            InitializeBrowser();
            
		    sign=new PBSignInPage(driver);
		    mobnum=new PBMobnumPage(driver);
		    pass=new PBPasswordPage(driver);
		    home=new PBHomePage(driver);
		    myacc=new PBMyAccPage(driver);
		    profile=new PBProfilePage(driver);

	   }
	   
	   @BeforeMethod
	   public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	   {
		   sign.ClickPBSignInPageSignIN();
		   mobnum.InpPBMobnumPageMobNum(UtilityClass.getPFdata("MobNum"));
		   mobnum.ClickPBMobnumPageSignInWithPW();
		   pass.InpPBPasswordPagePW(UtilityClass.getPFdata("PWD"));
           pass.ClickPBPasswordPageSignIn();
           Thread.sleep(3000);
	   }
	   
	   @Test
	   public void VerifyFullName() throws InterruptedException, EncryptedDocumentException, IOException
	   {
		   TCID=102;
		   home.MouseoverPBHomePageMyAcc();
		   Thread.sleep(3000);
		   myacc.ClickPBMyAccPageMyProfile(); 
		   profile.SwithPBProfilePageChildWindow();
		   Thread.sleep(2000);
		   String acttext=profile.VerifyPBProfilePageFullName();
		   String exptext =UtilityClass.getTestData(0, 0);	  
		   
		   Assert.assertEquals(acttext, exptext,"Failed Both result are diff");
	   }
	   
	   @AfterMethod
	   public void TakeSSOfFailedTC(ITestResult s1) throws IOException
	   {
		  if(s1.getStatus()==ITestResult.FAILURE)
		  {
			  UtilityClass.captureSS(driver, TCID);
		  }
	   }
	   
	   @AfterClass
	   public void CloseBrowser() throws InterruptedException
	   {
		  Thread.sleep(3000); 
		  driver.quit();
	   }
}
