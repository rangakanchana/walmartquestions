package ebay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownEx {
	
	WebDriver driver;
	
	@Test
	public void findDropdown()
	{
		
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\jar files\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	*/
		
	driver  = new FirefoxDriver();
	
	driver.get("http://www.ebay.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
    
    List<WebElement> itemscount = dropdown.getOptions();
    
    int count = itemscount.size();
    
    System.out.println(count);
    
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
    for(WebElement optionValue:itemscount){
    	
    	String values=optionValue.getText();
    	
   // String optionValue=	itemscount.get(i).getText();
    	
    System.out.println(values);
    
    driver.close();
    }
    
}

}
