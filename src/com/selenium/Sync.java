package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.Assert;
import com.utilities.UtilityMethods;


public class Sync {
	
	WebDriver driver=null;
	//private Logger log = Logger.getLogger("Sync");
	public Sync(WebDriver driver){
		this.driver=driver;
	}
	/**
	 * Method -  Waits for an element till the element is clickable
	 * @param driver (WebDriver) The driver object to be used to wait and find the element
	 * @param bylocator (By) locator object of the element to be found
	 * @param waitTime (int) The time in seconds to wait until returning a failure	 
	 * @return - True (Boolean) if element is located and is clickable within timeout period else false
	 * @throws Exception
	 */
	public boolean waitUntilClickable(By locator, int waitTime)
	{    	
		
		boolean bFlag = false;
    	nullifyImplicitWait();
		try
		{
			//log.info("Waiting until element " + locator+" is clickable");
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
			 
			if(driver.findElement(locator).isDisplayed())
			{
				bFlag = true;
				//log.info("Element " + locator + " is displayed and is clickable");
			}
		}
		
		catch (NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
		}
		catch (TimeoutException e)
		{
			//log.error("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " was not clickable"+UtilityMethods.getStackTrace());		
			//Assert.fail("Element " + locator + " was not clickable" +UtilityMethods.getStackTrace());
		}
		
		return bFlag;
	}
	
	public boolean waitUntilElementVisible(By locator, int waitTime)	{    	
		boolean bFlag=false;
		try		{
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			 
			if(driver.findElement(locator).isDisplayed())			{
				bFlag = true;
			}
		}
		
		catch (NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
		}
		catch (TimeoutException e)
		{
			//log.error("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " was not clickable"+UtilityMethods.getStackTrace());		
			//Assert.fail("Element " + locator + " was not clickable" +UtilityMethods.getStackTrace());
		}
		
		
		return bFlag;
	}
	
	public boolean waitUntilPresent(By locator, int waitTime)	{    	
		boolean bFlag=false;
		try		{
			
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			 
			if(driver.findElement((locator)).isDisplayed())			{
				bFlag = true;
			}
		}
		
		catch (NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
		}
		catch (TimeoutException e)
		{
			//log.error("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " was not clickable"+UtilityMethods.getStackTrace());		
			//Assert.fail("Element " + locator + " was not clickable" +UtilityMethods.getStackTrace());
		}
		
		
		return bFlag;
	}
	public boolean waitUntilEleDisappear(By locator, int waitTime)	{    	
		boolean bFlag=false;
		try		{
			
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			 
			if(driver.findElement((locator)).isDisplayed())			{
				bFlag = true;
			}
		}
		
		catch (NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
		}
		catch (TimeoutException e)
		{
			//log.error("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
			//Assert.fail("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " was not clickable"+UtilityMethods.getStackTrace());		
			//Assert.fail("Element " + locator + " was not clickable" +UtilityMethods.getStackTrace());
		}
		
		
		return bFlag;
	}
	
	
	public void nullifyImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	public boolean waitForPageToLoad(int timeOutInSeconds)
	{
		
		boolean isPageLoadComplete = false;
		nullifyImplicitWait(); 
		try
		{
			new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driverObject) {
			return (Boolean) ((String)((JavascriptExecutor)driver).executeScript("return document.readyState")).equals("complete");
			}
			});
			isPageLoadComplete = (Boolean) ((String)((JavascriptExecutor)driver).executeScript("return document.readyState")).equals("complete");
		}
		catch(Exception e)
	   	{
			isPageLoadComplete=false;
			e.printStackTrace();
			System.out.println();
	   	}
		
		waitForJQueryProcessing(60);
		
		return isPageLoadComplete;
	}
	public boolean waitForJQueryProcessing(int timeOutInSeconds)
	{
		long start = System.currentTimeMillis();
		boolean jQcondition = false;
		try 
		{
			Thread.sleep(500);
			new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<Boolean>() 
			{
				@Override
				public Boolean apply(WebDriver driverObject)
				{
					return (Boolean) ((JavascriptExecutor) driverObject).executeScript("return jQuery.active == 0");
				}
			});
			jQcondition = (Boolean) ((JavascriptExecutor) driver).executeScript("return window.jQuery != undefined && jQuery.active === 0");
			System.out.println(jQcondition);
			return jQcondition;
		} 
		catch (Exception e) 
		{
			
			//System.out.println("Page Loading is not completed"+ UtilityMethods.getStackTrace());
		}
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
			
		return jQcondition;
	}
	
	
	/**
	 * Waits for an element till the timeout expires
	 * @param driver (WebDriver) The driver object to be used to wait and find the element
	 * @param bylocator (By) locator object of the element to be found
	 * @param waitTime (int) The time in seconds to wait until returning a failure
	 * @return - True (Boolean) if element is located within timeout period else false
	 */
    public boolean isElementPresent(By locator, int waitTime)
	{   
    	    	
    	boolean bFlag = false;	
    	nullifyImplicitWait();
    	//log.info("Waiting for presence of element " + locator);
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 			
			if(driver.findElement(locator).isDisplayed()||driver.findElement(locator).isEnabled())
			{
				bFlag = true;
				//log.info("Element " + locator + " is displayed");
			}
		}		
		catch (NoSuchElementException e)
		{
			//log.info("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());			
		}
		catch (TimeoutException e)
		{
			//log.info("Element " + locator + " was not displayed in time - "+waitTime+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " is not displayed"+UtilityMethods.getStackTrace());
			Assert.fail("Element " + locator + " is not displayed"+UtilityMethods.getStackTrace());
		}
		
		return bFlag;
	}


}
