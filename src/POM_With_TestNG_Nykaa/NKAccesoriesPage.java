package POM_With_TestNG_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NKAccesoriesPage //Popups Page
{
	    @FindBy(xpath="(//a[text()='Watches'])[1]")private WebElement Watches;
	    
	    NKAccesoriesPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void ClickMAccesoriesPageWatches() 
	    {
	    	Watches.click();
		}
}
