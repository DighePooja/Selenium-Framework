package POM2_demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookkstorePage 
{    
	//click on book
	@FindBy(xpath="//a[text()='Git Pocket Guide']") private WebElement AnyBook;
	
	BookkstorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnBook() 
	{
		AnyBook.click();
	}
}
