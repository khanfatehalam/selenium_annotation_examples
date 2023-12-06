package Framework.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Classn2 {
	@AfterMethod
	public void test5()
	{
		System.out.println("here is the 5 test");
	}
	@Test
	public void test6()
	{
		System.out.println("Here is the 6 test");
	}
	@Test
	public void test7()
	{
		System.out.println("Here is the 7 test");
	}
	@BeforeMethod
	public void test8()
	{
		System.out.println("here is the 8 test");
	}
}
