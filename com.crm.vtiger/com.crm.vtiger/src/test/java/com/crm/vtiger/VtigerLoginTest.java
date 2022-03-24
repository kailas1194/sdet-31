package com.crm.vtiger;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLoginTest {
	@Test
	public void test() {
		WebDriver driver=null;
		
		Random rm=new Random();
	      int num=rm.nextInt(100);
	      
	      /**
	       * get runtime parameter
	       */
	      String browser=System.getProperty("browser");
	      
		  String url=System.getProperty("url");
		  String username=System.getProperty("username");
		  String password=System.getProperty("password");
		  if (browser.contains("chrome")) 
		  {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		  else if (browser.contains("firefox")) 
		  {
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		  }
		  else {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		}
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("successfully launch the browser ");
		//String org="tyss"+num;
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		System.out.println("successfully login to vtiger application");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"))).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		System.out.println("successfully logout from vtiger");
		driver.quit();
	
}
}