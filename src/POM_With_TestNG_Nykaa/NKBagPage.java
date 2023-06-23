package POM_With_TestNG_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NKBagPage 
{
    @FindBy(xpath="(//div[@class='css-1p5ccpb'])[2]")private WebElement addQuantity;
    WebDriver driver1;
    
    NKBagPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	//driver1=driver;
    }
//    public void switchNKBagPageiframe() 
//    {
//	   driver1.switchTo().frame("//iframe[@class='css-1b84mvw']");	
//	  }
    
    public void ClickMBagPageAddQuantity() 
    {
    	addQuantity.click();	
	}
}
//button[@class='css-1cci9cl']