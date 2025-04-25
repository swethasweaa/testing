package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice1 {
       @BeforeSuite
       void beforesuit() {
    	   System.out.println("beforesuit");
       }
       @Test(priority=1)
       void name() {
    	   System.out.println("name1");
       }
       @BeforeTest
       void Beforetest() {
    	   System.out.println("Beforetest");
       }
       @Test(priority=2)
       void name2() {
    	   System.out.println("name2");
       }
       @BeforeMethod
       void BeforeMethod() {
    	   System.out.println("BeforeMethod");
       }
       @Test(priority=3)
       void name3() {
    	   System.out.println("name3");
       }
       @BeforeClass
       void BeforeClass() {
    	   System.out.println("BeforeClass");
       }
}
