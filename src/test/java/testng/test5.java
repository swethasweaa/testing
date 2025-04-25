package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test5 {
	@BeforeSuite
	void login() {
		System.out.println("login to ws");
		
	}
      @Test(priority=2)
      void validate() {
    	  System.out.println("validate");
      }
      @Test(priority=1)
      void sendkeys() {
    	  System.out.println("sendkeys 123");
      }
      @AfterSuite
      void logout() {
    	  System.out.println("logout ws");
      }
}
