package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseryions {
	@Test
	void testTitle() {
		String expTitle="OpenCart";
		String actTitle="Openshop";
		
		Assert.assertEquals(expTitle, actTitle);
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
	}

}
// if we use only conditional statements even though the condition is false the test will pass so we have to use assertions
