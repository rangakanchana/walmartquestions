package com.test;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.VehiclesPage;


public class VehiclesPageTest extends BaseTest {
	
	VehiclesPage vp;
	
	@BeforeClass
	public void beforeClass(){
		
		vp = new VehiclesPage(driver);
	}
	@Test
	public void testClickLink(){
		
	Assert.assertEquals("http://www.ebay.com/rpp/[]vehicles",vp.clickLink());
	}
	@Test
	public void testLogo(){
		
	Assert.assertTrue(vp.getLogo());
	}

}
