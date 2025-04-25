package testng;

import java.lang.module.ModuleDescriptor.Exports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class reportmanager  implements ITestListener{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkreporter.config().setDocumentTitle("Automation Report");
		sparkreporter.config().setReportName("Functional Testing");
		sparkreporter.config().setTheme(Theme.DARK);
		 extent=new ExtentReports();
		 extent.attachReporter(sparkreporter);
		extent.setSystemInfo("computer name","localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("tester name","swe");
		extent.setSystemInfo("os","Windows10");
		extent.setSystemInfo("Browser name","chrome");
}
	
	public  void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,"Test case is passed :"+result.getName());
		
	}
	public  void onTestFailure(ITestResult result){
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case is failed :"+result.getName());
		test.log(Status.FAIL,"Test case is failed cause :"+result.getThrowable());
		}
	public  void onTestSkipped(ITestResult result){
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case is Skipped :"+result.getName());
		
}
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}