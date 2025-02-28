package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_befAftr_method {
	@BeforeMethod
	void login() {
		System.out.println("login method");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@AfterMethod()
	void logout()
	{
		System.out.println("to logout");
	}
	
	
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advance search");
	}
	

}
/*
 * 1]login
 * 2]search
 * 3]logout
 * 4]login
 * 5]advance search
 * 6]logout
 *///so beforemethod executed before every txt,after method exceutes after every tests
