package com.qtpselenium.core.ddf.testcases;

import org.testng.annotations.Test;

import com.qtpselenium.core.ddf.base.BaseTest;



public class DummyTestB extends BaseTest{
	
	@Test
	public void testB()
	{
		
		openBrowser("Mozilla");
		navigate("appurl");
		type("email_xpath","darshit.oniyosys@gmail.com");
		click("button_xpath");
		
		//verifyTitle();
		//reportFail("title does not match");
		
		
	}


}
