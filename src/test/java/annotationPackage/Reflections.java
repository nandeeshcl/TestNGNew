package annotationPackage;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reflections {
	
	@Test
	public void test()
	{
		Assert.assertTrue(true);
		System.out.println("Test");
	}
	
	
	@BeforeMethod
	public void beforeMethod(Method m)
	{
		System.out.println("Method name is: "+m.getName());
		
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		System.out.println("Status of method: "+result.getName()+"is "+result.getStatus());
		
		System.out.println("After Method");
	}

}
