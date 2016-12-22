package ebay;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class TripAdvisor {
	
	public static void main(String[] args){
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.tripadvisor.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("date_picker_in_1")).click();
	
	List<WebElement> dates= driver.findElements(By.xpath("//div[@class = 'month'][@style='left: 0px;']/table/tbody//td"));
	
	int size = dates.size();
	
	System.out.println(size);
	
	for(int i=0;i<size;i++){
		
		String values = dates.get(i).getText();
		
		System.out.println(values);
		
	}
	
	
	
	
	

}
}