package POM_With_TestNG_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NKLadiesWatchesPage 
{
	@FindBy(xpath="(//a[@class='css-19nu305'])[3]")private WebElement Joker;
    
	NKLadiesWatchesPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void ClickMLadiesWatchesPagePipaBella() 
    {
    	Joker.click();	
	}
}
//(//a[@class='css-1t10dtm'])[3]