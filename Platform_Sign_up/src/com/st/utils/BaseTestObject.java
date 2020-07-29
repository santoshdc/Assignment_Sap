package com.st.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLEngineResult.Status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTestObject {
	
	public static ExtentReports extent;
    public static ExtentTest test;
	
	protected static WebDriver uiDriver;;
	public static String propertyFilePath = System.getProperty("user.dir")+"\\src\\TestData\\testData.properties";
	public static String chromeDriverPath = System.getProperty("user.dir")+"\\src\\Driver\\chromedriver.exe";
	
	FileInputStream fileInput =null;
	//Properties ObjProperty = getPropertyContents();
	Properties ObjProperty=getPropertyContents();
	
	public String browser = ObjProperty.getProperty("browser");
	public String url = ObjProperty.getProperty("url");
	/**
	 
     * This function will execute before each Test tag in testng.xml
 
     * @param browser
 
     * @throws Exception
 
     */
	private static final Properties prop = new Properties();

	private static void loadPropertiesFile() 
	{
		InputStream input = null;

		try
		{
			input = new FileInputStream(propertyFilePath);
			// load a properties file
			prop.load(input);
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		} 
		finally 
		{
			if (input != null) 
			{
				try
				{
					input.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static Properties getPropertyContents() {
		loadPropertiesFile();
		return prop;
	}
	
	@BeforeSuite
	public void beforesuite() {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/STExtentReport.HTML",true);
		extent.addSystemInfo("Host Name","Platform").addSystemInfo("Environment","Autmation Testing").addSystemInfo("User Name","Santosh");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xm"));
	}
	
	@BeforeClass(alwaysRun = true)
    public void setup() throws Exception
	{
        if(browser.equalsIgnoreCase("FF"))
        {
            uiDriver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("GC"))
        {
            System.setProperty("webdriver.chrome.driver",chromeDriverPath);
            uiDriver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("IE")){
            //System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
            //uiDriver = new InternetExplorerDriver();
        }
        else
        {
        	throw new Exception("Browser is not correct");
        }
        uiDriver.manage().deleteAllCookies();
        uiDriver.get(url);
        Thread.sleep(5000);
        uiDriver.manage().window().maximize();
        uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        
        
        
        
}
	
	
	

	@AfterSuite
    public void tearDown()
    {
        extent.flush();
    }

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


