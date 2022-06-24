package com.DataProvider;

import org.testng.annotations.DataProvider;

// In single data provider class multiple Data provider methods.
public class DataProviders {
	@DataProvider(name = "Login Data")
	public Object[][] loginData() {
		Object[][] x = { { 4, 2 }, { 3, 4 }, { 6, 6 }, { 7, 8 }, { 9, 10 } };

		return x;
	}

	@DataProvider(name = "SignUp Data")
	public Object[][] signUpData() { // Multiple Data Provider Methods
		Object[][] y = { { "Ravi", "ravidunde@gmail.com" }, { "Shyam", "shyamdarewar@gmail.com" } };
		return y;

	}

}
