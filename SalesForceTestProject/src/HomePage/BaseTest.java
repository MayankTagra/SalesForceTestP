package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
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
	public WebDriver driver;
	
	public WebDriver Login()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			return driver;
			
	}
	public String url()
	{
		return "https://www.salesforce.com/in/cro/index-smb/?ir=1";
	}
	
	@BeforeSuite()
	public void Setup()
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/SalesForceTestReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	
	@BeforeMethod()
	public void getData(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"The Test case failed ue to"
					+ " the following reason", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"Test case passed", ExtentColor.GREEN));
		}
		else
		{
			test.skip("The given tezt case has been skipped");
		}
	}
	@AfterSuite()
	public void tearDown()
	{
		extent.flush();
	}
}