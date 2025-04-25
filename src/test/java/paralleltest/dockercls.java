package paralleltest;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class dockercls {
WebDriver driver;
	
	
@BeforeClass
@Parameters({"browser"})
void url(String browser) throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    switch (browser.toLowerCase()) {
        case "chrome":
            capabilities.setBrowserName("chrome");
            break;
        case "firefox":
            capabilities.setBrowserName("firefox");
            break;
        case "edge":
            capabilities.setBrowserName("MicrosoftEdge");
            break;
        default:
            System.out.println("Invalid browser name");
            return;
    }

    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    System.out.println("Browser launched using Selenium Grid...");
}

		@Test(priority=1)
		void dummy() throws InterruptedException {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			Thread.sleep(5);
		}    
		
	@Test(priority=2)
	void register() throws InterruptedException {
		Thread.sleep(5);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5);
		driver.quit();
	}
	
	@AfterClass
	void sam2() {
		System.out.println("ending....");
	}

}
