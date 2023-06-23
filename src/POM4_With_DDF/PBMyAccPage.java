package POM4_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
     @FindBy(xpath="//span[text()='Sign out']")private WebElement signout;
     
     
     PBMyAccPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void ClickPBMyAccPageSignOut() 
     {
    	 signout.click();
	 }
     
     
     
     
     
     
     
     
}
