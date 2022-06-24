package com.dependency;

import org.testng.annotations.Test;

public class Thread {
	@Test(threadPoolSize = 3,invocationCount = 6)   // threadPoolSize is only used along with invocationCount 3 threads cumulatively execute test method 6 times
	public void m1() {                               //if threadpoolsize is increased then it will take more resource but it will run testcase fast
		System.out.println("First testcase");
	}
	
	@Test(singleThreaded = true)    // testcase is executed by single thread but in testng every testcase is executed by single thread so it don't have sense to mention single thread at method level.
	public void m2() {                // singleThreaded must be written at class level along with @test annotation
		System.out.println("Second testcase");
	}
}
