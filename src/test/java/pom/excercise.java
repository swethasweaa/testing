package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class excercise {
	WebDriver driver;
	
	@BeforeClass
	void url() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
	}
	@Test
	void login()
	{
		Excercise1 ex=new Excercise1(driver);
		ex.user_method("standard_user");
		ex.pwd("secret_sauce");
		ex.login_btn_method();
		
	}
	
	@Test(priority=2)
    void products() {
		Excercise1 ex=new Excercise1(driver);
		ex.product();
    }
	
	@Test(priority=3)
    void carts() throws InterruptedException {
		Excercise1 ex=new Excercise1(driver);
     ex.cart1();
     Thread.sleep(3000);
     ex.cart2();
    }
	@Test(priority=4)
	void chkouts() throws InterruptedException {
		Excercise1 ex=new Excercise1(driver);
		ex.chkout();
		Thread.sleep(3000);
		ex.frstname("swe");
		ex.lstname("S");
		ex.codes("636015");
		Thread.sleep(3000);
		ex.continued();
		ex.finish();
		Thread.sleep(3000);
		}
	@Test(priority=5)
	void msg() {
		Excercise1 ex=new Excercise1(driver);
		ex.message();
		System.out.println("the success message validated");
	}
	 @AfterClass
     void closed() {
    	 driver.close();
     }
}

