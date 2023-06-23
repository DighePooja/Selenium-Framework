package POM2_demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GotoProfilePage 
{
	//Scroll down
    @FindBy(xpath="(//li[@id='item-3'])[5]") private WebElement Scroll;
    
    //click on delete all book
    @FindBy(xpath="//button[text()='Delete All Books']") private WebElement DeleteAllBook;
    
    WebDriver driver1;
    
    
    GotoProfilePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    	driver1=driver;
    }
    
    public void Scrolldowm() 
    {
	    ((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);", Scroll);

	}
    
    public void ClickOnDeleteAllbook() 
    {
    	DeleteAllBook.click();
		
	}
    
}
