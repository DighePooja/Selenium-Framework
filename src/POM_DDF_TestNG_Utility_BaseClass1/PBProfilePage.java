package POM_DDF_TestNG_Utility_BaseClass1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{
    @FindBy(xpath="(//input[@id='outlined-secondary'])[1]") private WebElement fullname;
    
    WebDriver driver1;

    PBProfilePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    
    //switch on child windo
    public void SwithPBProfilePageChildWindow() 
    {
	  Set<String> allIDs = driver1.getWindowHandles();
	  ArrayList<String> arl=new ArrayList<>(allIDs);
	  driver1.switchTo().window(arl.get(1));
	}
	
    public String VerifyPBProfilePageFullName() 
    {
    	String actfullname = fullname.getAttribute("value");
        return actfullname; 	
	}
	
	
	
	
	
	
}
