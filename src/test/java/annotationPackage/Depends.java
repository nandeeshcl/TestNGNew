package annotationPackage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Depends {

	@Test(dependsOnMethods = { "register" })
	public void login() {
		Assert.assertTrue(false);
		System.out.println("login");
	}

	@Test
	public void register() {

		Assert.assertTrue(true);
		System.out.println("register");
	}

	@Test(dependsOnMethods = { "login", "register" },alwaysRun=true)
	public void createNewUser() {

		
		System.out.println("createNewUser");
	}

}
