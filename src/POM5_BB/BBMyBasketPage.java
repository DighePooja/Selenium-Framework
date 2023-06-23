package POM5_BB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBMyBasketPage 
{
     @FindBy(xpath="//div[@class='_2c50o']") private WebElement Candelbtn;
     
     BBMyBasketPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void ClickBBMyBasketPageCancel() 
     {
    	 Candelbtn.click();
	 }
}
