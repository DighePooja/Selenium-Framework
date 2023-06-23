package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex7_TestNG_KeyWord_TimeOut 
{
	@Test 
    public void TC1() 
    {
	   Reporter.log("----running TC 1----",true);	
	}
    
	@Test
    public void TC2() 
    {
	   Reporter.log("----running TC 2----",true);	
	}
    
	@Test  (timeOut = 5)
    public void TC3() throws InterruptedException 
    {
	   Thread.sleep(6000);
	   Reporter.log("----running TC 3----",true);	
	}
}
