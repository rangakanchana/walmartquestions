package com.page;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String navigate(){
		
    WebElement element = driver.findElement(By.linkText("Motors"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	driver.findElement(By.xpath("//a[@href='http://www.ebay.com/rpp/vehicles']")).click();
	
	return driver.getCurrentUrl();

}
	
	public int countCategories(){
		
		WebElement element = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		
        Select dropdown = new Select(element);	
    
    List<WebElement> count =  dropdown.getOptions();
    
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    return count.size();

		
		
	}
}
