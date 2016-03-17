package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.Assert;

import com.utilities.UtilityMethods;

public class SafeActions extends Sync{
	WebDriver driver;
	//Logger log =Logger.getLogger("SafeActions");
	public SafeActions(WebDriver driver){
		super(driver); 
		this.driver=driver;
	}
	public void pressTabKey_Action(By locator, int timeOut){

		try{
			if(waitUntilPresent(locator, timeOut))			{
			scrollIntoElementView(locator);
			WebElement element=driver.findElement(locator);
			new Actions(driver).moveToElement(element).sendKeys(Keys.TAB).build().perform();
			}
			else
			{			
				System.out.println("element not found");
			}
			}catch(Exception e){
				e.printStackTrace();
			}

	}
	/**
	 * Method - Safe Method for User Click, waits until the element is loaded and then performs a click action
	 * @param locator
	 * @param waitTime
	 */
	public void safeClick(By locator, int timeOut)	{
		try		{
			if(waitUntilClickable(locator, timeOut))			{
				scrollIntoElementView(locator);
				WebElement element = driver.findElement(locator);
				setHighlight(element);
				driver.findElement(locator).click();
				//log.info("Clicked on the element " + locator);
			}
			else{
				
				//log.error("Unable to click on the "+locator+" element "+UtilityMethods.getStackTrace());
				//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
				Assert.fail("Unable to click the "+locator+"element.");// Please click on above '"+screenshotName+"' link for more info.\n");
				
			}
		}
		catch(StaleElementReferenceException e)		{
			//log.error("Element with " + locator + " is not attached to the page document"+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element " + locator + " was not found in the Document."+UtilityMethods.getStackTrace());//+" Please click on above "+screenshotName+" link for more info.\n");
			
		}
		catch (NoSuchElementException e)		{
			//log.error("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element " + locator + " was not found."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");
			
		}
		catch(Exception e)		{
			//log.error("An unexpected exception occured."+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("An unexpected exception occured."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}
	
	public void safeMouseClick(By locator, int timeOut)
	{
		try
		{
			if(waitUntilClickable(locator, timeOut))			{
				scrollIntoElementView(locator);
				WebElement element = driver.findElement(locator);
				setHighlight(element);
				new Actions(driver).moveToElement(driver.findElement(locator)).click().build().perform();		
			}
			else
			{
				//log.error("Unable to perform Mouse click on the "+locator+" element ");	
				//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
				Assert.fail("Unable to perform Mouse click on the "+locator+" element"); //\nPlease click on above "+screenshotName+" link for more info.\n");	
				
			}
		}
		catch(StaleElementReferenceException e)		{
			//log.error("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch (NoSuchElementException e)		{
			//log.error("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch(Exception e)		{
			//log.error("An unexpected exception occured."+UtilityMethods.getStackTrace());			
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("An unexpected exception occured."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}
	
	/**
	 * 
	 * TODO JavaScript method for clicking on an element
	 *
	 * @param locator - locator value by which element is recognized
	 * @param waitTime - Time to wait for an element
	 * @return
	 * @throws Exception
	 */
	public void safeJavaScriptClick(By locator, int waitTime) throws Exception
	{
		try
		{
			if(waitUntilClickable(locator, waitTime))
			{
				//System.out.println("Clicking on element with " + locator+ " using java script click");
				//waitUntilClickable(locator,waitTime);
				scrollIntoElementView(locator);
				WebElement element = driver.findElement(locator);
				setHighlight(element);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locator));
			}
			else{
				//log.error("Unable to click on the "+locator+" element using Java Script ");	
				////String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
				Assert.fail("Unable to click on the "+locator+" element using Java Script");//  \nPlease click on above "+screenshotName+" link for more info.\n");	
				
			}
		}
		catch(StaleElementReferenceException e)		{
			//log.error("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch (NoSuchElementException e)		{
			//log.error("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch(Exception e)		{
			//log.error("An unexpected exception occured."+UtilityMethods.getStackTrace());			
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("An unexpected exception occured."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}
	
	/**
	 * Method - Safe Method for User Clear and Type, waits until the element is loaded and then enters some text
	 * @param locator
	 * @param sText
	 * @param waitTime
	 */
	public void safeClearAndType(By locator, String text, int timeOut)
	{
		try
		{
			//waitUntilElementVisible(locator,timeOut);
			if(waitUntilElementVisible(locator, timeOut))			{
				scrollIntoElementView(locator);
				setHighlight(driver.findElement(locator));
				driver.findElement(locator).clear();
				driver.findElement(locator).sendKeys(text);
			}
			else
			{			
				//log.error("Unable to clear and enter " + text + " in field "+UtilityMethods.getStackTrace());
				//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
				Assert.fail("Unable to clear and enter " + text + " in field "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
				
			}
		}
		catch(StaleElementReferenceException e)		{
			//log.error("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch (NoSuchElementException e)		{
			//log.error("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch(Exception e)		{
			///log.error("An unexpected exception occured."+UtilityMethods.getStackTrace());			
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("An unexpected exception occured."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}

	/**
	 * 
	 * TODO JavaScript method for entering a text in a field
	 *
	 * @param locator - locator value by which text field is recognized
	 * @param text - Text to be entered in a field
	 * @param waitTime - Time to wait for an element
	 * @return
	 * @throws Exception
	 */
	public void safeJavaScriptType(By locator,String text, int waitTime) throws Exception
	{
		try
		{
			if(waitUntilPresent(locator, waitTime))
			{
				scrollIntoElementView(locator);
				WebElement element = driver.findElement(locator);
				setHighlight(element);
				((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '"+text+"');",driver.findElement(locator));
			}
			else
			{
				//log.error("Unable to clear and enter " + text + " in field "+UtilityMethods.getStackTrace());
				//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
				Assert.fail("Unable to clear and enter " + text + " in field "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			}
		}
		catch(StaleElementReferenceException e)		{
			//log.error("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			//Assert.fail("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");
			
			
		}
		catch (NoSuchElementException e)		{
			//log.error("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch(Exception e)		{
			//log.error("An unexpected exception occured."+UtilityMethods.getStackTrace());			
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("An unexpected exception occured."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}
	

	/**
	 * 
	 * TODO scroll method to scroll the page down until expected element is visible	 *
	 * @param locator - locator value by which an element is located
	 * @param waitTime - Time to wait for an element
	 * @return - returns the text value from element
	 */
	public void scrollIntoElementView(By locator)
	{
		try
		{
			
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(locator));
		}
		catch(StaleElementReferenceException e)		{
			//log.error("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			//Assert.fail("Element with " + locator + " is not attached to the page document "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			scrollIntoElementView(locator);
		}
		catch (NoSuchElementException e)		{
			//log.error("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			//Assert.fail("Element " + locator + " was not found in DOM"+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch(Exception e)		{
			//log.error("An unexpected exception occured."+UtilityMethods.getStackTrace());			
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			//Assert.fail("An unexpected exception occured."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}
	
	
	/**
	@Method Highlights on current working element or locator
	@param Webdriver instance
	@param WebElement
	@return void (nothing)
	*/
	public void setHighlight(WebElement element)
	{
	        try 
	        {
	        	Thread.sleep(200);
	        	String attributevalue = "border:3px solid red;";
	  	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	  	        String getattrib = element.getAttribute("style");
	  	        executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, attributevalue);
				Thread.sleep(200);
				executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, getattrib);
			} 
	        catch (Exception e) 
			{		}
	        
		     
    }
	
	/**
	 * Method - Method for switching to frame using any locator of the frame
	 * @param driver
	 * @param ParentFrame
	 * @param ChildFrame
	 */
	public void selectFrame(By Framelocator, int waitTime)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, waitTime);			
			if(isElementPresent(Framelocator,waitTime))
			{    
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Framelocator));
			   // driver.switchTo().frame(driver.findElement(Framelocator));
			  //  log.info("Navigated to frame with locator " + Framelocator);	
			}
			else
			{
				//log.error("Unable to navigate to frame with locator " + Framelocator +UtilityMethods.getStackTrace());
				Assert.fail("Unable to switch to frame with locator " + Framelocator +UtilityMethods.getStackTrace());
			}
		}
		
		catch (NoSuchElementException e)		{
			//log.error("Unable to locate frame with "+Framelocator+" locator "+UtilityMethods.getStackTrace());	
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("Unable to locate frame with "+Framelocator+" locator "+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
		catch(Exception e)		{
			//log.error("An unexpected exception occured with "+Framelocator+" frame locator."+UtilityMethods.getStackTrace());			
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("An unexpected exception occured with "+Framelocator+" frame locator."+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");	
			
		}
	}
	
	/**
	 * Method - Method for switching back to webpage from frame
	 * @param driver
	 */
	public void defaultFrame()
	{
		try
		{
			driver.switchTo().defaultContent();
			//log.info("Navigated to back to webpage from frame");
		}
		catch(Exception e)
		{
			//log.error("unable to navigate back to main webpage from frame"+UtilityMethods.getStackTrace());
			//String screenshotName=ReportSetup.attachScreenshotLinkToReport(driver);
			Assert.fail("unable to navigate back to main webpage from frame"+UtilityMethods.getStackTrace());//+"\nPlease click on above "+screenshotName+" link for more info.\n");
		}
	}
	
	public void midWait(int waitInSec){
		try{
			Thread.sleep(waitInSec*1000);
		}catch(Exception e){
			
		}
	}


}
