package dataProviderPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	
	@Test(dataProvider="getData")
	public void loginAPI(Object... obj )
	{
		System.out.println("Email is:"+obj[0]);
		System.out.println("Password is: "+obj[1]);
	}
	
	
	@DataProvider(name="getData",parallel=true)
	public Object[][] dataMethod()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="appu1@gmail.com";
		data[0][1]="appu1";
		
		data[1][0]="appu2@gmail.com";
		data[1][1]="appu2";
		
		return data;
	}

}
