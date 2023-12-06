package Framework.Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classn1 {
	@AfterTest
	public void test1()
	{
		
System.out.println("Here is the 1 test");
}
	@Test
	public void test2()
	{
		System.out.println("Here is the 2 Test");
	}
		@Test
		public void test3()
		{
			
	System.out.println("Here is the 3 test");
	}
		@BeforeTest
		public void test4()
		{
			System.out.println("Here is the 4 Test");
		}
}