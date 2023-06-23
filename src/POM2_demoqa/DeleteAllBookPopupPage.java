package POM2_demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAllBookPopupPage 
{
	//cancel button on H D popup
	@FindBy(xpath="//button[@id='closeSmallModal-cancel']") private WebElement Cancel;
	
	//scroll up
    @FindBy(xpath="(//div[@class='header-wrapper'])[1]") private WebElement Scroll;


	
	WebDriver driver1;
	
	DeleteAllBookPopupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void ClickOnCancelBtn() 
	{
		Cancel.click();
	}
	
	public void ScrollUp() 
	  {
		  ((JavascriptExecutor)driver1).executeAsyncScript("arguments[0].scrollIntoView(true)", Scroll);
	  }
}
