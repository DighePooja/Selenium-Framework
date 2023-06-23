package POM1_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage
{
	//step1
	// create globle variable with private Access specifier
    @FindBy(xpath="//a[@class='sign-in']") private WebElement SignIn;
	
    //Step2
    //call constructor with parameter which accept input as a 'driver' object name and 'this' keyword
    SignInPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //step3 -usage
    public void ClickOnSignInBtn() 
    {
	    SignIn.click();	
	}
	
}
