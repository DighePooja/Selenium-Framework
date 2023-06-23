package POM_With_TestNG_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NKHomePage 
{
    @FindBy(xpath="//a[text()='nykaa fashion']")private WebElement Nykaafashion;
    WebDriver driver1;
    
    NKHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    
    public void mouseOverMHomePageNykaafashion() 
    {
	    Actions act=new Actions(driver1);
	    act.moveToElement(Nykaafashion).perform();;
	}
}
