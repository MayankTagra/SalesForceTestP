package CustomerSuccess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;

public class FilterBy extends BaseClass {

		
		@Test()
		public void Topics() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("windows.scrollBy(0,2000)");
			driver.findElement(By.xpath("//h4[@data-target='#collapse_T']")).click();
			Thread.sleep(50000);
			driver.findElement(By.xpath("//div[@id='collapse_T']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_T']//li[2]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_T']//li[3]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_T']")).click();
			driver.close();
			
		}
		@Test()
		public void Products() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
			driver.findElement(By.xpath("//h4[@data-target='#collapse_P']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_P']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_P']//li[2]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_P']//li[3]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_P']//li[4]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_P']")).click();
			Thread.sleep(3400);
			driver.close();
		}
		
		@Test()
		public void Industry() throws InterruptedException
		{	
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");

			driver.findElement(By.xpath("//h4[@data-target='#collapse_I']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_I']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_I']")).click();
			Thread.sleep(3400);
			driver.close();
		}
		@Test()
		public void BusinessSize() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BS']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_BS']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BS']")).click();
			Thread.sleep(2300);
			driver.close();
			
		}
		@Test()
		public void BusinessType() throws InterruptedException
		{	
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BT']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_BT']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BT']")).click();
			Thread.sleep(2300);
			driver.close();
			
		}
		@Test()
		public void ClearAll() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
			driver.findElement(By.xpath("//h4[@data-target='#collapse_T']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_T']//li[2]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_T']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_P']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_P']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_P']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_I']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='collapse_I']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_I']")).click();
			Thread.sleep(3400);
			
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BS']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='collapse_BS']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BS']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BT']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='collapse_BT']//li[1]//a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//h4[@data-target='#collapse_BT']")).click();
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(" //div[@class='filters-search-container']//a[@href='/in/customer-success-stories/']//span")).click();
			Thread.sleep(5000);
			
			driver.close();
			
			
		}
		@Test()
		public void ShowMore() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,4500)");
			Thread.sleep(10000);
			
			//driver.findElement(By.xpath("//a[@href='/in/customer-success-stories/#_filter,3']")).click();
			driver.findElement(By.xpath("//div[@class='filters-view-more col-xs-12']//a[1]")).click();
			Thread.sleep(10000);
			
			driver.close();
		}
		@Test()
		public void SeeTheStory() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/customer-success-stories/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.xpath("//div[@class='btn-container ']//a[@href='/in/customer-success-stories/inmobi/']")).click();
			Thread.sleep(6000);
			driver.navigate().back();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//div[@class='btn-container ']//a[@href='/in/customer-success-stories/y-axis/']")).click();
			Thread.sleep(6000);
			driver.navigate().back();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//div[@class='btn-container ']//a[@href='/in/customer-success-stories/urban-ladder/']")).click();
			Thread.sleep(6000);
			driver.navigate().back();
			Thread.sleep(6000);

			driver.close();
			

			
		}
		
}
