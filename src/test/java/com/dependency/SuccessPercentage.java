package com.dependency;

import org.testng.annotations.Test;

public class SuccessPercentage {
	int num = 0;

	@Test(successPercentage = 50, invocationCount = 10) // 50 is expected % of passing of test method. It is used with
														// convocationCount
	public void m1() {
		System.out.println("First testcase");
		if (num % 2 != 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			num++;
		}
		System.out.println("Number:  " + num);
	}

	@Test
	public void m2() {
		System.out.println("Second testcase");
	}
}
