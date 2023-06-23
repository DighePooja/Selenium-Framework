package POM3_PB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
   @FindBy(xpath="//a[@class='sign-in']") private WebElement signin;
	
   	
   SignInPage(WebDriver driver)	
   {
	   PageFactory.initElements(driver, this);
	   
   }
	
   public void ClickOnSignIn() 
   {
	   signin.click();
   }	
	
	
	
	
	
}
