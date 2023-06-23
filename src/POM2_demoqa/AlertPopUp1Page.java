package POM2_demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPopUp1Page 
{
   //@FindBy(xpath="") private WebElement Ok;
	WebDriver driver1;
	
	AlertPopUp1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void HandelAlertPopup() 
	{
		driver1.switchTo().alert().accept();	
	
	}
}
