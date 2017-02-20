package com.qtpselenium.core.ddf.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtpselenium.core.ddf.base.BaseTest;



public class DummyTestA extends BaseTest{
	
	@Test(priority=1)
	public void testA1()
	{
		Assert.fail();
	}
	@Test(priority=2)
	public void testA2()
	{
		
	}
	@Test(priority=3)
	public void testA3()
	{
		
	}
}
