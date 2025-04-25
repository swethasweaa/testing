package selenium;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class task1 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://saucelabs.com/");
   /* WebElement a=driver.findElement(By.xpath("/html/head/title"));*/
	/*
	 * System.out.println(driver.getTitle());
	 *  if(a.equals("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing")) 
	 *  { System.out.println("verified"); }else {
	 * System.out.println("not verified"); }
	 */
    List <WebElement> na=driver.findElements(By.tagName("a"));
    System.out.println(na.size());
    for(WebElement i:na) {
    	System.out.println(i.getText());
	
	}
	
	
	
}}
