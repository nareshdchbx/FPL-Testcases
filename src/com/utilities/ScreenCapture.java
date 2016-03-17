package com.utilities;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.testng.Reporter;


public class ScreenCapture  
{
	//private  static char cQuote = '"';
	private static String fileSeperator = System.getProperty("file.separator");
	static Logger log =Logger.getLogger("ScreenCapture");
	
	public ScreenCapture()
	{
		
	}
	/**
	 * Purpose - This method takes the screenshot and returns the Screenshot path
	 * @param driver
	 * @return - Returns screen shot name and location
	 */
	public static String saveScreenShot(WebDriver driver,String screenShotName)
	{
		try
		{
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //String screenShotName = "Screenshot"+ getRandomNumber()+ ".png";
	        File targetFile=new File(ReportSetup.getImagesPath()+fileSeperator+screenShotName);
			//File targetFile = new File(ReportSetup.getImagesPath(), screenShotName);
			FileUtils.copyFile(screenshotFile,targetFile );
			//String path =  targetFile.getAbsolutePath();
			//Files.copy(screenshotFile.toPath(), targetFile.toPath());
	    	
			return ReportSetup.getImagesPath()+fileSeperator+screenShotName;		
	    }
	    catch(Exception e)
	    {
	       log.error("An exception occured while saving screenshot of current browser window.."+e.getCause());
	       e.printStackTrace();
	        return null;
	    }
	}
	
	public static String saveScreenShot(WebDriver driver)
	{
		try
		{
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String screenShotName = "Screenshot"+ getRandomNumber()+ ".png";
	        File targetFile=new File(ReportSetup.getImagesPath()+fileSeperator+screenShotName);
			//File targetFile = new File(ReportSetup.getImagesPath(), screenShotName);
			FileUtils.copyFile(screenshotFile,targetFile );
			//String path =  targetFile.getAbsolutePath();
			//Files.copy(screenshotFile.toPath(), targetFile.toPath());
	    	
			return ReportSetup.getImagesPath()+fileSeperator+screenShotName;		
	    }
	    catch(Exception e)
	    {
	       log.error("An exception occured while saving screenshot of current browser window.."+e.getCause());
	       e.printStackTrace();
	        return null;
	    }
	}
	
	/**
     * Purpose - to generate the random number which will be used while saving a screenshot
     * @return - returns a random number
     */
 	public static int getRandomNumber()
 	{
 		Random rand = new Random();
 		int numNoRange = rand.nextInt();
 		return numNoRange;
     }


}

