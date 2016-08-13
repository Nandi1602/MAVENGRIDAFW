package com.qspiders.grid;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	
	@Test
	public void test()
	{
		Reporter.log("Failed Test");
		Assert.fail();
	}

}
