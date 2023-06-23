package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNG_KeyWord_priority
// priority can be dupplicate 
//priority can be negative
//but priority can not be desimal
{
	@Test (priority = 3)
    public void TC1() 
    {
	   Reporter.log("----running TC 1----",true);	
	}
    
	@Test (priority = 2)
    public void TC2() 
    {
	   Reporter.log("----running TC 2----",true);	
	}
    
	@Test (priority = -1)
    public void TC3() 
    {
	   Reporter.log("----running TC 3----",true);	
	}
	
	@Test (priority = 2)
    public void TC4() 
    {
	   Reporter.log("----running TC 4----",true);	
	}
}
