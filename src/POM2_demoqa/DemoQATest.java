package POM2_demoqa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATest 
{
  public static void main(String[] args) throws InterruptedException 
  {

	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demoqa.com/login");
	   driver.manage().window().maximize();	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   LoginPage log=new LoginPage(driver);
	   log.EnterUN();
	   log.EnterPW();
	   log.ClickOnLogIn();
	   Thread.sleep(2000);
	   
	   ProfilePage prof=new ProfilePage(driver);
	   prof.ScrollDown();
	   prof.ClickOnGotoBookStore();
	   Thread.sleep(2000);

	   BookkstorePage book=new BookkstorePage(driver);
	   book.ClickOnBook();
	   Thread.sleep(2000);

	   BookdetailsPage add=new BookdetailsPage(driver);
	   add.ScrollDown();
	   add.ClickOnAddtoCollection();
	   Thread.sleep(2000);
	   
	   AlertPopUp1Page alert=new AlertPopUp1Page(driver);
	   alert.HandelAlertPopup();
	   
	   //add.ClickOnprofile();
	   Thread.sleep(2000);

	   ProfilePage2 profile=new ProfilePage2(driver);
	   profile.ScrollDown();
	   profile.ClickOnProfile();
	   Thread.sleep(2000);

	   GotoProfilePage delete=new GotoProfilePage(driver);
	   delete.Scrolldowm();
	   delete.ClickOnDeleteAllbook();
	   Thread.sleep(2000);

	   DeleteAllBookPopupPage deletebook=new DeleteAllBookPopupPage(driver);
	   deletebook.ClickOnCancelBtn();
	   deletebook.ScrollUp();
	   Thread.sleep(2000);
	   
	   LogOutPage logout=new LogOutPage(driver);
	   //logout.ScrollUp();
	   logout.ClickOnLogout();	   
  }
}
