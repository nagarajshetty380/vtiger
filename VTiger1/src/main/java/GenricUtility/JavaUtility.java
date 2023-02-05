package GenricUtility;

import java.util.Random;

public class JavaUtility {
	
	public int getRandomNum() {
		
		/**
		 * this method is used for Avoiding Duplicate value
		 * @return
		 * @author nagar
		 */
		Random r= new Random();
		int ranNum = r.nextInt(1000);
		
		return ranNum;
		
	}


}