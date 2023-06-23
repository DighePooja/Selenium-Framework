package POM_DDF_TestNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage 
{

	   @FindBy(xpath="//input[@id='central-login-password']") private WebElement passwd;

	   @FindBy(xpath="//a[@id='login-in-with-password']") private WebElement Signin;

	   
	   PBPasswordPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void InpPBPasswordPagePW(String PassWD) 
	   {
		   passwd.sendKeys(PassWD);
	   }
	   
	   public void ClickPBPasswordPageSignIn() 
	   {
		   Signin.click();
	   }
}
