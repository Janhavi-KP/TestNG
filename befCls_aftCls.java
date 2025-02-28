package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class befCls_aftCls {
	@BeforeClass
	void login() {
		System.out.println("login method");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@AfterClass()
	void logout()
	{
		System.out.println("to logout");
	}
	
	
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advance search");
	}
	
	@Test(priority=3)
	void search1()
	{
		
	}

}
/*
 * 1]login
 * 2]search
 * 3]advance search
 * 4]logout
} login as @before class and logout as@afterclass ...if there are 10 test cases in bw the login and logout act as before and after class i.e execute first and last respectfully
*/
