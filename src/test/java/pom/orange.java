package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class orange {
	WebDriver driver;
	@BeforeClass
	void url() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
	}

	@Test
	void login2() {
		pom pm=new pom(driver);
		pm.user("Admin");
		pm.pwd("admin123");
		pm.login1();
		
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");	
	}
	@AfterClass 
	void out()
	{
		driver.close();
	}
}
