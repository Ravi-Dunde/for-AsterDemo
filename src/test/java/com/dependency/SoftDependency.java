package com.dependency;

import org.testng.annotations.Test;

public class SoftDependency {
	@Test(dependsOnMethods = "m2", alwaysRun = true) // though m1 method depends on m2 method and m2 method fails, m1
														// method run and not skipped
	public void m1() {
		System.out.println("First testcase"); // by default all methods have 'alwaysRun=false'
	}

	@Test
	public void m2() {

		System.out.println("Second testcase");
		throw new ArrayIndexOutOfBoundsException();
	}

	@Test(dependsOnMethods = "m2", alwaysRun = false) // m3 skipped
	public void m3() {
		System.out.println("Third testcase");
		throw new ArrayIndexOutOfBoundsException();
	}

	@Test(dependsOnMethods = "m2") // m4 skipped....bydefault "alwaysRun = false"
	public void m4() {
		System.out.println("Fourth testcase");
	}

	@Test(alwaysRun = false)      //m5 run
	public void m5() {
		System.out.println("Fifth testcase");
	}

}
