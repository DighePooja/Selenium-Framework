package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex4_TestNG_KeyWord_invocationCount
{
	@Test (invocationCount = 2)
    public void TC1() 
    {
	   Reporter.log("----running TC 1----",true);	
	}
    
	@Test (invocationCount = 2)
    public void TC2() 
    {
	   Reporter.log("----running TC 2----",true);	
	}
    
	@Test (invocationCount = 2)
    public void TC3() 
    {
	   Reporter.log("----running TC 3----",true);	
	}
}
