package dockersample;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class docker1 {
	public WebDriver driver = null;
	@Parameters("browser")
	@BeforeMethod
    public void setup(String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if(browser.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            capabilities.setBrowserName("firefox");
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    }
	@Test(priority=1)
	void url() throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		act.moveToElement(name).sendKeys("swe").perform();
		WebElement mail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		act.moveToElement(mail).sendKeys("swe@gmail.com").perform();
		
	}
	@Test(priority=2)
	void alert() throws InterruptedException {
		Thread.sleep(5000);
		Actions acts=new Actions(driver);
		WebElement alt=driver.findElement(By.xpath("//*[@id=\"alertBtn\"]"));
		Thread.sleep(4000);
	   acts.moveToElement(alt).click().build().perform();
		driver.switchTo().alert().accept();
	}
	@AfterMethod
    public void  tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
