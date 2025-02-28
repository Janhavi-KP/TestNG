package testNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertions {
	@Test
	void test()
	{
		//Assert.assertEquals("xyz", "xyz1");
		//Assert.assertEquals(123, 3456);
		//Assert.assertEquals("abc", 123);
		
		//Assert.assertNotEquals(123, 123);
		Assert.assertTrue(1==2);
		
		Assert.fail();//fail the test
				
	}

}
//hard assertions-- it can directly access from the assert class
