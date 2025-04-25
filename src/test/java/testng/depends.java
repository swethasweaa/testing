package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depends {
@Test(priority=1)
void login() {
	System.out.println("login into the page");
	Assert.assertTrue(true);
}
@Test(priority=2,dependsOnMethods={"login"})
void home () {
	System.out.println("home page...");
	Assert.assertTrue(false);
}
@Test(priority=3,dependsOnMethods={"login","home"})
void search() {
	System.out.println("search..");
	Assert.assertTrue(true);
}
}