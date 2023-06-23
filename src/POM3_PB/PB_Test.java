package POM3_PB;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB_Test 
{
public static void main(String[] args) throws InterruptedException 
{	
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.policybazaar.com/");
	   driver.manage().window().maximize();	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	   
	   SignInPage sign=new SignInPage(driver);
	   sign.ClickOnSignIn();
	   Thread.sleep(2000);
	   
	   MobnumPage mobnum=new MobnumPage(driver);
	   mobnum.EnterMobnum();
	   mobnum.ClickOnSignInWithPW();
	   Thread.sleep(2000);

	   PasswordPage pass=new PasswordPage(driver);
	   pass.EnterPW();
	   pass.ClickOnSignInBtn();
	   Thread.sleep(2000);

	   HomePage home=new HomePage(driver);
	   home.MouseoverToMyAcc();
	   Thread.sleep(2000);

	   MyAccPage myacc=new MyAccPage(driver);
	   myacc.ClickOnMyProfile();
	   Thread.sleep(2000);

	   ProfilePage profile=new ProfilePage(driver);
	   profile.SwithtoChildWindow();
	   profile.VerifyFullName();	   Thread.sleep(2000);

	   driver.quit();
	
}
}