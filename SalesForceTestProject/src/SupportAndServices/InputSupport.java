package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class InputSupport extends BaseClass {
	@Test()
	public void SearchInput() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(3400);
		driver.findElement(By.linkText("Support & Services")).click();
		Thread.sleep(4500);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input"))).sendKeys("Live").build().perform();
		Thread.sleep(4500);
		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4500);
		
		
	}
	@Test()
	public void VisitTopResults() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(3400);
		driver.findElement(By.linkText("Support & Services")).click();
		Thread.sleep(4500);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input"))).sendKeys("Live").build().perform();
		Thread.sleep(4500);
		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4500);
		int count=driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")).findElements(By.tagName("a")).size();
		System.out.println(count);
		
		for(int c=0;c<count-1;c++)
		{
			driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")).findElements(By.tagName("a")).get(c).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(4500);
			
		}
	}
	@Test()
	public void NavigateTopResults() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(3400);
		driver.findElement(By.linkText("Support & Services")).click();
		Thread.sleep(4500);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input"))).sendKeys("Live").build().perform();
		Thread.sleep(4500);
		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4500);
		int count=driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")).findElements(By.tagName("a")).size();
		System.out.println(count);
		
		for(int c=0;c<count-1;c++)
		{
			driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")).findElements(By.tagName("a")).get(c).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(4500);
			
		}
		int countli=driver.findElement(By.xpath("//ul[@class='coveo-pager-list']")).findElements(By.tagName("li")).size();
		System.out.println(countli);
	
		for(int i=0;i<countli;i++)
		{
			driver.findElement(By.xpath("//ul[@class='coveo-pager-list']")).findElements(By.tagName("li")).get(i).click();
			Thread.sleep(3400);
			driver.navigate().back();
			Thread.sleep(4500);
			
			
		}
		
		driver.close();
		
	}
	

}
