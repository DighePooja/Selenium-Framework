package POM1_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PwdPage 
{    //Step1
    @FindBy(xpath="//input[@id='central-login-password']")  private WebElement Pwd;
   
    @FindBy(xpath="//a[@id='login-in-with-password']")  private WebElement SignIn;
    
    //step2
    PwdPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
    //step 3-usage
    
    public void EnterPW() 
    {
    	Pwd.sendKeys("Dp98$.com");
	}
    
    public void ClickOnSignIn() 
    {
    	SignIn.click();		
	}
}
