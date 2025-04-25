package grid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class gridclass1 {
    public WebDriver driver = null;

    @BeforeClass
    public void setup() throws Exception {
       
       EdgeOptions options = new EdgeOptions();
       String hubURL = "http://192.168.1.4:4444";
       driver = new RemoteWebDriver(new URL(hubURL), options);
       driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void verifyLoginPage() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        String headerText = driver.findElement(By.xpath("//*[@id=\"signInForm\"]/h1")).getText();
        Assert.assertEquals(headerText, "Welcome, Login In");
        System.out.println("Login page loaded successfully");
    }

    @Test(priority = 2)
    public void performLogin() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement loginBtn = driver.findElement(By.xpath(" //*[@id=\"signInForm\"]/div[3]/input"));
 
        username.sendKeys("swe@gmail.com");
        password.sendKeys("testpass");
        loginBtn.click();
        System.out.println("Login performed successfully");
    }

    @Test(priority = 3)
    public void verifyHomeScreen() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Links"), "Home screen loaded");
        System.out.println("Home screen verified");
    }

    @Test(priority = 4)
    public void testLinksFunctionality() throws InterruptedException {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        WebElement link = driver.findElement(By.linkText("Home"));
        link.click();
        String find_url=driver.getCurrentUrl();
        System.out.println(find_url);
        driver.navigate().to("https://www.tutorialspoint.com/index.htm");
        Thread.sleep(5);
        WebElement footer = driver.findElement(By.xpath("/html/body/footer"));
        js.executeScript("arguments[0].scrollIntoView();", footer);

     
		/*
		 * driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]/a[3]/svg/path"))
		 * .click();
		 */
		
        
		/*
		 * for (String handle : driver.getWindowHandles()) {
		 * driver.switchTo().window(handle); }
		 * 
		 * String currentURL = driver.getCurrentUrl();
		 * Assert.assertTrue(currentURL.contains("youtube.com"),
		 * "youtube  link opened");
		 * System.out.println("youtube link clicked and verified");
		 */
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


