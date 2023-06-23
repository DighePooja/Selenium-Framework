package POM4_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{
   @FindBy(xpath="//input[@id='central-login-password']")private WebElement enterPW;
   
   @FindBy(xpath="//a[@id='login-in-with-password']")private WebElement signin;

   
   PBPwdPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void inpPBPwdPageEnterPW(String pw) 
   {
	   enterPW.sendKeys(pw);
   }
   public void ClickPBPwdPageSignIn() 
   {
	   signin.click();
   }
}
