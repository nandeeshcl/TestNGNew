package groupsPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups= {"smoke","sanity"},dependsOnGroups= {"functional"})
	public void testMethod2() {

		System.out.println("Smok and Sanity Test");
	}

	@Test(groups= {"regression","functional"})
	public void beforeTest2() {

		//Assert.assertTrue(false);
		System.out.println("Reg and Func Test");
	}

	@Test(groups="functional")
	public void afterTest2() {

		
		System.out.println("Functional Test");
	}

}
