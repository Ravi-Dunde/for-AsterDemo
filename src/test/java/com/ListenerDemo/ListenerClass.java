package com.ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ctrl+shift+/  to comment 

// ctrl+shift+\ to remove comment 

public class ListenerClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// ITestListener.super.onTestFailure(result);
		System.err.println("Test case failed");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Regression testcases successfully run");
	}
	

}
