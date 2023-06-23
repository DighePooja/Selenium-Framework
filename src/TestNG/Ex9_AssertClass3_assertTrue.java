package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass3_assertTrue 
{
  @Test
  public void TC1()
  {
	  boolean result= true;
	  
	  Assert.assertTrue(result);
	  
  }
}
