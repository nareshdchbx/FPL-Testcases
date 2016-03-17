
package com.pageObjects;

import org.openqa.selenium.By;

public interface pregnancy {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	public static By preg = By.id("__o3ida");

	public static By children = By.id("__o3idb");
	
	public static By duedate = By.id("__o3idc");
	
}