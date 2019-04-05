package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class Ideas extends BaseClass{
	@Test()
	public void SortDropdown() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/ideaSearch?filter=Delivered+in+Winter+17");
		Thread.sleep(2000);
		//Click Sort
		
		driver.findElement(By.xpath("//button[@id='idea_filter_opener']")).click();
		driver.findElement(By.linkText("Popular")).click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("//button[@id='idea_filter_opener']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Recent")).click();
		Thread.sleep(5500);
		driver.findElement(By.xpath("//button[@id='idea_filter_opener']")).click();
		
		driver.findElement(By.linkText("Trending")).click();
		Thread.sleep(2300);
		driver.close();
		
	}
	@Test()
	public void StatusFilterDropdown() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/ideaSearch?sort=2&filter=Delivered+in+Winter+17");
		
		Thread.sleep(3200);
		int count=driver.findElement(By.xpath("//div[@class='overlay-menu overlay-menu-select'][2]//ul[@class='ul-reset']"))
				.findElements(By.tagName("li")).size();
		System.out.println(count);
		Thread.sleep(4000);
		

		for(int i=1;i<23;i++)
		{
			driver.findElement(By.xpath("//button[@id='idea_status_filter_opener']")).click();
			Thread.sleep(5400);
			driver.findElement(By.xpath("//div[@class='overlay-menu overlay-menu-select'][2]//li["+i+"]")).click();
			Thread.sleep(3400);

		}
		
		driver.close();
	}
	@Test()
	public void SelectAllOptionsOnLeft() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/ideaSearch");
		Thread.sleep(3200);
		int count=driver.findElement(By.xpath("//ul[@class='ul-reset ul-nav2']"))
				.findElements(By.tagName("li")).size();
		System.out.println(" count "+count);
		
		for(int i=1;i<=count;i++)
		{
			driver.findElement(By.xpath("//ul[@class='ul-reset ul-nav2']//li["+i+"]//a")).click();
			int innerCount=driver.findElement(By.xpath("//ul[@class='ul-reset ul-nav2']"
					+ "//li[@class='selected']//ul[@class='ul-reset ul-nav2']"))
					.findElements(By.tagName("li")).size();
			System.out.println("InnerCount "+innerCount);

			for(int k=1;k<=innerCount;k++)
			{
				
					driver.findElement(By.xpath("//ul[@class='ul-reset ul-nav2'"
							+ "]//li["+i+"]"
							+ "//ul[@class='ul-reset ul-nav2']//li["+k+"]")).click();
						
						Thread.sleep(5400);
						
						//clicked 
					
			
			}
			
		}
		
	}

}
