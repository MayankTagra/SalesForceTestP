package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class Answers extends BaseClass{
	@Test()
	public void SelectAllTopics() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://help.salesforce.com/search?sfContext#q=live%20agent&f:@sflanguage=%5Ben_US%5D&firstQueryMeta=%5Bobject%20Object%5D");
		driver.findElement(By.xpath("//div[@id='nav1']//ul[@id='nav1_ul']")).findElements(By.tagName("li")).get(1).click();
		Thread.sleep(4500);
		
		int c=driver.findElement(By.xpath("//div[@id='ext-gen25']//ul")).findElements(By.tagName("li")).size();
		System.out.println(c);
		
		for(int i=0;i<c;i++)
		{
			try
			{
				driver.findElement(By.xpath("//div[@id='ext-gen25']//ul")).findElements(By.tagName("li")).get(i).click();
				Thread.sleep(4500);
				
			}
			catch(Exception e)
			{
				
			}
		}
		
		Thread.sleep(4600);
			driver.findElement(By.xpath("//a[@class='btn btn-rss button-block']")).click();
			Thread.sleep(3400);
			driver.navigate().back();
			Thread.sleep(4500);
			
	}
	
	@Test()
	public void ShowsolvedDropdown() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/answers?feedtype=RECENT&criteria=BESTANSWERS");
		Thread.sleep(3400);

		driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']")).click();
		Thread.sleep(3000);
		int count=driver.findElement(By.xpath("//div[@class='zen-options ']//ul[@class='feedfilters']"))
				.findElements(By.tagName("li")).size();
		System.out.println(count);

		for(int i=0;i<count;i++)
		{		
			if(i==0)
			{
				driver.findElement(By.xpath("//div[@class='zen-options ']//ul[@class='feedfilters']"))
					.findElements(By.tagName("li")).get(0).click();

			}
			else
			{

				driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']"))
				.click();
				Thread.sleep(3400);
	
	
				driver.findElement(By.xpath("//div[@class='zen-options ']//ul[@class='feedfilters']"))
				.findElements(By.tagName("li")).get(i).click();
				System.out.println(i);
	
				Thread.sleep(3400);
			}

		}
		
		int sortCount=driver.findElement(By.xpath("//ul[@class='feedsortby']"))
				.findElements(By.tagName("li")).size();
		System.out.println(sortCount);
		
				
		driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']")).click();
		for(int i=0;i<sortCount;i++)
		{
			if(i==0)
			{
			   driver.findElement(By.xpath("//ul[@class='feedsortby']"))
			   	.findElements(By.tagName("li")).get(0).click();
			}
			else
			{
				driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']")).click();
				Thread.sleep(3400);
				driver.findElement(By.xpath("//ul[@class='feedsortby']"))
				.findElements(By.tagName("li")).get(i).click();
				Thread.sleep(3400);
				
				
			}
		}
		System.out.println("Finally All Clicked");
		driver.close();

	}
	

}
