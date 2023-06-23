package POM5_BB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBAllProductsPage 
{
   @FindBy(xpath="(//a[@class='ng-binding'])[55]")private WebElement SelectProduct;
   
   
   BBAllProductsPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void ClickBBAllProductsPageProduct() 
   {
	   SelectProduct.click();
   }
   
}
