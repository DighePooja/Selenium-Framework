package POM_DDF_TestNG_Utility_BaseClass4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
    public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException 
    {

		   FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx");
		   Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		   String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		   
		   return value;
	} 
    
    public static void captureSS(WebDriver driver, int TCID) throws IOException 
    {
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  	   
	   File dest=new File("C:\\Users\\Admin\\OneDrive - Indira College of Commerce and Science\\Desktop\\Selenium Screenshot\\TestCaseID"+TCID+"jpg");
	   
	   FileHandler.copy(src, dest);
	   
	}
    
    public static String getPFdata(String Key) throws IOException  
    {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Framework\\propertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(Key);
		
		return value;
	}
}















