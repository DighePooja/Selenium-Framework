package POM_DDF_TestNG_Utility_BaseClass5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{	
	
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement MobNum;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement SignInWithPWD;

	   
	PBMobNumPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void InpPBSignInPageMobNum(String Key) 
	   {
		   MobNum.sendKeys(Key);
	   }
	   
	   public void ClickPBMobNumSignInWithPWD() 
	   {
		   SignInWithPWD.click();
	   }
}
