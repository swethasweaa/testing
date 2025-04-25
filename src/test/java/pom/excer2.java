package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class excer2 {
WebDriver driver;
	
	@BeforeClass
	void url() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();	
	}
	@Test(priority=1)
	void forms() throws InterruptedException {
		form F=new form(driver);
		F.frst_name("swea");
		F.last_name("T");
		F.emailid("swe@gmail.com");
		Thread.sleep(3000);
		F.gndr();
		Thread.sleep(3000);
	}
		@Test(priority=2)
		void form2() throws InterruptedException {
			form F=new form(driver);
			Thread.sleep(3000);
		F.mobilen("1234567891");
		Thread.sleep(5000);
		
		//F.subjects("Computer Science");
		
		//driver.findElement().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		}
		@Test(priority=3)
		void form3() throws InterruptedException {
			form F=new form(driver);
		F.pictures();
		F.add("salem");
		F.states("Haryana");
		F.cityy("karnal");
		Thread.sleep(3000);
		F.sumit();
		}
	
	@AfterClass
	void out() {
		driver.close();
	}
	
}
