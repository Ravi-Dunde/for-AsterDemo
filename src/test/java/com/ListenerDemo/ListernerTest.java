package com.ListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Listeners(ListenerClass.class)         //Not recommended to write @Listeners in class it should be in .xml file (inside suite tag)so that listeners will be applicable for all classes.
public class ListernerTest {
	@Test
	public void m1() {
		// Assert.assertEquals(true, true); // listener will not be executed i.e. no
		// error msg
		Assert.assertEquals(true, false); // listners will be executed and err msg will be on console

	}

	@Test
	public void m2() {
		Assert.assertEquals("hi", "hi");
	}

}
