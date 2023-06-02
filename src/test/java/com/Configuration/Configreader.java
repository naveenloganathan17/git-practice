package com.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	public static Properties p;

	public Configreader() throws IOException {
		File f = new File("C:\\Users\\gobiv\\eclipse-workspace\\Cucumber_demo\\ConfigurationFile.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();// define object ref under class
		p.load(fis);
	}

	public String getUrl() {
		String webAddress = p.getProperty("url");
		return webAddress;
	}
	public String getUsername() {
		String userId = p.getProperty("user");
		return userId;
	}
}
