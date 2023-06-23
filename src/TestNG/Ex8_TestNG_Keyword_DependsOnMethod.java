package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex8_TestNG_Keyword_DependsOnMethod 
{
	@Test
    public void Login() 
    {
		Reporter.log("---Log in into app---",true);
	}
    
	@Test
    public void Signin()    
    {
		Reporter.log("---sign in into app---",true);
	}
    
	@Test(dependsOnMethods = "Login")
    public void Logout() 
    {
	    Reporter.log("---log out---",true);	
	}
}
