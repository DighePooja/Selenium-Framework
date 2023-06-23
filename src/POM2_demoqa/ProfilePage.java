package POM2_demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{   //scroll down
     @FindBy(xpath="(//li[@id='item-3'])[5]") private WebElement Scroll;

    //click go to book store
    @FindBy(xpath="//button[@id='gotoStore']") private WebElement GotoBookStore;
    WebDriver driver1; 
   
   
   ProfilePage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this ); 
	   driver1=driver;
   }
   
   
   public void ScrollDown() 
   {
	   //Scroll Down
	   ((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);", Scroll);	  
   }
   
   public void ClickOnGotoBookStore() 
   {
	   GotoBookStore.click();
	   
   }
   
   
}
