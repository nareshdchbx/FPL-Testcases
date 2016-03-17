package com.pageObjects;

import org.openqa.selenium.By;

public interface moreabtu {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
//	public static By ruamericanindian = By.xpath(".//div[@aria-label='Are you an American Indian/Alaska Native? Mandatory']/div[1]/input");
//	
//	public static By no_americanindian = By.xpath(".//div[@id='__o3id6_popup1']");
//   
//	public static By yes_americanindian = By.xpath(".//div[@id='__o3id6_popup2']");
	
//	public static By havessn = By.xpath(".//div[@aria-label='Do you have an SSN? Mandatory']/div[1]/input");
//	
//	public static By yes_ssn = By.xpath(".//div[@id='__o3id17_popup2']");
	
	public static By ruamericanindian = By.id("__o3id6");
	
	public static By havessn = By.xpath(".//input[@id='__o3id17']");
	
	public static By ssnno = By.id("__o3id18");
	
	
	//public static By appliedssn = By.id("__o3id19");
	
//	public static By citizen = By.xpath(".//div[@aria-label='Are you a US Citizen or US National? Mandatory']/div[1]/input");
//	
//	public static By yes_citizen = By.xpath(".//div[@id='__o3id1b_popup2']");
	
     public static By citizen = By.id("__o3id1b");
  
   public static By naturalcitizen = By.id("__o3id1c");
//	
   //public static By no_naturalcitizen = By.xpath(".//div[@id='__o3id1c_popup1']");
	
	//public static By ssnno = By.id("__o3id18");
	
         public static By immigrationstatus = By.id("__o3id1d");
	
	   public static By supportdoc = By.id("__o3id20");
	   
	   public static By livedinus = By.id("__o3id21");
	   
	   public static By military = By.id("__o3id22");
	   
	   public static By dependentveteran = By.id("__o3id23");
	
//	public static By enrollment = By.xpath(".//*[@id='widget___o3id24']/div[2]/div[1]/div[1]/input");
//	
//	public static By yes_enrollment = By.xpath(".//*[@id='__o3id24_popup2']");
//	
	public static By enrollment = By.id("__o3id24");
	
	}

