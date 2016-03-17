package com.pageObjects;

import org.openqa.selenium.By;

public interface dependencyontaxreturn {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	public static By dependency = By.xpath(".//input[@id='__o3id6']");
	
	public static By singledependency = By.xpath(".//input[@id='__o3id7']");
	
	public static By dependent = By.xpath(".//input[@id='__o3id8']");
	
	public static By taxclaimer=By.xpath(".//*[@for='__o3id7']");

	public static By taxclaimer1=By.xpath(".//*[@for='__o3id7_1']");
	
}
