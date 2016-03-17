package com.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.TimeZone;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerClass  {
	
	public static java.util.logging.Logger logger = null;
	static SimpleFormatter formatterTxt;
	static FileHandler fileTxt;
	
	private LoggerClass(){	}
	
	public static Logger getLogInstance() {
		try{
		if(logger==null)
			return getLog();
		else
			return logger;
		}catch(Exception e){
			e.printStackTrace();
		}
		return logger;
	}
	
	public static Logger getLog() throws SecurityException, IOException{
		
		logger=Logger.getLogger(LoggerClass.class.getName());
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new MySimpleFormatter());
        logger.addHandler(handler);
		renameExistingLog("./Logging.log");
		fileTxt = new FileHandler("./Logging.log",true);
		fileTxt.setFormatter(new MySimpleFormatter());
		logger.addHandler(fileTxt);
	 return logger;
	
}

public static void renameExistingLog(String filePath)
{
	try 
	{
		File latestResults = new File(filePath);
      	if(latestResults.exists())
      	{
      		Path p = Paths.get(filePath);
		    BasicFileAttributes view;
			view = Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
		    String fCreationTime = String.valueOf(view.lastModifiedTime());
		    String istTime = convertToISTTime(fCreationTime.split("\\.")[0].replace("T","-"));
      		String oldLog = "./Logging_" + istTime.replace(":", "_at_")+".log";
      		File oldResults = new File(oldLog);
      		latestResults.renameTo(oldResults);
      		latestResults.delete();
      		
      	}
      	
	} 
	catch (IOException e) 
	{
		//logerror("Exception occured while creating 'Latest Results' directory or unable to rename current 'Latest Results' directory "+e.getCause());
		System.out.println("Exception occured while creating 'Latest Results' directory or unable to rename current 'Latest Results' directory "+e.getCause());
	}
}
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
			//System.out.println("Cannot parse given date .." + origTime);
			//log.info("returning current date and time .." + origTime);
		}
		return getCurrentDateTime();
    }
 public static String getCurrentDateTime()
    {
    	Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
        String dateNow = formatter.format(currentDate.getTime());
        return dateNow;    	
    }


}
