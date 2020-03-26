package annotationPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {

	@Test(priority = 1)
	public void register() {

		Assert.assertTrue(false);
		System.out.println("User registered");
	}
	
	@Test(priority = 2,dependsOnMethods= {"register"})
	public void userLogin() {

		System.out.println("User Login");
	}
	
	

	@BeforeMethod
	public void openFB() {
		//Assert.assertTrue(false);
		System.out.println("FB Opened");
	}

	@AfterMethod
	public void closeFB() {

		System.out.println("FB closed");
	}

	@BeforeClass
	public void openChrome() {

		System.out.println("Chrome Opened");
	}

	@AfterClass
	public void closeChrome() {

		System.out.println("Chrome Closed");
	}

	@BeforeTest
	public void browserSetupStart() {

		// Assert.assertTrue(false);
		System.out.println("Browser SetupStart");
	}

	@AfterTest
	public void browserSetupClose() {

		// Assert.assertTrue(false);
		System.out.println("Browser SetupClose");
	}

	@BeforeSuite
	public void openSystem() {

		System.out.println("Open System");
		// Assert.assertTrue(false);
	}

	@AfterSuite
	public void closeSystem() {

		System.out.println("Close System");
	}

}
