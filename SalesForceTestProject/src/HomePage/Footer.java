package HomePage;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Footer extends BaseClass {
	
	@Test()
	public void NewToSalesForce() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get(url());
		int count=driver.findElements(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  ']")).size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  ']")).get(i).click();
			Thread.sleep(4500);
			driver.navigate().back();
			Thread.sleep(5000);
			
		}
		driver.close();
		
		
	}
	
	@Test()
	public void AboutSalesForce() throws InterruptedException
	{	
		WebDriver driver=Login();
		driver.get(url());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count=driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']")).findElements(By.tagName("a")).size();
		System.out.println(count);
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(0).click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(1).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(2).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(3).click();
		Set<String> win=driver.getWindowHandles();
		Iterator<String> itr=win.iterator();
		ArrayList<String> al=new ArrayList();
		System.out.println(al);
		
		while(itr.hasNext())
		{
			al.add(itr.next());
		}
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(al.get(0));
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(4).click();
		Set<String> win1=driver.getWindowHandles();
		Iterator<String> itr1=win1.iterator();
		al.clear();		
		while(itr1.hasNext())
		{
			al.add(itr1.next());
		}
		driver.switchTo().window(al.get(1));
		Thread.sleep(2300);
		driver.close();
		driver.switchTo().window(al.get(0));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(5).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(6).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='col text-left col-sm-3 col-md-3 col-lg-3']//ul[@class='generic-links  margin-40-bottom-lg']"))
		.findElements(By.tagName("a")).get(7).click();
		Thread.sleep(4500);
		driver.navigate().back();
		Thread.sleep(4500);
		driver.close();
		
		
		
	
	
	

		
	}
	@Test()
	public void PopularLinks() throws InterruptedException
	{		
		WebDriver driver=Login();
		driver.get(url());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try
		{
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(0).click();
			Thread.sleep(2300);
			driver.navigate().back();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(1).click();
			
			Set<String> win=driver.getWindowHandles();
			Iterator<String> itr=win.iterator();
			ArrayList<String> al=new ArrayList();
			while(itr.hasNext())
			{
				al.add(itr.next());
			}
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(2).click();
			al.clear();
			Set<String> win1=driver.getWindowHandles();
			Iterator<String> itr1=win1.iterator();
			while(itr1.hasNext())
			{
				al.add(itr1.next());
				
			}
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			
			
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(3).click();
			Thread.sleep(3400);
			driver.navigate().back();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(4).click();
			Thread.sleep(3400);
			driver.navigate().back();
			
			Thread.sleep(3300);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(5).click();
			Thread.sleep(3400);
			Set<String> win2=driver.getWindowHandles();
			Iterator<String> itr2=win2.iterator();
			al.clear();
			while(itr2.hasNext())
			{
				al.add(itr2.next());
			}
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			driver.close();
			System.out.println("Run Completed");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Element not Found");
			js.executeScript("window.scrollBy(0,400)");
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(0).click();
			Thread.sleep(2300);
			driver.navigate().back();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(1).click();
			
			Set<String> win=driver.getWindowHandles();
			Iterator<String> itr=win.iterator();
			ArrayList<String> al=new ArrayList();
			while(itr.hasNext())
			{
				al.add(itr.next());
			}
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(2).click();
			al.clear();
			Set<String> win1=driver.getWindowHandles();
			Iterator<String> itr1=win1.iterator();
			while(itr1.hasNext())
			{
				al.add(itr1.next());
				
			}
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			
			
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(3).click();
			Thread.sleep(3400);
			driver.navigate().back();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(4).click();
			Thread.sleep(3400);
			driver.navigate().back();
			
			Thread.sleep(3300);
			driver.findElement(By.xpath("//div[@class='col text-left col-sm-2 col-md-2 col-lg-2']//ul[@class='generic-links  ']"))
			.findElements(By.tagName("a")).get(5).click();
			Thread.sleep(3400);
			Set<String> win2=driver.getWindowHandles();
			Iterator<String> itr2=win2.iterator();
			al.clear();
			while(itr2.hasNext())
			{
				al.add(itr2.next());
			}
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			driver.close();
			System.out.println("Run Completed");
			
			
		}
		
	}		
	
	
	

}
	
	

	

