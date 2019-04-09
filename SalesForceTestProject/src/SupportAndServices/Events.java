package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import HomePage.BaseTest;

public class Events extends BaseTest {
	@Test()
	public void EnterInfo() throws InterruptedException
	{		
		test=extent.createTest("Enter Info");
		//In this First we will click on save the date and then we will further procced to filling up the form
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/events");
		Thread.sleep(4500);
		driver.findElement(By.xpath("//div[@data-index='0']//div[@class='action-cta']//a")).click();
		Thread.sleep(3400);
		Actions builder=new Actions(driver);
		
		driver.findElement(By.id("UserFirstName")).sendKeys("chlo");
		driver.findElement(By.id("UserLastName")).sendKeys("Anderson");
		driver.findElement(By.id("UserTitle")).sendKeys("PO Manager");
		driver.findElement(By.id("UserEmail")).sendKeys("chlob@gmail.com");
		driver.findElement(By.id("UserPhone")).sendKeys("8934891123");
		driver.findElement(By.id("CompanyName")).sendKeys("SDA");
	/*	builder.moveToElement(driver.findElement(By.id("UserFirstName"))).sendKeys("Chlo").build().perform();
		builder.moveToElement(driver.findElement(By.id("UserLastName"))).sendKeys("hlohedin").build().perform();
		builder.moveToElement(driver.findElement(By.id("UserTitle"))).sendKeys("PO Manager").build().perform();
		builder.moveToElement(driver.findElement(By.id("UserEmail"))).sendKeys("chlobl@gmail.com").build().perform();
		builder.moveToElement(driver.findElement(By.id("UserPhone"))).sendKeys("8938392891").build().perform();
		builder.moveToElement(driver.findElement(By.id("CompanyName"))).sendKeys("SDA").build().perform();*/
		
		driver.findElement(By.xpath("//select[@id='CompanyEmployees']//following-sibling::a")).click();
		driver.findElement(By.xpath("//a[@rel='100']")).click();
		
		driver.findElement(By.xpath("//select[@id='CompanyCountry']//following-sibling::a")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelectorAll('ul[class=\"selectBox-dropdown-menu selectBox-options\"]')[3].scrollBy(0,100)");
		Thread.sleep(4500);
		
		driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][4]//a[@rel='IN']")).click();
		Thread.sleep(4500);
		
		driver.findElement(By.xpath("//select[@id='Lead.Industry']//following-sibling::a")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@rel='Automotive']")).click();
		Thread.sleep(1200);
		driver.close();
		
		
		
		
		
	}

}
