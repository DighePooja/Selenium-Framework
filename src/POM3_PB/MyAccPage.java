package POM3_PB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccPage 
{
	   @FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
	   
	   MyAccPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void ClickOnMyProfile() 
	   {
		   MyProfile.click();
	   }
}
