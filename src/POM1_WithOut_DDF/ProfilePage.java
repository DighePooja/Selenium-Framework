package POM1_WithOut_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	//step1
    @FindBy(xpath="(//input[@id='outlined-secondary'])[1]")  private WebElement FullName;
    WebDriver driver1;
    
    
    //step2
    ProfilePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	 driver1=driver;
    }
    
    //strep3
    public void SwitchToChildWindow() 
    {
		Set<String> allIDs = driver1.getWindowHandles();
		ArrayList< String> arl=new ArrayList<>(allIDs);
		driver1.switchTo().window(arl.get(1));
		
	}
    
    public void VerifyFullName() 
    {
	   String Exptext = "Pooja Dighe";	
	   String Acttext = FullName.getAttribute("value");
	  
	   if(Exptext.equals(Acttext))
	      {
	    	  System.out.println("TC pass");
	      }
	      else
	      {
	    	  System.out.println("TC fail");
	      } 	   
	}    
}
