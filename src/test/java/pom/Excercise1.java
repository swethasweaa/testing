package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Excercise1 {

	WebDriver driver;
	Excercise1(WebDriver driver){
		this.driver=driver;
	}
	
	By user_entry=By.xpath("//*[@id=\"user-name\"]");	
	By pswd_entry=By.xpath("//*[@id=\"password\"]");
	By login_btn=By.xpath("//*[@id=\"login-button\"]");
	By prod_page=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By cart=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cart_btn=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By chk_out=By.xpath("//*[@id=\"checkout\"]");
	By namef_form=By.xpath("//*[@id=\"first-name\"]");
	By namel_form=By.xpath("//*[@id=\"last-name\"]");
	By code=By.xpath("//*[@id=\"postal-code\"]");
	By con_btn=By.xpath("//*[@id=\"continue\"]");
	By fin=By.xpath("//*[@id=\"finish\"]");
	By msges=By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

public void user_method(String user1) {
	driver.findElement(user_entry).sendKeys(user1);
}
public void pwd(String pwd1) {
	driver.findElement(pswd_entry).sendKeys(pwd1);
}
public void login_btn_method()
{
	driver.findElement(login_btn).click();
}
public void product()
{
	System.out.println(driver.findElement(prod_page).isDisplayed());
	
}
public void cart1()
{
	driver.findElement(cart).click();
}
public void cart2()
{
	driver.findElement(cart_btn).click();
}
public void chkout()
{
	driver.findElement(chk_out).click();
}
public void frstname(String frstname1) {
	driver.findElement(namef_form).sendKeys(frstname1);
}
public void lstname(String lstname1) {
	driver.findElement(namel_form).sendKeys(lstname1);
}
public void codes(String code1) {
	driver.findElement(code).sendKeys(code1);
}
public void continued() {
	driver.findElement(con_btn).click();
}
public void finish() {
	driver.findElement(fin).click();
}
public void message() {
	System.out.println(driver.findElement(msges).isDisplayed());
}
}

