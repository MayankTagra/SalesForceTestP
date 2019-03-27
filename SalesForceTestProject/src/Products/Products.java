package Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class Products extends BaseClass{
	@Test()
	public void HoverTabs() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/products/");
		driver.findElement(By.xpath("//a[@href='#sales-scroll-tab']")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//a[@href='#service-scroll-tab']")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//a[@href='#marketing-scroll-tab']")).click();
		Thread.sleep(4400);
		driver.findElement(By.xpath("//a[@href='#other-products-scroll-tab']")).click();
		Thread.sleep(5600);
		
		
		
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/commerce-cloud/overview/?d=7010M000001y802']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(2300);
		/*
		driver.findElement(By/xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/heroku/overview/?d=7010M000001y80C']")).click();
		*/
		
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/heroku/overview/?d=7010M000001y80C']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/platform/overview/?d=70130000000lza1AAA']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/integration-cloud/overview/?d=cta-mule-more']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		System.out.println("Inside Products");
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/analytics-cloud/overview/?d=70130000000lzYiAAI']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/solutions/industries/?d=cta-industries-more']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/community-cloud/overview/?d=70130000000lzYpAAI']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@class='cardComponent parbase section']//div[@data-href='/in/products/quip/overview/?d=cta-quip-more']"))
		.click();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		
		
		driver.close();
		
	}

}
