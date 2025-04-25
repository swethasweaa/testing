package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tests2 {
WebDriver driver=new ChromeDriver();
@Test(priority=1)
void openurl() {
	driver.get("https://www.automationexercise.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
}
@Test(priority=2)
void login() {
	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).isDisplayed());
}
@Test(priority=3)
void cart() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
	Actions action=new Actions(driver);
	WebElement d1=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[8]/div/div[1]/div[1]"));
	action.scrollToElement(d1).perform();
	Thread.sleep(6000);
	//hover element
	WebElement hover=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[7]/div/div[1]/div[1]"));
	action.moveToElement(hover).build().perform();
	Thread.sleep(5000);		
	WebElement vp=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[7]/div/div[2]/ul/li/a"));
	action.click(vp).build().perform();
	WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
	addToCartButton.click();
	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();
}
@Test(priority=4)
void signup() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    WebElement a=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"));
    if(a.getText().equals("New User Signup!")){
   	 System.out.println("it is visible");
   	 
    }else {
   	 System.out.println("not visible");
    }
    
   driver.findElement(By.name("name")).sendKeys("swe");
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("swea03@gmail.com");
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
   WebElement b=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b"));
   if(b.getText().equals("ENTER ACCOUNT INFORMATION")) {
   	System.out.println("it is visible "+b.getText());
   }else {
   	System.out.println("it is not visible");
   	
   }
   driver.findElement(By.id("id_gender2")).click();
   driver.findElement(By.id("password")).sendKeys("swe124");
   driver.findElement(By.name("days")).sendKeys("7");
   driver.findElement(By.cssSelector("select#months")).sendKeys("october");
   driver.findElement(By.cssSelector("select#years")).sendKeys("2003");
   Thread.sleep(5000);
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]/label")).click();
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]/label")).click();
   Thread.sleep(3000);
   driver.findElement(By.id("first_name")).sendKeys("swea");
   driver.findElement(By.id("last_name")).sendKeys("T");
   driver.findElement(By.name("company")).sendKeys("futogen");
   driver.findElement(By.id("address1")).sendKeys("salem");
   driver.findElement(By.id("address2")).sendKeys("chennai");
   driver.findElement(By.cssSelector("select#country")).sendKeys("India");
   driver.findElement(By.id("state")).sendKeys("tamilnadu");
   driver.findElement(By.id("city")).sendKeys("trichi");
   driver.findElement(By.id("zipcode")).sendKeys("636011");
   driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
   Thread.sleep(5000);
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
}
@Test(priority=5)
void acccreated() throws InterruptedException {
	
   WebElement k=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
   if(k.getText().equals("ACCOUNT CREATED!")) {
   	System.out.println("is visible " +k.getText());
   }else {
   	System.out.println("not visible");
   }
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click(); 
   WebElement h=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
   if(h.getText().equals("Logged in as swe")) {
   	System.out.println("visible " +h.getText());
   }else {
   	System.out.println("not visible");
   }
   driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
   driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
   WebElement s1=driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[3]"));
   WebElement s2=driver.findElement(By.xpath("//*[@id=\"cart_info\"]"));
   if( s1.isDisplayed() &&  s2.isDisplayed() ) {
  	 System.out.println("verified");
   }else {
  	 System.out.println("not verified!!");
   }
 Thread.sleep(4000);
   driver.findElement(By.name("message")).sendKeys("finest product");
   driver.findElement(By.linkText("Place Order")).click();
   driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys("kyc");
   driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input")).sendKeys("1234");
   driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("234");
   driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("12");
   driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input")).sendKeys("2001");
   Thread.sleep(6000);
   driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
   Thread.sleep(6000);
   WebElement k1=driver.findElement(By.linkText("Your order has been placed successfully!"));
   if(k1.isDisplayed()) {
   System.out.println("visible " +k1.getText());
   
}else {
      System.out.println("not visible");  	 
}
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/a")).click();
   Thread.sleep(4000);
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
   Thread.sleep(3000);

}
@Test
void delete() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
	driver.close();
}

}



