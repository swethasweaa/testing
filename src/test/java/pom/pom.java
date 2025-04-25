package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {

	WebDriver driver;
	pom(WebDriver driver){
		this.driver=driver;
	}
	By user=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By pwd=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public void user(String user1) {
		driver.findElement(user).sendKeys(user1);
	}
	public void pwd(String pwd1) {
		driver.findElement(pwd).sendKeys(pwd1);
	}
	public void login1()
	{
		driver.findElement(login).click();
	}
}
