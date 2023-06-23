package POM_DDF_TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginInPage //method name with proper naming convension-->POM & DDf
{
     @FindBy(xpath="//a[@class='sign-in']")private WebElement signin;
     
     PBLoginInPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void ClickPBLoginInPageSignIn() 
     {
    	 signin.click(); 	
	 }

	
}
