package POM5_BB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBHomePage 
{
    @FindBy(xpath="//input[@id='input']")private WebElement searchBox;
    
    @FindBy(xpath="//button[@class='btn btn-default bb-search']")private WebElement searchbtn;

    
    BBHomePage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void inpBBHomePageSearchBox(String item) 
    {
    	searchBox.sendKeys(item);    	
	}
	
    public void ClickBBHomePageSearchBtn() 
    {
    	searchbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
