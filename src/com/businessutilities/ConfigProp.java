package com.businessutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProp {

	

public static String getprop(String s1) throws FileNotFoundException
{
	
File file=new File("C:\\Users\\Saketh\\Desktop\\abcd.properties");

FileInputStream fis = new FileInputStream(file);

Properties prop = new Properties();

try {
	prop.load(fis);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

String s2=prop.getProperty(s1);

return s2;
}

}
