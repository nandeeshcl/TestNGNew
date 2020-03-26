package listenerPackage;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener ,IExecutionListener {

	public void onExecutionStart()
	{
		System.out.println("Suite started");
	}
	
	public void onExecutionFinish()
	{
		System.out.println("Suite finished");
	}
	
	
	public void onTestStart(ITestResult result) {

		System.out.println("Test method: " + result.getName()+ " started execution");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Success of test cases and its details are : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Skip of test cases and its details are : " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	public void onStart(ITestContext context) {

		System.out.println("Test started");

	}

	public void onFinish(ITestContext context) {

		System.out.println("Test ended");

	}
}
