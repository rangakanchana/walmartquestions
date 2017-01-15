package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BasePage;

public class VehiclesPage extends BasePage {

	public VehiclesPage(WebDriver driver) {
		super(driver);
	}

	public boolean getLogo(){
		
		return driver.findElement(By.xpath("//h1[@id='mainTitle']")).isDisplayed();
		
	}
	
	public String clickLink(){
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//h1[@id='mainTitle']/following::a[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//h1[@id='mainTitle']/following::a[1]/following::a[1]"));
		
		action.moveToElement(element).click();
		
		return driver.getCurrentUrl();
	}
}
