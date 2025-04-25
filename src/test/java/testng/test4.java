package testng;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class test4 {
	
		@BeforeTest
		void login() {
			System.out.println("login to ws");
			
		}
	      @Test
	      void validate() {
	    	  System.out.println("validate");
	      }
	      @Test(priority=1)
	    	     void sendkeys() {
	    	   	  System.out.println("sendkeys 123");
	    	     }
	    	     @AfterTest
	    	     void logout() {
	    	   	  System.out.println("logout ws");
	    	     }
	    	

	      }


