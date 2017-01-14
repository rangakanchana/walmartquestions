package ebay;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class PageLoadWaitEx {
	
	 //Please use this below snippet, It waits till your page is in ready state

	 static void waitForPageLoad(WebDriver wdriver) {
	 WebDriverWait wait = new WebDriverWait(wdriver, 60);

	 Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {

	 @Override
	 public boolean apply(WebDriver input) {
	 return ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
	 }

	 };
	 wait.until(pageLoaded);
	 }

}
