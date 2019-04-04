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
	public void StatusFilterDropdown()
	{
		WebDriver driver=Login();
		driver.get("");
	}

}
