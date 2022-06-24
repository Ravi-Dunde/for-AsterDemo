package com.dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test(dependsOnMethods = "m2")    // m1 method/testcase depends on m2 so m2 will execute before m1
	public void m1() {
		System.out.println("First testcase");
	}
	@Test
	public void m2() {
		System.out.println("Second testcase");
		Assert.assertEquals(true, false);      // this testcase run but failed so m1 skipped
	}
	@Test
	public void m3() {
		System.out.println("Third testcase");
	}@Test
	public void m4() {
		System.out.println("Fourth testcase");
	}
}

