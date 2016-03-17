package com.pageObjects;

import org.openqa.selenium.By;

public interface moreabtuadddetails {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	//public static By fostercare = By.id("__o3id6");
	
	//public static By pregnancy = By.id("__o3ida");
	
	public static By pregnancy = By.xpath(".//div[@aria-label='Are you currently pregnant or have you been pregnant in the last 60 days? Mandatory']/div[1]/input");

	public static By yes_pregnancy = By.xpath(".//div[@id='__o3idb_popup2']");


	
	public static By noofchildren = By.id("__o3idc");
	
	public static By duedate = By.id("__o3idd");
	
}
