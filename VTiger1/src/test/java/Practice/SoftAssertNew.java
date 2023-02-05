package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertNew {
	@Test
	
	public void softAssert() {
		
		System.out.println("Step 1");
		System.out.println("step2");
		SoftAssert st= new SoftAssert();
		st.assertEquals(false, true);
	
		System.out.println("Step 3");
		System.out.println("step 4");
		st.assertAll();
	}

}
