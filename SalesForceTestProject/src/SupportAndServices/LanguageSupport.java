package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LanguageSupport {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://help.salesforce.com/search?sfContext#q=live%20agent&f:@sflanguage=%5Ben_US%5D&firstQueryMeta=%5Bobject%20Object%5D");
		
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
		
		
		Thread.sleep(4500);
		driver.close();
		
		
		
	}

}
