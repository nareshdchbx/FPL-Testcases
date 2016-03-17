package com.pageObjects;

import org.openqa.selenium.By;

public interface appgroupmembersdetails {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	public static By firstname = By.id("__o3id6");
	
	public static By lastname = By.id("__o3id8");
	
	public static By dob = By.id("__o3id9");
	
	public static By gender = By.id("__o3ida");
	
	public static By personlivewithu = By.id("__o3idb");
	
   // public static By ishehomeless = By.xpath(".//div[@aria-label='Is this person homeless? Mandatory']/div[1]/input");
	
	public static By ishehomeless=By.id("__o3idc");
	
	public static By resiadd = By.id("__o3idd");
	
	public static By adrs = By.id("__o3idf");
	
	public static By cty = By.id("__o3id12");
	public static By stt = By.id("__o3id13");
	public static By zip = By.id("__o3id14");
	public static By outofdc = By.id("__o3id17");
	public static By outofdc1 = By.id("__o3id18");
	public static By eligibility = By.id("__o3id19");
	
	

}
