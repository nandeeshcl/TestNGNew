package dataProviderPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFromExcel1 {

	public ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void loginAPI(Object... obj) {
		System.out.println("Email is:" + obj[0]);
		//System.out.println();
		System.out.println("Password is: " + obj[1]);
		//System.out.println();
		System.out.println("Status is: "+obj[2]);
		System.out.println();
	}

	@DataProvider(name = "getData")
	public Object[][] dataMethod() {

		if (excel == null) {
			excel = new ExcelReader("D:\\API_Testing_W2A\\API_Testing_Framework\\TestNGNew\\src\\test\\testData\\BelkAPITestData.xlsx");

		}

		String sheetName = "testData";

		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		//System.out.println("Row count is: " + rows);
		//System.out.println("Column count is: " + cols);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}

		return data;
	}

}
