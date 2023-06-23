package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass1_assertequals 
{
   @Test
   public void name() 
   {
	  String act="Hi";
	  String exp="Hii";
	  Assert.assertEquals(act, exp,"Failed: both results are diffrent");	   
   }
}
