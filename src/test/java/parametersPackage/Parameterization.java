package parametersPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters({"browsers","env"})
	public void testParameterization(String browser,String env) {
		
		if(browser.equals("chrome"))
		{
			System.out.println("Launch chrome browser");
			System.out.println("Env is: "+env);
		}
		
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch firefox browser");
			System.out.println("Env is: "+env);
		}
		
		else
		{
			System.out.println("Launch IE browser");
			System.out.println("Env is: "+env);
		}
	}

}
