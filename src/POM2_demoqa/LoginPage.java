package POM2_demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
    @FindBy(xpath="//input[@id='userName']") private WebElement UN;    
    @FindBy(xpath="//input[@id='password']") private WebElement PW;
    @FindBy(xpath="//button[@id='login']") private WebElement Login;
     
     
     LoginPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void EnterUN() 
     {
		UN.sendKeys("PD");
	 }
     
     public void EnterPW() 
     {
		PW.sendKeys("Dp98$.com");
	 }
     
     public void ClickOnLogIn() 
     {
		Login.click();   	 
     }
     
     
     
     
     
}
