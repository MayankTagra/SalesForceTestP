package HomePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
	
public class Header extends BaseClass  {
@Test()
public void NavBarHover() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	driver.manage().window().maximize();
	
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.linkText("PRODUCTS")));
	builder.moveToElement(driver.findElement(By.linkText("SOLUTIONS")));
	builder.moveToElement(driver.findElement(By.linkText("Support & Services")));
	builder.moveToElement(driver.findElement(By.linkText("Events")));
	builder.moveToElement(driver.findElement(By.linkText("Customer Success")));
	builder.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
	
	driver.findElement(By.linkText("PRODUCTS")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("SOLUTIONS")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Support & Services")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Events")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Customer Success")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("About Us")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	
	driver.close();
	

	
	
}
@Test()
public void InputSearch() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	Actions builder=new Actions(driver);
	driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']//input")).sendKeys("live");
	Thread.sleep(10000);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']//input")))
	.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(4500);
	//driver.close();
	
	
	
}
@Test()
public void InputTypeAndErase() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']//input")).sendKeys("live");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-icon']")).click();
	driver.close();
	
	
}
@Test()
public void Globe() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	//driver.findElement(By.xpath)
	Actions builder=new Actions(driver);
	
	int count=driver.findElements(By.xpath("//div[@class='utility-bar']//ul[@class='generic-links  ']//li")).size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		//builder.movetoElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='region-selector_button']"))).get(i).click();
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='region-selector_button']"))).build().perform();
		driver.findElements(By.xpath("//div[@class='utility-bar']//ul[@class='generic-links  ']//li")).get(i).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		
	}
	driver.close();
}


@Test()
public void ContactUsSelect1() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	Thread.sleep(10000);
	
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//a[@href='#']"))).build().perform();
	driver.findElement(By.xpath("//div[@class='liveagent-data']/following-sibling::a")).click();
	Thread.sleep(30000);
	
	driver.findElement(By.id("FirstName")).sendKeys("Mayank");
	driver.findElement(By.id("LastName")).sendKeys("Tagra");
	driver.findElement(By.id("Email")).sendKeys("mayanktagra1@gmail.com");
	driver.findElement(By.id("Phone")).sendKeys("9898989898");
	driver.findElement(By.xpath("//div[@class='buttonWrapper embeddedServiceSidebarForm']//span")).click();
	
	Thread.sleep(60000);
	//Actions builder=new Actions(driver);
	try
	{
	builder.moveToElement(driver.findElement(By.xpath("//textarea[@class='chasitorText  textarea']"))).sendKeys("Hello")
	.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(5600);
	builder.moveToElement(driver.findElement(By.xpath("//textarea[@class='chasitorText  textarea']"))).sendKeys("Want to know About SalesForce")
	.sendKeys(Keys.ENTER).build().perform();
	
	}
	catch(Exception e)
	{
		System.out.println("Chat Page Not Loaded");
		driver.findElement(By.xpath("//button[@class='waitingCancelChat uiButton--inverse uiButton embeddedServiceSidebarButton']")).click();
		driver.findElement(By.xpath("//div[@class='dialogButtonContainer']//button[1]")).click();
	}
	
	
	driver.close();
}

@Test()
public void ContactUsSelect2() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	//Thread.sleep(2000);
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//a[@href='#']"))).build().perform();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu flyout-menu ']//li[2]")).click();
	Thread.sleep(5000);
	driver.close();
}
@Test()
public void ContactUsSelect3() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	Thread.sleep(100);
	
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//a[@href='#']"))).build().perform();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu flyout-menu ']//li[4]//a")).click();
	Thread.sleep(4500);

	driver.findElement(By.id("UserFirstName")).sendKeys("Rakshit");
	driver.findElement(By.id("UserLastName")).sendKeys("Mitra");
	driver.findElement(By.xpath("//select[@id='UserTitle']/following-sibling::a//span[1]")).click();
	/*Select s =new Select(driver.findElement(By.id("UserTitle")));
	//s.selectByIndex(4);
	s.selectByValue("IT_Manager_AP");
//	s.se
	*/
	
	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][1]//li[3]")).click();
	
	//Select Box Selection Over
	
	driver.findElement(By.id("UserEmail")).sendKeys("Rakee2@gmail.com");
	driver.findElement(By.id("UserPhone")).sendKeys("9946868989");
	driver.findElement(By.id("CompanyName")).sendKeys("ManesrTechnologies");
	
	//Selecting the Number of Employees
	driver.findElement(By.xpath("//select[@id='CompanyEmployees']/following-sibling::a")).click();
	
	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][2]//li[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//select[@name='CompanyCountry']/following-sibling::a")).click();
//	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][4]//li[15]")).click();
	//driver.findElement(By.xpath("//select[@name='CompanyCountry']/following-sibling::a")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.querySelectorAll('ul[class=\"selectBox-dropdown-menu selectBox-options\"]')[3].scrollTop=900");
	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][4]//li[45]")).click();
	Thread.sleep(6000);
	
	//driver.findElement(By.id("SubscriptionAgreement")).click();
	Thread.sleep(45000);
	driver.close();
	
	

	
}
@Test()
public void LoginClick() throws InterruptedException
{
	WebDriver driver=Login();
	driver.get(url());
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"))).build().perform();
	int count=driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
			.findElements(By.tagName("a")).size();
	System.out.println(count);
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(0).click();
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
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(1).click();
	
	
	Set<String> win1=driver.getWindowHandles();
	Iterator<String> itr1=win1.iterator();
	al.clear();
	while(itr1.hasNext())
	{
		al.add(itr1.next());
	}
	driver.switchTo().window(al.get(1));
	Thread.sleep(3400);
	driver.close();
	driver.switchTo().window(al.get(0));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(2).click();
	
	
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
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(3).click();
	
	Set<String> win3=driver.getWindowHandles();
	Iterator<String> itr3=win3.iterator();
	al.clear();
	while(itr3.hasNext())
	{
		al.add(itr3.next());
	}
	driver.switchTo().window(al.get(1));
	Thread.sleep(3400);
	driver.close();
	driver.switchTo().window(al.get(0));
	Thread.sleep(3000);
	

	
}




}
