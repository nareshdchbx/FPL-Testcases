package com.pageObjects;

import org.openqa.selenium.By;

public interface infoabtprimeapplicant {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
   public static By firstname = By.xpath(".//input[@title='First Name Mandatory']");
	
	//public static By middlename = By.xpath(".//input[@title='Last Name Mandatory']");
	
	public static By lastname = By.xpath(".//input[@title='Last Name Mandatory']");
	
	public static By dob = By.xpath(".//input[@title='Date of Birth Mandatory']");
	
	public static By gender = By.xpath(".//input[@title='Gender Mandatory']");
	
	public static By liveswith = By.id("__o3idb");

}
