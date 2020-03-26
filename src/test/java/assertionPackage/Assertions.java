package assertionPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	// SOFT ASSERTIONS
	@Test
	public void testA() {

		SoftAssert sa = new SoftAssert();

		sa.assertTrue(true, "TRUE");
		sa.assertTrue(false, "FALSE");

		System.out.println("TEST A method");

		sa.assertAll();
	}

}
