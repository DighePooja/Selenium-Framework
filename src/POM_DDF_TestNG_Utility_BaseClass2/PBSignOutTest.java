package POM_DDF_TestNG_Utility_BaseClass2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBSignOutTest 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
   {
	   FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx") ;
	   Sheet sh = WorkbookFactory.create(file).getSheet("DDf");
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.policybazaar.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   PBLoginInPage login=new PBLoginInPage(driver);
	   login.ClickPBLoginInPageSignIn();
	   Thread.sleep(2000);
	   
	   PBMobNumPage mobnum=new PBMobNumPage(driver);
	   String mobilenum = sh.getRow(1).getCell(0).getStringCellValue();
	   mobnum.inpPBMobNumPageMobNum(mobilenum);
	   mobnum.ClickPBMobNumPageSignInWithPW();
	   Thread.sleep(2000);

	   PBPwdPage passwd=new PBPwdPage(driver);
	   String password = sh.getRow(2).getCell(0).getStringCellValue();
	   passwd.inpPBPwdPageEnterPW(password);
	   passwd.ClickPBPwdPageSignIn();
	   Thread.sleep(2000);

	   PBHomePage movepointer=new PBHomePage(driver);
	   movepointer.MouseOverPBHomePageMyAcc();
	   Thread.sleep(2000);

	   PBMyAccPage myacc=new PBMyAccPage(driver);
	   myacc.ClickPBMyAccPageSignOut();
	   Thread.sleep(2000);

	   driver.quit();
   }
}
