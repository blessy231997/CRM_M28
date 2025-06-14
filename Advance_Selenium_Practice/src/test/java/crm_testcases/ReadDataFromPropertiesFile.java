package crm_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {

		// Create java representation object of physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\login.properties.txt");
		// Create an object of Properties
		Properties prop = new Properties();
		// Load all the keys
		prop.load(fis);
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("Url");
		String username = prop.getProperty("Username");
		String password = prop.getProperty("Password");
	}

}
