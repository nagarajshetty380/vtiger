package Practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

//	@Test
//	
//	public void createContact()
//	{
//		System.out.println("step 1");
//		System.out.println("step 2");
//		Assert.assertEquals(true, false);
//		System.out.println("steo 1");
//		
//	}
//	@Test
//	public void createContactt() {
//		System.out.println("Step 5");
//		System.out.println("step 6");
//	}
	@Test
	public void create() {
		String expName="nagaraj";
		String actName="Shetty";
		
		Assert.assertEquals(expName, actName);
	//Assert.assertEquals(true, true);
	}
	
}

