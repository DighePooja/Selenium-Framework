package POM3_PB;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
    @FindBy(xpath="(//input[@id='outlined-secondary'])[1]") private WebElement fullname;
    
    WebDriver driver1;

    ProfilePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    
    //switch on child windo
    public void SwithtoChildWindow() 
    {
	  Set<String> allIDs = driver1.getWindowHandles();
	  ArrayList<String> arl=new ArrayList<>(allIDs);
	  driver1.switchTo().window(arl.get(1));
	}
	
    public void VerifyFullName() 
    {
    	String acttext = fullname.getAttribute("value");
    	
		String exptext="Pooja Dighe";
		if(exptext.equals(acttext))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
    	
	}
	
	
	
	
	
	
}
