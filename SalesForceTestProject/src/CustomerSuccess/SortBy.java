package CustomerSuccess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class SortBy extends BaseClass{
	@Test()
	public void FilterCustomer() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/customer-success-stories/");
		Thread.sleep(34000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//div[@class='filter-category-sub']//li[1]//label")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='filter-category-sub']//li[2]//label")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='filter-category-sub']//li[3]//label")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
