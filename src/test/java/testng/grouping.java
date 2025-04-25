package testng;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class grouping {
	WebDriver driver=new ChromeDriver();
	@Test(priority=1,groups= {"orange"})
	void url() throws InterruptedException
	{                                                                                          
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("entered to url");
		Thread.sleep(5000);
	}
	
	@Test(priority=2,groups= {"orange"})
	void register()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		System.out.println("register...");
	}
	@Test(priority=3,groups= {"orange"})
	void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("login..");
		Thread.sleep(3000);
	}
	@Test(priority=4,groups={"orange","dashboard"})
	void dash() {
		WebElement d=driver.findElement(By.xpath("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
		System.out.println(d.isDisplayed());
		System.out.println("dash");
	   	
	}
	@Test(priority=5,groups= {"dashboard"})
	void act() {
		WebElement d1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div/p"));
		System.out.println(d1.isDisplayed());
		System.out.println("act");
	}
}
