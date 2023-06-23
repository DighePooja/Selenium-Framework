package POM_With_TestNG_Nykaa;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NKProductDetailsPage 
{
    //@FindBy(xpath="")private WebElement childWindow;
    @FindBy(xpath="//button[text()='Add to Bag']")private WebElement addToBag;
    @FindBy(xpath="//div[@class='css-1hppjzv']")private WebElement Cart;
    
    WebDriver driver1;
    
    NKProductDetailsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    
    public void SwitchMProductDetailsPageChildWindow() 
    {
		Set<String> allIDs = driver1.getWindowHandles();
		ArrayList<String> arl=new ArrayList<>(allIDs);
		driver1.switchTo().window(arl.get(1));
	}
    
    public void ClickMProductDetailsPageAddToBag() 
    {
    	addToBag.click();
	}
    
    public void ClickMProductDetailsPageCart() 
    {
    	Cart.click();
	}
}
