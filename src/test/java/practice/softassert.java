package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
@Test(priority=1)
void sa1() {
	SoftAssert s=new SoftAssert();
	String a="swe";
	String b="swe";
	s.assertEquals(a, b);
	s.assertAll();
}
@Test(priority=2)
void sa2() {
	SoftAssert s=new SoftAssert();
	String a="swe";
	String b="swea";
	s.assertNotEquals(a, b);
	s.assertAll();
}
@Test(priority=3)
void sa3() {
	SoftAssert s=new SoftAssert();
	String a="swe";
	String b="swea";
//	if(a.equals(b)) {
//		System.out.println("true");
//	}else {
//		System.out.println("false");
//	}
	s.assertEquals(a,b);
	s.assertTrue(true);
	s.assertAll();
}
@Test(priority=4)
void sa4() {
	SoftAssert s=new SoftAssert();
	String a="swe";
s.assertNotNull(a);
s.assertAll();

}
}