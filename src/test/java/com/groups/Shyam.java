package com.groups;

import org.testng.annotations.Test;

public class Shyam {
	@Test(groups = {"Regression"})
	public void s1() {
		System.out.println("Shyam's first testcase");
	}

	@Test(groups = {"Regression"})
	public void s2() {
		System.out.println("Shyam's second testcase");
	}

	@Test(groups = "Smoke")
	public void s3() {
		System.out.println("Shyam's third testcase");
	}
}
