package GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	
	/**
	 * this method used to read data from property  file
	 * @param key
	 * @return
	 * @throws Throwable
	 * @author nagaraj shetty
	 */
	public String getKeyAndValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Property Data.properties");
		Properties pro= new Properties();
		pro.load(fis);
	    String value = pro.getProperty(key);
		return value;
	}

}
