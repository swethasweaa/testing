package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	@Test(priority=1)
	void asert() {
		//AssertEqual()
		
		String a="condition statement";
		String b="nocondition statement";
		Assert.assertEquals(a, b);
		}
	@Test(priority=2)
	void asert2()
	{
		//AssertNotEqual()
		
		String a="condition statement";
		String b="no condition statement";
		Assert.assertNotEquals(a, b);
	}
	@Test(priority=3)
	void asert3() {
		
		//Assert true()
		
		String a="condition statement";
		String b="condition statement";
		if(a.equals(b)) {
			System.out.println("true");
			Assert.assertTrue(true);
		}else {
			System.out.println("false");
			Assert.assertTrue(false);
		}
		
	}
	@Test(priority=4)
	void asert4() {
		
		//Assert false()
		
		String a="condition statement";
		String b="no condition statement";
		if(a.equals(b)) {
			System.out.println("true");
			Assert.assertFalse(true);
		}else {
			System.out.println("false");
			Assert.assertFalse(false,"there is a condition");
		}
		}
	@Test(priority=5)
	void asert5() {
		
		//Assert null()
		
		String a=null;
		Assert.assertNull(a);
	
}
	@Test(priority=6)
	void asert6() {
		
		//Assert not null()
		
		String a="null";
		Assert.assertNotNull(a);
	}}
