package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionclass {
	
	@Test
	void assertwork() {
		
		System.out.println("sample message");
		System.out.println("sample message");
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(1==3);
		System.out.println("sample message");
		System.out.println("sample message");
		sa.assertAll();
		
	}

}
