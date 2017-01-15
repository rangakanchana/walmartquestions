package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.util.Configuration;
import com.util.WebUiDriver;

public abstract class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		
		Configuration _config = new Configuration();
		
	    driver = WebUiDriver.getDriver(_config);
	    driver.get(_config.URL);
		
		
	}
	
	

}
