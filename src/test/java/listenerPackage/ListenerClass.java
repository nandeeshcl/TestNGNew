package listenerPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerClass {

	@Test
	public void loginTest() {
		System.out.println("Logged in to the Tool");
	}

	@BeforeMethod
	public void openChrome() {
		Assert.fail();
		System.out.println("Chrome Opened");
	}

	@AfterMethod
	public void closeChrome() {
		System.out.println("Chrome closed");
	}

}
