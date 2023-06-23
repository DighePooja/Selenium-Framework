package POM_DDF_TestNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInPage 
{
   @FindBy(xpath="//a[@class='sign-in']") private WebElement signin;
	
   	
   PBSignInPage(WebDriver driver)	
   {
	   PageFactory.initElements(driver, this);
	   
   }
	
   public void ClickPBSignInPageSignIN() 
   {
	   signin.click();
   }	
	
	
	
	
	
}
