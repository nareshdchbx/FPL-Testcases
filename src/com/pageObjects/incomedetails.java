package com.pageObjects;

import org.openqa.selenium.By;

public interface incomedetails {
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	
	public static By incometype = By.id("__o3id6");
	
	public static By taxtype = By.id("__o3id7");
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	//public static By incometype = By.xpath(".//div[@aria-label='Income Type Mandatory']/div[1]/input");
	
	//public static By income_salary = By.xpath(".//input[@id='__o3id6_popup1']");
	public static By employername = By.id("__o3id8");
	
	public static By street = By.id("__o3id9");
	
	public static By city = By.id("__o3idc");
	public static By state = By.id("__o3idd");
	public static By zip = By.id("__o3ide");
	
	public static By amount = By.id("__o3id10");
	
	public static By frquency = By.id("__o3id12");
	
	//public static By yearly_freq = By.xpath(".//input[@id='__o3idb_popup7']");
	
	public static By startdate = By.id("__o3id13");
	
	public static By enddate = By.id("__o3idd");
	
	public static By otherincome = By.id("__o3id15");

}
