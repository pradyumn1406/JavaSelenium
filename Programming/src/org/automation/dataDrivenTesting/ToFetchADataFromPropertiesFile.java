package org.automation.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static org.automation.genericUtilities.FrameworkConstraints.*;

public class ToFetchADataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		File file = new File(PATH_PROPERTIES);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("password"));

		
		
		
	}

}
