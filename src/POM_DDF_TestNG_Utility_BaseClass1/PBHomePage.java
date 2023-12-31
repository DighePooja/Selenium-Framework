package POM_DDF_TestNG_Utility_BaseClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage 
{
	   @FindBy(xpath="//div[text()='My Account']") private WebElement MyAcc;

	   WebDriver driver1;
	   
	   PBHomePage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   driver1=driver;
	   }
	
	   public void MouseoverPBHomePageMyAcc() 
	   {
		 Actions act=new Actions(driver1);
	   	 act.moveToElement(MyAcc).perform();
				 
		   
	   }
}
