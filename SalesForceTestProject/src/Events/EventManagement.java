package Events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class EventManagement extends BaseClass {
	@Test()
	public void SelectEventCountry() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/events/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		//Scrolled down
		
		driver.findElement(By.xpath("//a[@data-filter-region='North America']")).click();
		driver.findElement(By.xpath("//a[@data-filter-region='EMEA']")).click();
		driver.findElement(By.xpath("//a[@data-filter-region='Latin America']")).click();
		driver.findElement(By.xpath("//a[@data-filter-region='Japan']")).click();
		driver.findElement(By.xpath("//a[@data-filter-region='APAC']")).click();
		driver.findElement(By.xpath("//a[@data-filter-region='Australia']")).click();
		Thread.sleep(5600);
		driver.close();
		
		
	}
	@Test()
	public void SelectEvent() throws InterruptedException
	{
		WebDriver driver=Login();
	//	driver.get("https://www.salesforce.com/in/events/");
		driver.get("https://www.salesforce.com/in/events/");
		
		driver.findElement(By.xpath("//a[@data-filter-region='APAC']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				
				js.executeScript("document.querySelector('div[id=\"moreEvents\"]').scrollBy(0,200)");
				Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='http://www.salesforce.com/ap/events/details/in-g4g-bangalore-20q1']")).click();
		//Now we will be redirected to the Register Page
		driver.findElement(By.xpath("//ul[@class='ul-level-1 clearfix horizontal']//li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='ul-level-1 clearfix horizontal']//li[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("UserFirstName")).sendKeys("Mayank");
		driver.findElement(By.id("UserLastName")).sendKeys("Tagra");
		driver.findElement(By.id("UserTitle")).sendKeys("CR Manager");
		driver.findElement(By.id("UserEmail")).sendKeys("mayanktagra1@hmail.com");
		driver.findElement(By.id("UserPhone")).sendKeys("9898989898");
		driver.findElement(By.id("CompanyName")).sendKeys("SCAM");
		
		driver.findElement(By.xpath("//select[@id='CompanyEmployees']/following-sibling::a")).click();
		driver.findElement(By.xpath("//a[@rel='70']")).click();
		
		driver.findElement(By.xpath("//select[@id='CompanyCountry']//following-sibling::a")).click();
		driver.findElement(By.xpath("//a[@rel='AF']")).click();
		Thread.sleep(3400);
		
		
		driver.navigate().back();
		Thread.sleep(3400);
		driver.close();
		
		
	}
	@Test()
	public void ViewMore() throws InterruptedException
	{
		WebDriver driver=Login();
	//	driver.get("https://www.salesforce.com/in/events/");
		driver.get("https://www.salesforce.com/in/events/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.xpath("//div[@class='col  text-left col-xs-12 col-sm-4 col-md-6 col-lg-4']//div[@class='btn-container ']//a")).click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		driver.close();
	}

}
