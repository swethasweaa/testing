package testng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	WebDriver driver=new ChromeDriver();
	@BeforeClass
	void url() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(dataProvider="bind")
	void login(String name,String pass) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		boolean a=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		if(a==true) {
			Thread.sleep(5000);
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	@DataProvider(name="bind")
	String[][] login1(){
		String data [][]= {
				{"admin","Admin1234"},
				{"Admin","admin123"},
				{"Admin","ADmin1234"},
				
		};
		return data;
		
	}
	@AfterClass
	void logout() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
}
