package POM_DDF_TestNG_Utility_BaseClass4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobnumPage 
{
	   @FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement Mobnum;

	   @FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]") private WebElement signinwithPW;
	   
	   PBMobnumPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void InpPBMobnumPageMobNum(String MobNumber) 
	   {
		   Mobnum.sendKeys(MobNumber);
	   }
	   
	   public void ClickPBMobnumPageSignInWithPW() 
	   {
		   
		   signinwithPW.click();
		   
	   }
	   
	   
}
