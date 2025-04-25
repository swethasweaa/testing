package testng;

import org.testng.annotations.*;

public class test2 {

	@BeforeMethod
	void login() {
		System.out.println("login to an website");
		
	}
	@Test(priority=2)
	void validate() {
		System.out.println("validate the website");
	}
	@Test(priority=1)
	void sendkeys() {
		System.out.println("sendkeys(abc)");
	}
	@AfterMethod
	void logout() {
		System.out.println("logout from logout");
		
	}
	
}
