package HomePage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MidContent extends BaseClass {
	@Test()
	public void SalesForceCustomerSuccess() throws InterruptedException
	{
		WebDriver driver=Login();
		driver.get(url());
		
		Actions builder=new Actions(driver);
		System.out.println("1 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/platform/overview/?d=70130000000YsT5']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/platform/overview/?d=70130000000YsT5']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		Thread.sleep(4500);
		Set<String> win=driver.getWindowHandles();
		Iterator<String> itr=win.iterator();
		ArrayList<String> al=new ArrayList();
		
		while(itr.hasNext())
		{
			al.add(itr.next());
			
			
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		System.out.println("2 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/service-cloud/overview/?d=70130000000YsSg']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/service-cloud/overview/?d=70130000000YsSg']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		Thread.sleep(3400);
		Set<String> win1=driver.getWindowHandles();
		Iterator<String> itr1=win1.iterator();
		al.clear();
		while(itr1.hasNext())
		{
			al.add(itr1.next());
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		System.out.println("3 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/marketing-cloud/overview/?d=70130000000mINk']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(4300);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/marketing-cloud/overview/?d=70130000000mINk']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		Set<String> win2=driver.getWindowHandles();
		Iterator<String> itr2=win2.iterator();
		al.clear();
		while(itr2.hasNext()) {
			al.add(itr2.next());
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);


		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		System.out.println("4 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/community-cloud/overview/?d=70130000000YsSv']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/community-cloud/overview/?d=70130000000YsSv']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		
	
		Set<String> win3=driver.getWindowHandles();
		Iterator<String> itr3=win3.iterator();
		al.clear();
		while(itr3.hasNext())
		{
			al.add(itr3.next());
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		 System.out.println("5 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/analytics-cloud/overview/?d=70130000000YsT0']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/analytics-cloud/overview/?d=70130000000YsT0']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		Set<String> win4=driver.getWindowHandles();
		Iterator<String> itr4=win4.iterator();
		al.clear();
		while(itr4.hasNext())
		{
			al.add(itr4.next());
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		System.out.println("6 Exec");
		
		
		
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/platform/overview/?d=70130000000YsT5']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/platform/overview/?d=70130000000YsT5']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		Set<String> win5=driver.getWindowHandles();
		Iterator<String> itr5=win5.iterator();
		al.clear();
		while(itr5.hasNext())
		{
			al.add(itr5.next());
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		
		
		
		
		System.out.println("7 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/salesforce-iot/overview/?d=701300000025TQF']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(3400);
		
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/salesforce-iot/overview/?d=701300000025TQF']"))
				.findElement(By.linkText("WATCH DEMO"))).click().build().perform();
		Set<String> win6=driver.getWindowHandles();
		Iterator<String> itr6=win6.iterator();
		al.clear();
		while(itr6.hasNext())
		{
			al.add(itr6.next());
		}
		try
		{	
			driver.switchTo().window(al.get(1));
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(al.get(0));
			//Thread.sleep(4500);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Only 1 window is present");
			driver.navigate().back();
			
		}
		Thread.sleep(3400);
		System.out.println("8 Exec");
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='    columns-wrapper    margin-60-bottom-lg margin-40-bottom-sm column-container-component bg-default '] //div[@class='cardComponent parbase section']//div[@data-href='/in/products/?d=70130000000YsaK']")))
		.click().build().perform();
		Thread.sleep(3400);
		driver.navigate().back();
		Thread.sleep(5600);
		

		

		driver.close();
		//at Last Test Case Completed
		
	}

	

	

}
