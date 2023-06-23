package POM5_BB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBProdDetailsPage 
{
    @FindBy(xpath="//div[@class='Cs6YO rippleEffect']")private WebElement AddToBasketBtn;
    
    @FindBy(xpath="//div[@class='_1aJzw']")private WebElement AddQuantitybtn;

    @FindBy(xpath="//span[text()='My Basket']")private WebElement GoToBasket;
    
    WebDriver driver1;
    
    BBProdDetailsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    
    public void ClickBBProdDetailsPageAddToBasket() 
    {
    	AddToBasketBtn.click();	
	}
    public void ClickBBProdDetailsPageAddQuantity() 
    {
    	AddQuantitybtn.click();
	}
    public void MouseOverBBProdDetailsPageMyBasket() 
    {
		Actions act=new Actions(driver1);
		act.moveToElement(GoToBasket).perform();
	}
   
    
    
    
    
    
    
}
