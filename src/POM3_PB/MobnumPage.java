package POM3_PB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobnumPage 
{
	   @FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement Mobnum;

	   @FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]") private WebElement signinwithPW;
	   
	   MobnumPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void EnterMobnum() 
	   {
		   Mobnum.sendKeys("9307544891");
	   }
	   
	   public void ClickOnSignInWithPW() 
	   {
		   
		   signinwithPW.click();
		   
	   }
	   
	   
}
