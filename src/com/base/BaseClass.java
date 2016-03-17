package com.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.utilities.ReportSetup;

public class BaseClass{
	
	public WebDriver driver;
	private boolean isReportFolderCreated = true;
	private static String fileSeperator = System.getProperty("file.separator");
	//Logger log =Logger.getLogger("BaseClass");
	
	@BeforeSuite
	public void beforeSuite() throws Exception
	{
		if (isReportFolderCreated)
		{			
			ReportSetup.createFolderStructure();
			isReportFolderCreated = false;
		}
		//log.info("<h2>--------------------SuiteRunner Log-------------------------<h2>");
	}
	
	public WebDriver getdriver(String bname)
	{
		bname=bname.toLowerCase();
	
		switch (bname) {
		case "ff":
			driver=new FirefoxDriver();
			break;
		
			
		case "chrome":
			// Set path for Chrome Driver executable
			 System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	        
	        // Launch ChromeDriver
	        driver = new ChromeDriver();
			break;
			
		case "ie":
			// Set path for Internet Explorer Driver executable
	        System.setProperty("webdriver.ie.driver", ReportSetup.getDriversPath()+ fileSeperator+"IEDriverServer32.exe");
	        
	        // Launch InternetExplorerDriver
	        driver = new InternetExplorerDriver();
			break;
			
		case "phantom":
			DesiredCapabilities capability = new DesiredCapabilities();  
			  capability.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Users\\Saketh\\Downloads\\phantomjs-2.0.0-windows\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");
			  driver = new PhantomJSDriver(capability);
			  break;
			  
		case "html":
			
			driver=new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
				break;
			

		default:
			System.out.println("Please provide proper input");
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
	public void midWait(int waitInSec){
		try{
			Thread.sleep(waitInSec*1000);
		}catch(Exception e){
			
		}
	}
	

}
