/*************************************** PURPOSE **********************************

 - This class contains all Generic methods which are not related to specific application
*/


package com.utilities;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

import javax.swing.JOptionPane;

import com.testng.Assert;


public class UtilityMethods 
{

	static Thread thread;

	/**
	 * Purpose - to get the system name
	 * @return - String (returns system name)
	 */
    public static String machineName()
    {
    	String sComputername = null;
    	try 
    	{
			sComputername=InetAddress.getLocalHost().getHostName();
		} 
    	catch (UnknownHostException e) 
    	{
			//log.error("Unable to get the hostname..."+ e.getCause());
		}
		return sComputername;
    }
    
    /**
     * TODO To get the entire exception stack trace
     * 
     * @return returns the stack trace
     */
    public static String getStackTrace()
    {
		String trace = "";
		int i;
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		for(i=2;i<stackTrace.length;i++)
		{
			trace = trace+"\n"+stackTrace[i];
		}
		return trace;
    }

    

    /**
     * Purpose - to get current date and time
     * @return - String (returns date and time)
     */
    public static String getCurrentDateTime()
    {
    	Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
        String dateNow = formatter.format(currentDate.getTime());
        return dateNow;    	
    }
    
    /**
	 * Purpose - To convert given time in "yyyy-MM-dd-HH:mm:ss" to IST time
	 * @returns date in String format 
	 * @throws Exception
	 */
	
    public static String convertToISTTime(String origTime) 
	{

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        TimeZone obj = TimeZone.getTimeZone("GMT");
        formatter.setTimeZone(obj);
        try 
        {
			Date date = formatter.parse(origTime);
			formatter = new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
			//System.out.println(date);
			return formatter.format(date);
		} catch (ParseException e) {
			//log.error("Cannot parse given date .." + origTime);
			//log.info("returning current date and time .." + origTime);
		}
		return getCurrentDateTime();
    }    

    /**
     * Purpose - to display message box
     * @param infoMessage
     * @param location
     */
    public static void infoBox(String infoMessage, String location)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + location, JOptionPane.INFORMATION_MESSAGE);
    }

    
    /**
     * Purpose - to stop the execution
     * @param suspendRunImagePath
     * @throws Exception
     */
    public static void suspendRun(String suspendRunImagePath) throws Exception
    {
    	Assert.fail("TEST RUN HAS BEEN SUSPENDED");
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
 	
 	/**
	 * 
	 * TODO method to verify if the balloon pop process/method is ended or not.
	 */
	public static void verifyPopUp()
	{
		try 
		{
			thread.join();
		} catch (InterruptedException e) {
			//log.error("balloon popup thread Interrupted"+e.getStackTrace());
		} 
	}

	
	/**
	 * 
	 * TODO Gives the name of operating system your are currently working on
	 * 
	 * @return returns the OS name
	 */
	public static String getOSName()
	{
		return System.getProperty("os.name");
	
	}	
	
	
	
}
