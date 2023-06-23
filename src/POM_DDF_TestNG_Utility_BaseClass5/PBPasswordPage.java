package POM_DDF_TestNG_Utility_BaseClass5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage 
{
	
	
	@FindBy(xpath="//input[@id='central-login-password']")private WebElement PWD;
	@FindBy(xpath="//a[@id='login-in-with-password']")private WebElement SignIn;

	   
	PBPasswordPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void InpPBSignInPagePWD(String Key) 
	   {
		   PWD.sendKeys(Key);
	   }
	   
	   public void ClickPBPasswordPageSignIN() 
	   {
		   SignIn.click();
	   }
}
