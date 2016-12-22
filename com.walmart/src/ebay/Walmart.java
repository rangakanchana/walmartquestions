package ebay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Walmart {
	
	/*@Test
	public void findMaxPrice(){
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.walmart.com/browse/clothing/handbags/5438_1045799_1045800?sort=price_high");
	
	List<WebElement> values=driver.findElements(By.xpath("//span[@class='price price-display']"));
	
	int no_of_items=values.size();  
	
	System.out.println(no_of_items);
	
	for(int i=0;i<no_of_items;i++){
		
		String prices= values.get(i).getText();
		
		//System.out.println(prices);
		
		String modifiedPrice = prices.replaceAll("[\\t\\n\\r]", " ");
		
		//System.out.println(modifiedPrice);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add(modifiedPrice);
		
		for(int j=0;j<al.size();j++){
		}
		}
	}*/
	@Test
	public void findMaxPrice() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.walmart.com/browse/clothing/handbags/5438_1045799_1045800?sort=price_high");
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tile-price']"));
		int no_of_items = values.size();
		ArrayList<Double> al = new ArrayList<>();
		for (int i = 0; i < no_of_items; i++) {
			double price = getPrice(values.get(i).getText());
			if (price > 0) {
				al.add(price);
			}
		}
		if (al.size() > 0) {
			Collections.sort(al);
			Collections.reverse(al);
			System.out.println("Maximum List Price is: $" + al.get(0));

		}

		//System.out.println("Maximum List Price is: $" + al.get(0));
	}

	private double getPrice(String price) {
		// This regular expression concatenates the string into a single line by
		// removing new line
		// characters
		String modifiedPrice = price.replaceAll("[\\t\\n\\r]", " ");

		// These two variables below are to get the start and end index of the
		// list price value
		int listPriceIndex = modifiedPrice.indexOf("List price ");
		int saveIndex = modifiedPrice.indexOf(" Save");
		if (listPriceIndex > -1) { // There are some records without the list
									// price. Hence the check
			return Double.parseDouble(modifiedPrice.substring(listPriceIndex + 12, saveIndex));
		}
		return 0;
	}
}