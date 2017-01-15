package com.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {

	Properties prop;
	public final String CHROMEPATH;
	public final String IEPATH;
	public final String GECKOPATH;
	public final String URL;
	public final String BROWSER;

	public Configuration() {

		try {
			FileReader reader = new FileReader(new File("./config.properties"));

			prop = new Properties();

			prop.load(reader);
		} catch (Exception e) {
			e.getMessage();

		}

		CHROMEPATH = prop.getProperty("chromepath");
		IEPATH = prop.getProperty("iedriverpath");
		GECKOPATH = prop.getProperty("geckopath");
		URL = prop.getProperty("url");
		BROWSER = prop.getProperty("browser");
	}

}
