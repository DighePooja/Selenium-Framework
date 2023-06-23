package POM1_WithOut_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
    public static void main(String[] args) throws InterruptedException 
    {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.policybazaar.com/");
	   driver.manage().window().maximize();	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   SignInPage signin=new SignInPage(driver);
	   signin.ClickOnSignInBtn();
	   Thread.sleep(2000);
	   
	   MobNumPage mobnum=new MobNumPage(driver);
	   mobnum.EnterMobNum();
	   mobnum.ClickOnSignInWithPW();
	   Thread.sleep(2000);
	   
	   PwdPage pw=new PwdPage(driver);
	   pw.EnterPW();
	   pw.ClickOnSignIn();
	   Thread.sleep(2000);
	   
	   HomePage home=new HomePage(driver);
	   home.OpenMyAcDropDown();
	   Thread.sleep(2000);
	   
	   MyAccPage myacc=new MyAccPage(driver);  
	   myacc.ClickOnMyProfile();
	   Thread.sleep(2000);
	   
	   ProfilePage profile=new ProfilePage(driver);
	   profile.SwitchToChildWindow();
	   profile.VerifyFullName(); 
	   Thread.sleep(2000);

	   driver.quit();  
	}
}
