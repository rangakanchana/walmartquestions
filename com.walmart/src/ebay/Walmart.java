package ebay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Walmart {
	
	@Test
	public void findMaxPrice(){
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.walmart.com/browse/clothing/handbags/5438_1045799_1045800?sort=price_high");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//List<WebElement> values=driver.findElements(By.xpath("//span[@class='price price-display']"));
	
	List<WebElement> values=driver.findElements(By.xpath("//div[@class='price-main-block']"));

	
	List<Double> prices = new ArrayList<Double>() ;
		
		for (int i=0;i<values.size();i++){
			
		//the price is coming in 3 lines thats why splitting the price in 3 parts	
			
        String [] tmp = values.get(i).getText().split("\n");
        
        System.out.println(tmp.toString());
        
        //then adding together... //tmp[0]=$5499+tmp[1]=.,tmp[2]=95 cents
        
		String addString = tmp[0];
		
		System.out.println(addString);
		
		//for taking off $ sign
		addString=addString.substring(1, addString.length());
		
		System.out.println(addString);
		 
		//for taking off , sign
		addString=addString.replace(",", "");
		
		System.out.println(addString);
		
		Double priceList=Double.parseDouble(addString);

		prices.add(priceList);	
		}
		System.out.println( "All Prices " + prices);
		
        Double maxPrice=Collections.max(prices);
        
        System.out.println("max price bag is "+maxPrice);
        
        driver.close();
		}

			
		
	    }
	

	


