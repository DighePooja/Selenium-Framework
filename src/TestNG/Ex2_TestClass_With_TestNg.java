


package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex2_TestClass_With_TestNg //emailable report
{
     
	@Test
    public void m1()
    {
		//System.out.println("Hii Pooja");
		Reporter.log("Hii Pooja",true);
    }
	
	@Test
	public void m2()
	{
	    //System.out.println("Gm");	
		Reporter.log("Hello Gm",true);

	}
}
