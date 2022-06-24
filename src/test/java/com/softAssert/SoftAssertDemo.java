package com.softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class SoftAssertDemo {
	public void m1() {
		Assert.assertEquals("Hello", "Hello");  // testcase will pass // hard assert
		
		// In hard assert where there are multiple asserts and if any failure then line below that assert will not run
		
		//Assert.assertEquals("Hi", "Hello");  //testcase will fail and no further execution if no soft assert
		// soft assert
		SoftAssert softly =new SoftAssert();
		  softly.assertEquals("Hi", "Hello");
		  System.out.println("Soft Assert");
		  softly.assertEquals("Hello", "Hello");
		  softly.assertEquals("Hi", "Hello"); 
		  softly.assertAll(); 
 // softly.assertAll(); it is compulsory at the end of all asserts when multiple asserts are used.
// if softly.assertAll(); is not written then test will pass each time
	}

}
