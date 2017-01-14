package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WellsfargoEx {
	
	WebDriver driver;
	
	@Test
	public void search(){
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\jar files\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"btnSignon\"]")).click();
		
		String errorMessage = driver.findElement(By.xpath("//*[@id=\"contentLeft1\"]/div/p")).getText();
		
		Assert.assertEquals("Enter your username and password to securely view and manage your Wells Fargo accounts online."

, errorMessage);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().back();
		
        String header = driver.findElement(By.xpath("//img[@alt='Wells Fargo Home Page']")).getText();	
        
        System.out.println(header);
        
		driver.findElement(By.xpath("//*[@id=\"inputTopSearchField\"]")).sendKeys("careers");
		
		driver.findElement(By.name("btnG")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[@id=\"mainColumns\"]/div/div[2]/ol/li[1]/h2/a")).click();
		
		driver.findElement(By.xpath("//a[@href='https://www.wellsfargo.com/about/careers/']")).click();

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   Assert.assertEquals("Wells Fargo Careers",driver.getTitle());
	   
	   driver.close();
}
}
