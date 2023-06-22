package Com.wallyax.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	FileReader filePath = null;
	BufferedReader reader = null;
	Properties properties;
	String path = "C:\\Users\\User\\Downloads\\wallyax\\wallyax\\configs\\Configuration.properties";

	public ConfigFileReader() {
				
		try {
			filePath = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reader = new BufferedReader(filePath);
		properties= new Properties();
		
		try {
			properties.load(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	public String getApplicationurl() {
		String url = properties.getProperty("URL");
		return url;
	}
	
	
	

}
