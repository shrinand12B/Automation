package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {
	
	public WebDriver driver;

	public void intializeDriver() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium Testing\\PageObjectModel\\src\\main\\java\\com\\Resources\\data.properties");
		
		Properties ps=new Properties();
		ps.load(fis);
		
		String browserName= ps.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
	}
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		intializeDriver();
	}
	
	
}
