package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EbayEx{
	
	
        @Test
	    public  void navigate(){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.linkText("Motors"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//a[@href='http://www.ebay.com/rpp/vehicles']")).click();
				
		
		driver.close();
		
    }

    }
