package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class form {
	WebDriver driver;
	form(WebDriver driver){
		this.driver=driver;
	}
	By f_name=By.xpath("//*[@id=\"firstName\"]");
	By lst_name=By.xpath("//*[@id=\"lastName\"]");
	By email=By.xpath("//*[@id=\"userEmail\"]");
	By gender=By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]");
	By mobile_no=By.xpath("//*[@id=\"userNumber\"]");
	By dob=By.xpath("//*[@id=\"dateOfBirthInput\"]");
	By subject=By.xpath("//*[@id=\"subjectsContainer\"]/div");
	By hobby=By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label");	
	By pic=By.xpath("//*[@id=\"uploadPicture\"]");
	By Address=By.xpath("//*[@id=\"currentAddress\"]");
	By state=By.xpath("//*[@id=\"state\"]/div/div[2]/div/svg");
	By city=By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]");
	By submit=By.xpath("//*[@id=\"submit\"]");
			
	public void frst_name(String fn) {
		driver.findElement(f_name).sendKeys(fn);
	}
	public void last_name(String Ln) {
		driver.findElement(lst_name).sendKeys(Ln);
	}
	public void emailid(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	public void gndr() {
		driver.findElement(gender).click();
	}
	public void mobilen(String mobno) {
		driver.findElement(mobile_no).sendKeys(mobno);
	}

//	public void subjects(String subs) {
//		driver.findElement(subject).sendKeys("subs");
//		driver.findElement(subject).sendKeys(Keys.ENTER);
//	}
	public void hobbys() {
		driver.findElement(hobby).click();
	}
	public void pictures() {
		driver.findElement(pic).click();
		
	}
	public void add(String adrs) {
		driver.findElement(Address).sendKeys("adrs");
	}
	public void states(String sta) {
	
		driver.findElement(state).sendKeys("sta");
	}
	public void cityy(String cty) {
		
		driver.findElement(city).sendKeys("cty");
	}
	public void sumit() {
		driver.findElement(submit).click();
	}

	
	
    
}
