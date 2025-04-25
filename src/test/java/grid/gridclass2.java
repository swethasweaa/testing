package grid;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import java.net.MalformedURLException;
	import java.net.URL;

	public class gridclass2 {
		public WebDriver driver = null;

	    @BeforeMethod
	    public void setup() throws MalformedURLException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("firefox");
	        driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), capabilities);
	    }

	    @Test
	    public void testOne() {
	        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
	        System.out.println("Page title is: " + driver.getTitle() + " obtained from testOne");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	
}
