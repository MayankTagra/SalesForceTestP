package Solutions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import HomePage.BaseClass;

public class Solutions extends BaseClass {
		@Test()
		public void RadioOptions() throws InterruptedException
		{
			WebDriver driver=Login();
			driver.get("https://www.salesforce.com/in/solutions/industries/");
			driver.findElement(By.xpath("//a[@data-id='banking']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='communications']")).click();
			//driver.findElement(By.xpath("//a[@data-id='travel-hospitality']"))
			Thread.sleep(3400);
			
			driver.findElement(By.xpath("//a[@data-id='consumer-goods']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='government']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='healthcare']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='insurance']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='life-sciences']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='manufacturing']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='media']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='non-profit']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='retail']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='travel-hospitality']")).click();
			Thread.sleep(3400);
			System.out.println("Execution Successful");
			Thread.sleep(3400);
			System.out.println("Clicking in Radio Buttons");
			
			driver.findElement(By.xpath("//a[@data-id='banking']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='communications']//span[@class='industry-card__circle']")).click();
			Thread.sleep(2300);
			driver.findElement(By.xpath("//a[@data-id='consumer-goods']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='government']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='healthcare']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='insurance']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='life-sciences']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='manufacturing']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='media']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='non-profit']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='retail']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='travel-hospitality']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			driver.findElement(By.xpath("//a[@data-id='wealth-management']//span[@class='industry-card__circle']")).click();
			Thread.sleep(3400);
			
			driver.close();

			
		}

}
