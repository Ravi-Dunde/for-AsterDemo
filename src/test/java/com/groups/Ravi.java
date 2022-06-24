package com.groups;

import org.testng.annotations.Test;

public class Ravi {
	@Test(groups = {"Regression"})
	public void m1() {
		System.out.println("Ravi's first testcase");
	}

	@Test(groups = {"Regression","Smoke"})
	public void m2() {
		System.out.println("Ravi's second testcase");
	}

	@Test(groups = {"Regression","Smoke"})
	public void m3() {
		System.out.println("Ravi's third testcase");
	}

	@Test(groups = "Smoke")
	public void m4() {
		System.out.println("Ravi's fourth testcase");
	}

	@Test
	public void m5() {
		System.out.println("Ravi's fifth testcase");
	}

	@Test
	public void m6() {
		System.out.println("Ravi's sixth testcase");
	}
}
