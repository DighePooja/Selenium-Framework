package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exm14_GroupingTC2 
{
	@Test(groups="login")
    public void TC1() 
    {
		Reporter.log("--running TC 1",true);
	}
	
	@Test(groups="setting")
    public void TC2() 
    {
		Reporter.log("--running TC 2",true);

	}
    
	@Test(groups="setting")
    public void TC3() 
    {
		Reporter.log("--running TC 3",true);

	}
    
	@Test(groups="profile")
    public void TC4() 
    {
		Reporter.log("--running TC 4",true);

	}
}
