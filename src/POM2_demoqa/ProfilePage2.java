package POM2_demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage2 
{
	//scroll down
	@FindBy(xpath="(//li[@id='item-3'])[5]") private WebElement Scroll;

	//click on profile
	@FindBy(xpath="(//li[@id='item-3'])[5]")  private WebElement Profilebtn; 
	
	 WebDriver driver1;
	
	ProfilePage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void ScrollDown() 
	{
	    ((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);", Scroll);
	
	}
	
	public void ClickOnProfile() 
	{
		Profilebtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
