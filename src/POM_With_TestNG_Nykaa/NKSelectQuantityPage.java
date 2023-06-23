package POM_With_TestNG_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class NKSelectQuantityPage 
{
	//@FindBy(xpath="//button[text()='2']")private WebElement twoQuantities;
	
	//@FindBy(xpath="//button[text()='Confirm']")private WebElement Confirm;

	@FindBy(xpath="(//div[@class='css-1p5ccpb'])[2]")private WebElement Verifyquantity;
	
    //@FindBy(xpath="(//div[@class='css-1p5ccpb'])[2]")private WebElement addQuantity;


    WebDriver driver1;
	NKSelectQuantityPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    
//    public void ClickMSelectQuantityPageTwo() 
//    {
//    	twoQuantities.click();
//	}
//    
//    public void ClickMSelectQuantityPageConfirm() 
//    {
//    	Confirm.click();	
//	}
	public void switchNKBagPageiframe() 
    {
	   driver1.switchTo().frame("//iframe[@class='css-1b84mvw']");	
	}
	
    public void VerifyNKSelectQuantityPageQuantity() 
    {
    	String actquantity = Verifyquantity.getText();
    	String ecxpquantity="Quantity - 1";
    	Reporter.log("Both results are same",true);
    	Assert.assertEquals(actquantity, ecxpquantity);
	}
}
