package com.TestingShastra;

import org.testng.annotations.Test;

//by default 0 priority
public class TestAnnotationPriority {
	@Test(invocationCount = 2) // m1 test case will execute 2 times
	public void m1() { // if (invocationCount=0) then testcase will not take participation in testcase
						// execution
		System.out.println("First test case");
	}

	@Test(invocationCount = -1) // if invocationCount is o or less than (minus) then testcase will not be
								// executed
	public void m2() {
		System.out.println("Second test case");
	}

	@Test(enabled = false) // m3 will not participate in test case execution as 'false'.By default
							// (enabled=true)
	public void m3() {
		System.out.println("Third test case");
	}

	@Test(priority = -2, invocationCount = 4) // highest priority than (-2 in this eg.) m5 so will run before m5
	public void m4() {
		System.out.println("Fourth test case"); // we can use multiple parameters
	}

	@Test(priority = -1) // m5 test case will run first when no priority is mentioned to other test cases
	public void m5() {
		System.out.println("Fifth test case");
	}

	@Test(timeOut = 3000) // testcase will take max 3 seconds to execute
	public void m6() throws InterruptedException {
		Thread.sleep(5000); // testcase will take 5 seconds so testcase will fail
		System.out.println("Sixth test case");
	}

	@Test(invocationTimeOut = 6000, invocationCount = 3) // testcase should complete 3 iteration within 6 seconds
	public void m7() throws InterruptedException {
		Thread.sleep(2500); // testcase will get failed because set time for one time testcase execution is
							// 6000/3 =2000 but 1 testcase takes 2500 ms total time 2500*3=7500ms
		System.out.println("Seven test case");
	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void m8() {
		System.out.println("Eighth test case");
		throw new ArrayIndexOutOfBoundsException();
	}
}
