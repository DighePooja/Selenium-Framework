package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Exm10_SoftAssertClass 
{
   @Test
   public void name() 
   {
	      SoftAssert soft=new SoftAssert();

		  String act="Hi";
		  String exp="Hi";
		  soft.assertEquals(act,exp);
		  
		  boolean result=false;
		  soft.assertFalse(result);
		  
		  soft.assertAll();
   }
}
