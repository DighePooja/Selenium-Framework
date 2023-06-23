package POM1_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobNumPage 
{
    //step1
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]") private WebElement SignInWithPW;
	
	
	//Step2
	MobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		
	}
	
	//Step3
	public void EnterMobNum() 
	{
		MobNum.sendKeys("9307544891");  	
	}
	
	public void ClickOnSignInWithPW() 
	{	
		SignInWithPW.click();
			    	
	}
	
	
}
