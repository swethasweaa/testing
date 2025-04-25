package testng;
import org.testng.annotations.*;
public class test3 {
	@BeforeClass
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
      @AfterClass
      void logout() {
    	  System.out.println("logout ws");
      }
}
