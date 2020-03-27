package dataProviderPackage;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithHastTable {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void loginAPI(Hashtable<String, String> data) {

		System.out.println("Email is:" + data.get("name"));

		System.out.println("Password is: " + data.get("email"));

		System.out.println("Status is: " + data.get("status"));
		System.out.println();
	}

	@DataProvider(name = "getData")
	public static Object[][] getData() {

		if (excel == null) {

			excel = new ExcelReader(
					"D:\\\\API_Testing_W2A\\\\API_Testing_Framework\\\\TestNGNew\\\\src\\\\test\\\\testData\\\\BelkAPITestData.xlsx");

		}

		String sheetName = "testData";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];

		// create hash table class variable
		Hashtable<String, String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			// create hash new hash table to each row of data
			table = new Hashtable<String, String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				// data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);

				// put values into hash table
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));

				// push value in hash table to data variable
				data[rowNum - 2][0] = table;

			}

		}

		return data;

	}

	/*
	 * @DataProvider(name = "getData") public Object[][] dataMethod() {
	 * 
	 * if (excel == null) { excel = new ExcelReader(
	 * "D:\\API_Testing_W2A\\API_Testing_Framework\\TestNGNew\\src\\test\\testData\\BelkAPITestData.xlsx"
	 * );
	 * 
	 * }
	 * 
	 * String sheetName = "testData";
	 * 
	 * int rows = excel.getRowCount(sheetName); int cols =
	 * excel.getColumnCount(sheetName);
	 * 
	 * //System.out.println("Row count is: " + rows);
	 * //System.out.println("Column count is: " + cols);
	 * 
	 * Object[][] data = new Object[rows - 1][1];
	 * 
	 * //create hash table clss variable Hashtable<String,String> table=null;
	 * 
	 * 
	 * for (int rowNum = 2; rowNum <= rows; rowNum++) {
	 * 
	 * //create hash new hash table to each row of data table=new
	 * Hashtable<String,String>();
	 * 
	 * for (int colNum = 0; colNum < cols; colNum++) {
	 * 
	 * //put values into hash table table.put(excel.getCellData(sheetName, colNum,
	 * 1), excel.getCellData(sheetName, colNum, rowNum));
	 * 
	 * data[rowNum-2][colNum] = table; } }
	 * 
	 * return data; }
	 */

}
