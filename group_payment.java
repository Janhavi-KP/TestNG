package testNG;

import org.testng.annotations.Test;

public class group_payment {
	
	@Test(priority=1,groups={"sanity","regression"})
	void paymentInRupees()
	{
		System.out.println("payment in rupees");
	}
	@Test(priority=2,groups={"sanity","regression"})
	void paymentInDollars()
	{
		System.out.println("payment in dollars");
	}

}
