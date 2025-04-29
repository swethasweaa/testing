package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

//hard assert

public class asserts {
@Test(priority=1)
void ass1() {
	String a="hii";
	//String b="hello";
	String b="hii";
	Assert.assertEquals(a,b);
	
}
@Test(priority=2)
void ass2() {
	String a="hii";
	String b="hellohii";
	Assert.assertNotEquals(a,b);
}
@Test(priority=3)
void ass3() {
	String a="hii";
	String b="hii";
	String c=a.equals(b)?"true":"false";
	System.out.println(c);
	Assert.assertTrue(true);
	
}
@Test(priority=4)
void ass4() {
	String a="hii";
	String b="hello";
	String c=a.equals(b)?"true":"false";
	System.out.println(c);
	Assert.assertFalse(false);
	}
@Test(priority=5)
void ass5() {
	String a=null;
	Assert.assertNull(a);
}
@Test(priority=6)
void ass6() {
	String a="null";
	Assert.assertNotNull(a);
}


}
