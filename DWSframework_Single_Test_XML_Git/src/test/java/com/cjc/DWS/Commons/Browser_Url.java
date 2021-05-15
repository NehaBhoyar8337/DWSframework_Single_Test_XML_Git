package com.cjc.DWS.Commons;

import java.io.File;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Browser_Url {
	
	public static WebDriver driver;
	
	Logger log=Logger.getLogger(Browser_Url.class.getName());
	
	Properties pro=new Properties();
	
	@BeforeSuite
	public void openBrowser() throws IOException
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Testing Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    log.info("Open Browser Successfully");
	}
	
	
    @BeforeTest
    @Parameters({"url"})
	public void enterUrl(String url) throws IOException
	{

		driver.get(url);
		log.error("Open URL Successfully from Properties File");
	}
    
    
    @BeforeClass
    public void maxWindow()
    {
    	driver.manage().window().maximize();
    	log.warn("Maximize Window Successfully");
    }

    @BeforeMethod
    public void getCookies()
    {
    	Set<Cookie>cookies=driver.manage().getCookies();
    	int count=cookies.size();
    	log.fatal("No of Cookies:- "+count);
    	
    }
    
    @AfterMethod
    public void captureScreenShot() throws IOException
    {
    	/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(src,new File("D:\\Selenium Practice Work\\DWS Screenshots\\AfterRegistrDWS.jpeg"));*/
    	log.info("Registration ScreenShot Successfull");
    }
    

    @AfterClass
    public void deleteCookies()
    {
      // driver.manage().deleteAllCookies();
    	
    	log.fatal("Cookies Deleted Successfully");
			
    }
    
    
    @AfterTest
    public void closeDatabaseConnection()
    {
    	log.warn("Close DataBase Connection");
    }

   
    @AfterSuite
    public void closeDriver()
    {
    	//driver.close();
    	log.warn("Close Driver Successfully");
    }


	

}
