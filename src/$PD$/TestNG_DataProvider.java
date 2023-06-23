package $PD$;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
	@Test(dataProvider="getData")
	public void DbProvider(int p1, String p2)
    {
		System.out.println("DataProvider Example: Data(" + p1 + ", " + p2 + ")");
	}	
	
	@DataProvider
	public Object[][] getData() 
    {
		return new Object[][]{{5, "five"}, {6, "six"}};
	}
}
