package com.businessutilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




//import java.nio.file.Files;


public class Butility {
	
	private static String fileSeperator = System.getProperty("file.separator");
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
          FileUtils.copyFile(scrFile, new File("C:\\Users\\Chinna\\Downloads\\uat13.png"));	
		
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
	
	public static void saveScreenShot(WebDriver driver)
	{
		try
		{
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String screenShotName = "Screenshot"+ getRandomNumber()+ ".png";
	        File targetFile=new File("./Screenshots"+fileSeperator+screenShotName);
			FileUtils.copyFile(screenshotFile,targetFile );
		
	    }
	    catch(Exception e)
	    {
	       System.out.println("An exception occured while saving screenshot of current browser window.."+e.getCause());
	       e.printStackTrace();
	        
	    }
	}
	/**
	 * 
	 * TODO scroll method to scroll the page down until expected element is visible	 *
	 * @param locator - locator value by which an element is located
	 * @param waitTime - Time to wait for an element
	 * @return - returns the text value from element
	 */
	public static void scrollIntoElementView(WebDriver driver,By locator)
	{
		try
		{
			
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(locator));
		}
		catch(StaleElementReferenceException e)		{
			e.printStackTrace();
		}
		catch (NoSuchElementException e)		{
			e.printStackTrace();
		}
		catch(Exception e)		{
			e.printStackTrace();
		}
	}
	
	


}
