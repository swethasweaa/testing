package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class paralleltest1 {
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser"})
	void url(String B) throws InterruptedException {
		switch(B){
		case"chrome":driver=new ChromeDriver();break;
		case"edge":driver=new EdgeDriver();break;
		case"firefox":driver=new FirefoxDriver();break;
		default:System.out.println("invalid browser");return;
		}	
		System.out.println("switch comp...");
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