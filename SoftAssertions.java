package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	/*@Test
	void test_hardassert()
	{
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		
		Assert.assertEquals(1, 2);//when we use hard assertions if assert condition is failed the line after the assert doesnot execute
		
		System.out.println("testing");
		System.out.println("testing");
	}*/
	
	@Test
	void test_softAssertion()
	{
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		SoftAssert obj=new SoftAssert();
		obj.assertEquals(1, 2);//when we use hard assertions if assert condition is failed the line after the assert doesnot execute
		
		System.out.println("testing");
		System.out.println("testing");
		obj.assertAll();
	}
}
