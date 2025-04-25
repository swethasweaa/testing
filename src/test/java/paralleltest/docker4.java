package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class docker4 {
	public class listener {
		WebDriver driver=new ChromeDriver();
		@BeforeClass
		void max() {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		@Test(priority =1)
		void url() {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		@Test(priority=2)
		void title()
		{
		String a=driver.getTitle();
		String b=a.equals("OrangeHRM")?"page visible "+ a: "not visible";
		Assert.fail();
		
	System.out.println(b);
		}
		@Test(priority=3)
			void login() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
						
			}
		@Test(priority=4)
		void logout() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
			
		}
		@AfterClass
		void Quite()
		{
			driver.quit();
		}
		}



}
