package POM_DDF_TestNG_Utility_BaseClass5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInPage 
{
   @FindBy(xpath="//a[@class='sign-in']")private WebElement SignIn;
   
   PBSignInPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void ClickPBSignInPageSignIN() 
   {
	   SignIn.click();
   }
}
