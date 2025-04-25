package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory {
	WebDriver  driver;
	
	pagefactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement user;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement pwd;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement login;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	public void user_mth(String user1) {
		(user).sendKeys(user1);
	}
	public void pwd_mth(String pwd1) {
		(pwd).sendKeys(pwd1);
	}
	public void login1()
	{
		(login).click();
	}
	
	
}
