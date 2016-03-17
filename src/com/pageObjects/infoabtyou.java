package com.pageObjects;

import org.openqa.selenium.By;

public interface infoabtyou {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	public static By firstname = By.xpath(".//input[@title='First Name Mandatory']");
	
	//public static By middlename = By.xpath(".//input[@title='Last Name Mandatory']");
	
	public static By lastname = By.xpath(".//input[@title='Last Name Mandatory']");
	
	public static By bdate = By.xpath(".//input[@title='Date of Birth Mandatory']");
	
	public static By gender = By.xpath(".//input[@title='Gender Mandatory']");
	
	//public static By ruhomeless = By.xpath(".//input[@title='Are you homeless? Mandatory']");
	
	//public static By ruhomeless = By.xpath(".//div[@aria-label='Are you homeless? Mandatory']/div[1]/input");
	
	public static By ruhomeless=By.id("__o3idb");
//	
	
	public static By addressline1 = By.xpath(".//input[@id = '__o3idc']");
	
	//public static By addressline2 = By.id("__o3ide");
	
	public static By city = By.xpath(".//input[@id ='__o3idf']");
	
	public static By state = By.xpath(".//input[@id='__o3id10']");
	
	//public static By apt = By.id("__o3idd");
   public static By zipcode1 = By.xpath(".//input[@id='__o3id11']");
	
	//public static By zipcode2 = By.id("__o3id12");
	
	//public static By rudcresident = By.id("__o3id13");
	
	public static By tempabsentfrmstate = By.id("__o3id14");
   
   public static By mailaddrs=By.xpath(".//*[@id='__o3id15']");
	
//	public static By mailingaddrs = By.xpath(".//div[@aria-label='Is the mailing address the same as your home address? Mandatory']/div[1]/input");
//	
//	public static By yes_mailaddrs=By.id("__o3id15_popup2");
	
//	public static By diffaddrsline1 = By.id("__o3id17");
//	
//	public static By diffaddrsline2 = By.id("__o3id18");
//	
//	public static By diffapt = By.id("__o3id19");
//	
//	public static By diffstate = By.id("__o3id1b");
//	
//	public static By diffcity = By.id("__o3id1a");
//	
//	public static By diffzipcode1 = By.id("__o3id1c");
//	
//	public static By diffzipcode2 = By.id("__o3id1d");
//	
//	public static By contmethd = By.id("__o3id1e");
//	
//	public static By electronicnotification = By.id("__o3id1f");
//	
//	public static By papercomm = By.id("__o3id20");
//	
//	public static By langcomm = By.id("__o3id21");
//	
//	public static By phno1 = By.id("__o3id22");
//	
//	public static By phno2 = By.id("__o3id23");
//	
//	public static By phno3 = By.id("__o3id24");
//	
//	public static By phnotyp = By.id("__o3id25");
//	
//	public static By altphno1 = By.id("__o3id26");
//	
//	public static By altphno2 = By.id("__o3id27");
//	
//	public static By altphno3 = By.id("__o3id28");
//	
//	public static By altphnotyp = By.id("__o3id29");
//	
//	public static By email = By.id("__o3id2a");
	
//	public static By eligibility4coverage = By.xpath(".//div[@aria-label='Do you want to find out if you can get Medicaid or help paying for health coverage? Mandatory']/div[1]/input");
//	
//	public static By yes_eligibility=By.id("__o3id2c_popup2");

   public static By eligibility4coverage = By.id("__o3id2c");
	
	

	
}
