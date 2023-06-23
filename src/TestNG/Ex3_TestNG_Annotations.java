package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex3_TestNG_Annotations 
{   
	@BeforeClass
    public void OpenBrowser() 
    {
		Reporter.log("------Open Browser-----",true);
	}
	
	@BeforeMethod
	public void Login() 
    {
		Reporter.log("----Log in to app----",true);

	}
	
	@Test
    public void VerifyFullname1() 
    {
		Reporter.log("------running VerifyFullName1-----",true);
	}
	
	@Test
    public void VerifyFullname2 () 
    {
		Reporter.log("------running VerifyFullName2-----",true);
	}
	
	@AfterMethod
    public void Logout() 
    {
		Reporter.log("------Log Out-----",true);
	}
	
	@AfterClass
    public void CloseBrowser() 
    {
		Reporter.log("------Close Browser-----",true);
	}
}
