package testNG;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advance search");
	}
	@BeforeClass
	void bc() {
		System.out.println("beforeclass ");
	}
	@AfterClass()
	void ac()
	{
		System.out.println("AfterClass");
	}
	@BeforeMethod
	void bm() {
		System.out.println("Before MEthod");
	}
	
	@AfterMethod()
	void am()
	{
		System.out.println("After method");
	}
	@BeforeSuite()
	void bs() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite()
	void as()
	{
		System.out.println("After Suite");
	}
	@BeforeTest()
	void bt() {
		System.out.println("Before Test");
	}
	
	@AfterTest()
	void at()
	{
		System.out.println("After Test");
	}
	
}
