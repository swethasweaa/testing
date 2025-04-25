package testng;





	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.Test;



	public class s {

	    @Test

	    public void testAssertEquals() {

	        System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.navigate().to("https://www.browserstack.com/");

	        String actualTitle = driver.getTitle();

	        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";

	        assertEquals(actualTitle, expectedTitle, "Page title does not match the expected value");

	        driver.quit();

	    }

	}

