package com.DataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;

//It is expected to write test cases in 1 class and Data Providers in another class.
public class DemoTest {
	@Test(dataProvider = "Login Data", dataProviderClass = DataProviders.class)
	public void loginPageByVariousData(int x, int y) {
		System.out.print("X:  " + x + "\t" + "Y:  " + y);
		Assert.assertTrue(((x + y) % 2 == 0), "Addition is odd");
	}

	@Test(dataProvider = "SignUp Data", dataProviderClass = DataProviders.class)
	public void signUpByDifferentData(String name, String email) {
		System.out.println("User Name:" + name + "\t" + "Email Address:" + email);
	}
}