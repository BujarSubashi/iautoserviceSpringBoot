package com.cindytech.iautoservice.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 *  
 * @author www.instanceofjava.com
 * @category: java example programs
 *  
 * Write a java example program to read/ load properties file
 *
 */
public class ReadPropertyFile {

	public Properties getProperties() throws IOException {

		InputStream inputStream=null;
		Properties properties = new Properties();
		try {

			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException("property file " + propFileName + "not found in the classpath");
			}


		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return properties;
	}
}