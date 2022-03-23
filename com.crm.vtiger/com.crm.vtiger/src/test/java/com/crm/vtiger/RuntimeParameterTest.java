package com.crm.vtiger;

import org.testng.annotations.Test;

public class RuntimeParameterTest {

	@Test
	public void param() {
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		
	}
}
