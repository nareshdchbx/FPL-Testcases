package com.pageObjects;

import org.openqa.selenium.By;

public interface UAT_CreateAccount {
	
	public static By terms = By.linkText("I ACCEPT THE TERMS");
	
	public static By createacc = By.linkText("Create Account");
	
	public static By login = By.linkText("Login");
	
	
	public static By individualandfamily = By.xpath("//input[@id='individual-family']/../a/img[contains(@src,'radio-off.png')]");
			
	
	public static By yes_assistance = By.xpath("(//input[@id='assisted']/../a/img[contains(@src,'radio-off.png')])[1]");
	
	public static By no_assistance = By.xpath("(//input[@id='assisted']/../a/img[contains(@src,'radio-off.png')])[2]");
	
	public static By continuebtn = By.xpath("//input[@id='choose-account']");
	
	public static By email = By.xpath("//input[@id='user_email']");

	public static By pwd = By.xpath("//input[@id='user_password']");
	
	public static By confirmpswd = By.xpath("//input[@id='user_password_confirmation']");
	
	public static By crtaccount = By.xpath("//input[@value='Create account']");
	
	public static By fstname = By.xpath("//input[@id='person_first_name']");
	
	public static By lstname = By.xpath("//input[@id='person_last_name']");
	
	public static By bdate = By.xpath("//input[@id='jq_datepicker_ignore_person_dob']");
	
	public static By social = By.xpath("//input[@id='person_ssn']");
	
	public static By no_ssn = By.xpath("//input[@id='person_no_ssn']");
	
	public static By male = By.xpath("//*[@id='personal_info']/div[2]/div[4]/div/label");
	
	public static By female = By.xpath("//*[@id='personal_info']/div[2]/div[5]/div/label");
	
	public static By cntn = By.xpath("//button[contains(text(),'CONTINUE')]");
	
	public static By contnu = By.xpath("//a[contains(text(),'Continue')]");
	
	//public static By ContinueasanIndividual = By.linkText("Continue as an Individual");
	
}
