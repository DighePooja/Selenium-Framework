package POM5_BB;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBTest 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
  {
	FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	  
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bigbasket.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	BBHomePage home=new BBHomePage(driver);
	String item = sh.getRow(4).getCell(0).getStringCellValue();
	home.inpBBHomePageSearchBox(item);
	home.ClickBBHomePageSearchBtn();
	Thread.sleep(2000);
	
	BBAllProductsPage allprod=new BBAllProductsPage(driver);
	allprod.ClickBBAllProductsPageProduct();
	Thread.sleep(2000);

	BBProdDetailsPage proddetails=new BBProdDetailsPage(driver);
	proddetails.ClickBBProdDetailsPageAddToBasket();
	proddetails.ClickBBProdDetailsPageAddQuantity();
	proddetails.MouseOverBBProdDetailsPageMyBasket();
	Thread.sleep(2000);

	BBMyBasketPage mybasket=new BBMyBasketPage(driver);
	mybasket.ClickBBMyBasketPageCancel();
	Thread.sleep(3000);

	driver.quit();
	  
  }
}
