package testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class practice2 {
	@AfterSuite
    void AfterSuite() {
 	   System.out.println("AfterSuite");
    }
    @Test(priority=1)
    void password() {
 	   System.out.println("password");
    }
    @AfterTest
    void AfterTest() {
 	   System.out.println("AfterTest");
    }
    @Test(priority=2)
    void validate2() {
 	   System.out.println("validate2");
    }
    @AfterMethod
    void AfterMethod() {
 	   System.out.println("AfterMethod");
    }
    @Test(priority=3)
    void name5() {
 	   System.out.println("name5");
    }
    @AfterClass
    void AfterClass() {
 	   System.out.println("AfterClass");
    }
}
