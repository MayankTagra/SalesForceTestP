package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	
	WebDriver driver;

	
	
	
	public WebDriver Login()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	@BeforeSuite()
	public static void Setup()
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/SalesReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	@AfterMethod()
	public static void getResult(ITestResult result)
	{	
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Test case Failed ue to following reason", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Test Case Passed Successfully", ExtentColor.GREEN));
			
		}
		else
		{
			test.skip("Test case has been skipped");
		}
		
	}
	@AfterSuite()
	public static void tearDown()
	{
		extent.flush();
	}

	}
