package com.crm.vtiger.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {

	public String credentials(String propertiesKey) throws Throwable {
		String path="./src/main/resources/commondata.properties";
		FileInputStream fin=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fin);
		String data=prop.getProperty(propertiesKey);
		return data;
	}
}
