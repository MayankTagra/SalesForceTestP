package SupportAndServices;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class LeftPannel extends BaseClass {
	@Test()
	public void ContentType() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(4500);
		driver.findElement(By.linkText("Support & Services")).click();
		Thread.sleep(3400);
	//	Actions builder=new Actions(driver);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input"))).sendKeys("Live").build().perform();
		Thread.sleep(4500);
		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4500);
		
		
	
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-header']//div[@class='coveo-facet-header-settings']//span[@class='coveo-icon']")).click();
		driver.findElement(By.xpath("//div[@title='ScoreDescription']")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-header']//div[@class='coveo-facet-header-settings']//span[@class='coveo-icon']")).click();
		driver.findElement(By.xpath("//div[@title='OccurrencesDescription']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-header']//div[@class='coveo-facet-header-settings']//span[@class='coveo-icon']")).click();
		if(driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-show']"))!=null)
		{
		driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-hide']")).click();

		}
//	driver.findElement(By.xpath(""))
			//Repeat the Code
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-header']//div[@class='coveo-facet-header-settings']//span[@class='coveo-icon']")).click();
		if(driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-show']"))!=null)
		{
		driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-show']")).click();

		}
		//Now hide and show of content are done
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-more coveo-active']")).click();
		/*
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		*/
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-less coveo-active']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-more coveo-active']")).click();
		
		//Now we have shrinked the more or less of the component
		
		//Selecting all  the options in the content type
		int count=driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//ul[@class='coveo-facet-values']")).findElements(By.tagName("li")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//ul[@class='coveo-facet-values']")).findElements(By.tagName("li")).get(i).click();
			Thread.sleep(5000);
			//Thread.sleep(5000);
			
		}
		//Problem is that only 1 item is being selected at atime
		
		//Now clearing all selected options in the Content type
		/*	
		if(driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-header']//div[@title='Clear']"))!=null)
		{
		driver.findElement(By.xpath("//div[@id='ArticleTypeFacet']//div[@class='coveo-facet-header']//div[@title='Clear']")).click();
		}*/
		Thread.sleep(5000);
		driver.close();
	}
	@Test()
	public void Experience() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(4500);
		driver.findElement(By.linkText("Support & Services")).click();
		Thread.sleep(3400);
	//	Actions builder=new Actions(driver);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input"))).sendKeys("Live").build().perform();
		Thread.sleep(4500);
		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4500);
		
		
	
		driver.manage().window().maximize();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@id='ExperienceFacet']//div[@class='coveo-facet-header-settings']")).click();
		driver.findElement(By.xpath("//div[@title='ScoreDescription']")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@id='ExperienceFacet']//div[@class='coveo-facet-header-settings']")).click();
		driver.findElement(By.xpath("//div[@title='OccurrencesDescription']")).click();
		Thread.sleep(3400);
		
		driver.findElement(By.xpath("//div[@id='ExperienceFacet']//div[@class='coveo-facet-header-settings']")).click();
		if(driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-hide']"))!=null)
		{
		driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-hide']")).click();
		}
		
		
		driver.findElement(By.xpath("//div[@id='ExperienceFacet']//div[@class='coveo-facet-header-settings']")).click();
		if(driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-show']"))!=null)
		{
		driver.findElement(By.xpath("//div[@class='coveo-facet-settings-section coveo-facet-settings-section-show']")).click();
		}
		
		int count=driver.findElement(By.xpath("//div[@id='ExperienceFacet']//ul[@class='coveo-facet-values']")).findElements(By.tagName("li")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			driver.findElement(By.xpath("//div[@id='ExperienceFacet']//ul[@class='coveo-facet-values']")).findElements(By.tagName("li")).get(i).click();
			Thread.sleep(5000);
		
		}
		if(driver.findElement(By.xpath("//div[@id='ExperienceFacet']//div[@title='Clear']"))!=null)
		{
		driver.findElement(By.xpath("//div[@id='ExperienceFacet']//div[@title='Clear']")).click();
		}
		Thread.sleep(5000);
		driver.close();
		
		
	}
	@Test(enabled=true)
	public void TopicsSelectAll() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://help.salesforce.com/search?sfContext#q=live%20agent&f:@sflanguage=%5Ben_US%5D&firstQueryMeta=%5Bobject%20Object%5D");
		Thread.sleep(4500);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,500)");
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//div[@id='TopicFacet']//div[@class='coveo-facet-more coveo-active']")).click();
			
		}
		js.executeScript("window.scrollBy(0,-2000)");
		int count=driver.findElement(By.xpath("//div[@id='TopicFacet']//ul[@class='coveo-facet-values']")).
				findElements(By.xpath("li")).size();
		System.out.println(count);
		
		for(int i=0;i<count-1;i++)
		{
		
		try {
		
			driver.findElement(By.xpath("//div[@id='TopicFacet']//ul[@class='coveo-facet-values']")).
			findElements(By.xpath("li")).get(i).click();
			Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			
		}
		}
		
		
	}
	@Test()
	public void SelectRandom() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://help.salesforce.com/search?sfContext#q=live%20agent&f:@sflanguage=%5Ben_US%5D&firstQueryMeta=%5Bobject%20Object%5D");
		Thread.sleep(4500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//div[@id='TopicFacet']//li[@data-value='Search']//div[@class='coveo-facet-value-checkbox']")).click();
		
		Thread.sleep(4500);
		
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//ul[@class='coveo-facet-search-results']"))).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3200);
		driver.findElement(By.xpath("//div[@id='TopicFacet']//li[@data-value='Search']//div[@class='coveo-facet-value-checkbox']")).click();
		Thread.sleep(3100);
		builder.moveToElement(driver.findElement(By.xpath("//ul[@class='coveo-facet-search-results']")))
		.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4500);
		driver.close();
		
			
	}
	
	@Test()
	public void SelectAllLangugaes() throws InterruptedException
	{			
		//In this Segment first we select all languages and then we deselect all languages
		
		WebDriver driver=Login();
		
	driver.get("https://help.salesforce.com/search?sfContext#q=live%20agent&f:@sflanguage=%5Ben_US%5D&firstQueryMeta=%5Bobject%20Object%5D");
		Actions builder=new Actions(driver);
		Thread.sleep(3400);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,800)");
		Thread.sleep(3400);
		
		for(int i=0;i<4;i++)
		{
			try {
		driver.findElement(By.xpath("//div[@id='LanguageFacet']//div[@class='coveo-facet-more coveo-active']")).click();
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
					
			}
		}
		Thread.sleep(4500);
		int count=driver.findElement(By.xpath("//div[@id='LanguageFacet']//ul[@class='coveo-facet-values']")).findElements(By.tagName("li")).size();
		System.out.println(count);
		
		Thread.sleep(5000);
		for(int i=0;i<count;i++)
		{
			driver.findElement(By.xpath("//div[@id='LanguageFacet']//ul[@class='coveo-facet-values']")).findElements(By.tagName("li")).get(i).click();
			Thread.sleep(3400);
			
		}
		Thread.sleep(5600);
		
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(4500);
		
		driver.findElement(By.xpath("//li[@data-value='ru']//div[@class='coveo-facet-value-exclude']")).click();
		
		for(int i=1;i<=count;i++)
		{
			builder.moveToElement(driver.findElement(By.xpath("//div[@id='LanguageFacet']//ul[@class='coveo-facet-values']//li["+i+"]//div[@class='coveo-facet-value-exclude']"))).click().build().perform();
			Thread.sleep(2000);
		}
		Thread.sleep(4500);
		driver.close();
		
		
		
	}
	@Test()
	public void NavTabclass() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://help.salesforce.com/home");
		Thread.sleep(3400);
		int count=driver.findElement(By.xpath("//div[@id='nav_group']//ul[@class='ul-reset ul-nav1 ht-success-links']"))
				.findElements(By.tagName("li")).size();
		System.out.println(count);
		Thread.sleep(4500);
		driver.close();
	}

}
