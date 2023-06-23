package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass5 
//Drawback of assert class --if we compaire tow diff types of result in same test class then after verifing first assersion 
//it will not verify seconfd assersion -for thart we need to make an use of softassert class
{
  @Test
  public void TC1()
  {
	  String act="Hi";
	  String exp="Hi";
	  Assert.assertEquals(act,exp);
	  
	  boolean result=false;
	  Assert.assertFalse(result);
  }
}
