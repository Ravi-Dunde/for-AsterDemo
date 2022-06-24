package com.groups;

import org.testng.annotations.Test;

public class Kaustubh {
	@Test(groups = {"Regression"})
	public void k1() {
		System.out.println("Kaustubh's first testcase");
	}

	@Test(groups = {"Regression"})
	public void k2() {
		System.out.println("Kaustubh's second testcase");
	}

	@Test(groups = {"Regression"})
	public void k3() {
		System.out.println("Kaustubh's third testcase");
	}

	@Test(groups = "Smoke")
	public void k4() {
		System.out.println("Kaustubh's fourth testcase");
	}

}
