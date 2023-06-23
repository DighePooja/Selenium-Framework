package POM2_demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage 
{
  //Scroll up	
  //@FindBy(xpath="(//div[@class='header-wrapper'])[1]") private WebElement Scroll;
  
  //Click on log out btn
  @FindBy(xpath="//button[text()='Log out']") private WebElement Logout;
  
  WebDriver driver1;

  
  LogOutPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  driver1=driver;
  }
  
//  public void ScrollUp() 
//  {
//	  ((JavascriptExecutor)driver1).executeAsyncScript("arguments[0].scrollIntoView(true)", Scroll);
//  }
  
  public void ClickOnLogout() 
  {
	  Logout.click();
  }
}
