package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testt {
	 @Test(priority=1)
     void sendkeys() {
   	  System.out.println("sendkeys 123");
     }
     @AfterTest
     void logout() {
   	  System.out.println("logout ws");
     }
}
