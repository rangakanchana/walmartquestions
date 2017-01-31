package ebay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YelpEx {
	
	@Test
	public void findMaxReviews(){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.yelp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='find_desc']")).sendKeys("restaurants");
		
		driver.findElement(By.xpath("//input[@id='find_desc']")).sendKeys(Keys.ENTER);
		
		/*Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath(""))*/
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//ul[@class='suggested-filters_filter-list']/li[7]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//div[@class='filter-set sort-filters']/ul/li[3]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='review-count rating-qualifier']"));
		
		List<Integer> review = new ArrayList<Integer>();
		
        for(WebElement reviews: elements){
        
        	String listReviews=reviews.getText();
        	
        	System.out.println(listReviews);
        	
        	   String listOfReviews= listReviews.replaceAll("[^0-9]", "");
        	   
   	         System.out.println(listOfReviews);
   	         
   	         int r=Integer.parseInt(listOfReviews);
   	         
   	         review.add(r);

        	   
             }
        System.out.println("all reviews are:::" +review);
        
        System.out.println("the max reviews are:::"+ Collections.max(review));
        
        driver.close();
        
       }

}
