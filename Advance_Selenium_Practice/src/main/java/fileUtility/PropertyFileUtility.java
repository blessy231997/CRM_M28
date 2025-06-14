package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String ReadDatafromPropertiesFile(String key) throws IOException{
		
		FileInputStream fis = new FileInputStream("./configAppData/login.properties.txt");
		// Create an object of Properties
		Properties prop = new Properties();
		// Load all the keys
		prop.load(fis);
	    String value = prop.getProperty(key);
	    
		return value;
		
	}

}
