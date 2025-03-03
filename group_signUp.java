package testNG;

import org.testng.annotations.Test;

public class group_signUp {
	
	@Test(priority=1,groups={"regression"})
	void signUpByEmail()
	{
		System.out.println("signup by Email");
	}
	
	@Test(priority=2,groups={"regression"})
	void signUpByFacebook()
	{
		System.out.println("signUp by Facebook");
	}
	
	@Test(priority=3,groups={"regression"})
	void signUpByTwitter()
	{
		System.out.println("signUpby Twitter");
	}

}
