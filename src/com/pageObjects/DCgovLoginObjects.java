package com.pageObjects;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
public interface DCgovLoginObjects 
{
	
	public static By username=By.id("userid");
	public static By password=By.id("pass");
	public static By lbutton=By.xpath("//*[@value='Login']"); 
	
	//public static By loginbutton1=By.class("padding-left:0;");

}
