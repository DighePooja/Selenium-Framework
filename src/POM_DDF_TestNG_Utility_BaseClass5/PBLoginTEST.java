package POM_DDF_TestNG_Utility_BaseClass5;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTEST extends BaseClass
{
	PBSignInPage sign;
	PBMobNumPage mobnum;
	PBPasswordPage PWD;
	PBHomePage Myacc;
	PBMyAccPage Myprofile;
	PBProfilePage Fullname;
	int TCID;
	
	//@BeforeClass
	public void OpenBrowser() 
	{
		InitializeBrowser();
		
		sign=new PBSignInPage(driver);		
		mobnum=new PBMobNumPage(driver);
		PWD=new PBPasswordPage(driver);
		Myacc=new PBHomePage(driver);
		Myprofile =new PBMyAccPage(driver);
		Fullname=new PBProfilePage(driver);
	}
	
	@BeforeMethod
	public void Login() throws IOException, InterruptedException 
	{
		sign.ClickPBSignInPageSignIN();
		mobnum.InpPBSignInPageMobNum(UtilityClass.getPFdata("MobNum"));
		mobnum.ClickPBMobNumSignInWithPWD();
		PWD.InpPBSignInPagePWD(UtilityClass.getPFdata("PWD"));
		PWD.ClickPBPasswordPageSignIN();
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyFullName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID=109;
		Myacc.OpenDropDownOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		Myprofile.ClickPBMyAccPageMyProfile();
		Fullname.SwitchPBProfilePageChildWindow();
		String ActText=Fullname.VerifyPBProfilePageFullName();
		String ExpText=UtilityClass.getTestData(0, 0);
		Assert.assertEquals(ActText, ExpText,"Failed Both results are diffrent");
		
	}
		
	@AfterMethod
	public void FailedTCSS(ITestResult s1) throws IOException 
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
