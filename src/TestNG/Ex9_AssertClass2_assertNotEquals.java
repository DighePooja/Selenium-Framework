package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass2_assertNotEquals 
{
  @Test	
  public void TC1() 
  {
	 String act="hi";     
	 String exp="hello";
	 
	 Assert.assertNotEquals(act, exp);
  }
}
