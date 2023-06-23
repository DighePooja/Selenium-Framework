package POM_With_TestNG_Nykaa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NKTest 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeOptions option=new ChromeOptions();
	   option.addArguments("--disable-notifications"); 
      
	   WebDriver driver=new ChromeDriver(option);
	   driver.get("https://www.nykaa.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   NKHomePage home=new NKHomePage(driver);
	   home.mouseOverMHomePageNykaafashion();
	   Thread.sleep(2000);
	   
	   NKAccesoriesPage accesorie=new NKAccesoriesPage(driver);
	   accesorie.ClickMAccesoriesPageWatches();
	   Thread.sleep(2000);

	   NKLadiesWatchesPage watch=new NKLadiesWatchesPage(driver);
	   watch.ClickMLadiesWatchesPagePipaBella();
	   Thread.sleep(2000);

	   NKProductDetailsPage product=new NKProductDetailsPage(driver);
	   product.SwitchMProductDetailsPageChildWindow();
	   product.ClickMProductDetailsPageAddToBag();
	   product.ClickMProductDetailsPageCart();
	   Thread.sleep(2000);
	   

//	   NKBagPage bag=new NKBagPage(driver);
//	   bag.switchNKBagPageiframe();
//	   bag.ClickMBagPageAddQuantity();
//	   Thread.sleep(2000);

	   NKSelectQuantityPage quantity=new NKSelectQuantityPage(driver);
	   //quantity.ClickMSelectQuantityPageTwo();
	   //quantity.ClickMSelectQuantityPageConfirm();
	   quantity.switchNKBagPageiframe();
	   quantity.VerifyNKSelectQuantityPageQuantity();	   
	   Thread.sleep(2000);

	   driver.quit();
	    
   }
}
