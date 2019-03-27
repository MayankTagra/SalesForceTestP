package TryForFreeWithExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseClass;


public class TFFFormPage extends BaseClass {
	@Test()
	public void TestExcel() throws IOException, InterruptedException
	{
		GetExcelData ed=new GetExcelData();
		ArrayList<String> al=ed.Getdata("Others");
		WebDriver driver=Login();
		driver.get(url());
		
		
		ArrayList<String> winal=new ArrayList();

		
		Thread.sleep(3400);
		driver.findElement(By.xpath("//div[@class='free-trial-container']//a")).click();
		Thread.sleep(3400);
		Set<String> win=driver.getWindowHandles();
		Iterator<String> itr=win.iterator();
		while(itr.hasNext())
		{
			winal.add(itr.next());
		}
		driver.switchTo().window(winal.get(1));
		Thread.sleep(3400);

		driver.findElement(By.id("UserFirstName")).sendKeys(al.get(1));
		driver.findElement(By.id("UserLastName")).sendKeys(al.get(2));
		driver.findElement(By.id("UserEmail")).sendKeys(al.get(3));
		driver.findElement(By.id("UserPhone")).sendKeys(al.get(4));
		driver.findElement(By.id("CompanyName")).sendKeys(al.get(5));
		
		driver.findElement(By.xpath("//select[@id='UserTitle']/following-sibling::a")).click();
		driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options']//a[@rel='Others_AP'] ")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//select[@id='CompanyEmployees']/following-sibling::a")).click();
		
		//driver.findElement(By.xpath("//select[@id='CompanyCountry']/following-sibling::a ")).click();
		driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options']//a[@rel='250']")).click();
		Thread.sleep(3400);
		driver.findElement(By.xpath("//select[@id='CompanyCountry']/following-sibling::a")).click();
		driver.findElement(By.xpath("//a[@rel='AD']")).click();
		Thread.sleep(3400);
		
		driver.findElement(By.id("SubscriptionAgreement")).click();
		

		Thread.sleep(3400);
		driver.close();
		
		driver.switchTo().window(winal.get(0));
		driver.close();
		
		
		
	
		
		
		
		
	}

}
