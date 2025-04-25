package paralleltest;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class docker3 implements ITestListener
	{
		public void onStart(ITestContext context) {
			System.out.println("onstart");
		}
		public void onTestStart(ITestResult result) {
			System.out.println("onteststart");
		}
		public void onTestSuccess(ITestResult result) {
			System.out.println("ontestSuccess");
		}
		public void onTestFailure(ITestResult result) {
			System.out.println("ontestfailure");
		}
		public void onTestSkipped(ITestResult result) {
			System.out.println("ontestskipped");
		}
		public void onFinish(ITestContext context) {
			System.out.println("onfinish");
		}
		
	}


