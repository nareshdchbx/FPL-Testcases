package com.pageObjects;


import org.openqa.selenium.By;

public interface EmployerSponseredCoverageInfo {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	//public static By employmentenrolment = By.id("__o3id6");

	public static By coverageoffer = By.id("__o3id8");
	
	public static By employee = By.id("__o3id9");

}