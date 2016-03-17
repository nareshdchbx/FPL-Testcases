package com.utilities;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MySimpleFormatter extends Formatter {
	public MySimpleFormatter(){	     }
	private DateFormat dateFormat;
	static final String lineSep = System.getProperty("line.separator");
	public String format(LogRecord record){
		StringBuffer buf = new StringBuffer(180);
		 
	     if (dateFormat == null)
	       dateFormat = DateFormat.getDateTimeInstance();
	 
	     buf.append(dateFormat.format(new Date(record.getMillis())));
	     buf.append(' ');
	     buf.append(record.getSourceClassName());
	     //buf.append(lineSep);
	 
	     //buf.append(record.getLevel());
	     buf.append(": ");
	     buf.append(formatMessage(record));
	 
	     buf.append(lineSep);
	 
	     Throwable throwable = record.getThrown();
	     if (throwable != null)
	       {
	        StringWriter sink = new StringWriter();
	         throwable.printStackTrace(new PrintWriter(sink, true));
	         buf.append(sink.toString());
	        }
	  
	     return buf.toString();
		
	}

}

