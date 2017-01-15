package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebUiDriver {
	
	public static WebDriver getDriver(Configuration config){
		
		WebDriver driver=null;
		
		switch(config.BROWSER){
		case "firefox":
		System.setProperty("webdriver.gecko.driver", config.GECKOPATH);
		driver = new FirefoxDriver();
		break;
		case "chrome":
		System.setProperty("webdriver.chrome.driver", config.CHROMEPATH);
		driver = new ChromeDriver();
		break;
		case "ie":
		System.setProperty("webdriver.ie.driver", config.IEPATH);
		driver = new InternetExplorerDriver();
		break;
		default:
		System.setProperty("webdriver.gecko.driver", config.GECKOPATH);
		driver = new FirefoxDriver();
			
		}
		return driver;
	}

}
