package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
@Test(priority=1)
void sa() {
	//assertEquals
	SoftAssert sa1=new SoftAssert();
	String act="its SA";
	String exp="its not SA";
	sa1.assertEquals(act, exp);
	sa1.assertAll();
	
}
@Test(priority=2)
void sa2() {
	//assertNotEquals
	SoftAssert sa1=new SoftAssert();
	String act="its SA";
	String exp="its not SA";
	sa1.assertNotEquals(act, exp);
	sa1.assertAll();
}

@Test(priority=2)
void sa3() {
	//assertNotEquals
	SoftAssert sa1=new SoftAssert();
	String act="its SA";
	String exp="its SA";
	sa1.assertEquals(act, exp);
	sa1.assertTrue(true);
	sa1.assertAll();
}
@Test(priority=3)
void sa4() {
	//assertNotEquals
	SoftAssert sa1=new SoftAssert();
	String act="its SA";
	sa1.assertNotNull(act);

}
}
