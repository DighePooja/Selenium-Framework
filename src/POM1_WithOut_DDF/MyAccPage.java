package POM1_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccPage 
{
	 //step1
     @FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
     
     //step2
     MyAccPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     //step3
     
     public void ClickOnMyProfile() 
     {
    	 MyProfile.click();
	 }
}
