package POM_DDF_TestNG_Utility_BaseClass1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
    public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException 
    {

		   FileInputStream file=new FileInputStream("C:\\excelSheet\\Selenium DDF.xlsx");
		   Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		   String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		   
		   return value;
	} 
}
