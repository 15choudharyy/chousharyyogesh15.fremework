package com.comcast.contactlist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTest {
	
	
	@Test(retryAnalyzer=com.crm.desksolution.gernericrepositary.RetryAnalyzer.class)
	
	public void sampleTest()
	{
		Assert.assertTrue(false);
	}

}
