package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest{
	
	HomePage hp;
	
	@BeforeClass 
	public void beforeClass(){
		
		hp = new HomePage(driver);
	}
	
	@Test(priority=1)
	public void testCountCategories(){
		
		Assert.assertEquals(36,hp.countCategories());
	}
	@Test(priority=2)
	public void testNavigate(){
		
		Assert.assertEquals("http://www.ebay.com/rpp/vehicles", hp.navigate());
		
		
	}

}
