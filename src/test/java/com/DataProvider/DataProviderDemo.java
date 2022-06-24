package com.DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider = "Login Data")
	public void loginPageByVariousData(int x, int y) {
		System.out.print("X:  " + x + "\t" + "Y:  " + y);
		Assert.assertTrue(((x + y) % 2 == 0), "Addition is odd");
	}

	@DataProvider(name = "Login Data")
	public Object[][] loginData() {
		Object[][] x = { { 4, 2 }, { 3, 4 }, { 6, 6 }, { 7, 8 }, { 9, 10 } };

		return x;
	}
}
