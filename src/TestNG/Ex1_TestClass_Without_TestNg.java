package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_TestClass_Without_TestNg 
{
    public static void main(String[] args) 
    {  
		System.out.println("Test class Without TestNG");
    	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com/");  	
	} 	
}
