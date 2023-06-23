package POM_DDF_TestNG_Utility_BaseClass5;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{ 
	WebDriver driver1;
	
   @FindBy(xpath="(//input[@id='outlined-secondary'])[1]")private WebElement FullName;
   
   PBProfilePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   driver1=driver;
   }
   
   public void SwitchPBProfilePageChildWindow() 
   {
	   Set<String> allIDs = driver1.getWindowHandles();
	   ArrayList<String> arl=new ArrayList<>();
       driver1.switchTo().window(arl.get(1));
   }
   
   public String VerifyPBProfilePageFullName() 
   {
	  String acttext = FullName.getAttribute("value");
	  return acttext;
   }
}
