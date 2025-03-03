package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
	 public void onStart(ITestContext context) {
		    System.out.println("Test execution is started");//before starting any test methods it starts only one time
		  }
	 
	 public void onTestStart(ITestResult result) {
		    System.out.println("Test started");//it starts every time before a test method
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("Test Passed");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		    System.out.println("Test failed");
		  }

	 public void onTestSkipped(ITestResult result) {
		    System.out.println("Test skipped");
		  }
	 
	 public void onFinish(ITestContext context) {
		    System.out.println("Test finished");
		  }
	 
}
