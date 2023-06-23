package POM_DDF_TestNG_Utility_BaseClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
	   @FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
	   
	   PBMyAccPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void ClickPBMyAccPageMyProfile() 
	   {
		   MyProfile.click();
	   }
}
