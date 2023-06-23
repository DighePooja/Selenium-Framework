package POM3_PB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage 
{

	   @FindBy(xpath="//input[@id='central-login-password']") private WebElement passwd;

	   @FindBy(xpath="//a[@id='login-in-with-password']") private WebElement Signin;

	   
	   PasswordPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void EnterPW() 
	   {
		   passwd.sendKeys("Dp98$.com");
	   }
	   
	   public void ClickOnSignInBtn() 
	   {
		   Signin.click();
	   }
}
