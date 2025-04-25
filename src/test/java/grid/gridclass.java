package grid;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class gridclass {
    public WebDriver driver = null;

    @BeforeClass
    public void setup() throws Exception {
       
    	EdgeOptions options = new EdgeOptions();
        String hubURL = "http://192.168.1.4:4444";
        driver = new RemoteWebDriver(new URL(hubURL), options);
    }

    @Test
    public void testTwo() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        System.out.println("Page title is: " + driver.getTitle() + " obtained from testTwo");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


