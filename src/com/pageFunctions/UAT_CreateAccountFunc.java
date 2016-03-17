package com.pageFunctions;



import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import com.pageObjects.UAT_CreateAccount;
import com.selenium.SafeActions;

public class UAT_CreateAccountFunc extends SafeActions implements UAT_CreateAccount  {
	Logger log =Logger.getLogger("UAT_CreateAccountFunc");
public WebDriver driver;
	
	public UAT_CreateAccountFunc(WebDriver d) {
		super(d);
	}
	
	public void CreateAccount(String uname,String pswd,String Fname, String Lname, String dob, String ssn,String sex) throws Exception{
		
	log.info("::Email ID-"+uname+"\n Password: "+pswd);
		
	waitUntilPresent(createacc,10);
	
	safeClick(createacc, 30);
	
	safeClick(individualandfamily, 30);
	safeClick(yes_assistance, 30);
	safeClick(continuebtn, 30);
	
	safeClearAndType(email, uname, 30);
	safeClearAndType(pwd, pswd, 30);
	safeClearAndType(confirmpswd, pswd, 30);
	safeClick(crtaccount, 30);
	
	safeClearAndType(fstname, Fname, 30);
	safeClearAndType(lstname, Lname, 30);
	safeClearAndType(bdate, dob, 30);
	safeClearAndType(social, ssn, 30);
	
		String gender;// = ExcelUtilities.getCellData(1,7);
		gender=sex.trim().toLowerCase();
		System.out.println(gender);
		
		if (gender.equals("male")){
			
		
			safeClick(male, 30);
		
	}
	
	else{
		
		safeClick(female, 30);
	}
		
		safeClick(cntn, 30);
		
		waitUntilPresent(contnu,10);
		
		safeClick(contnu, 30);
		
		
		
}
	
	public void CreateAccount1(String uname,String pswd,String Fname, String Lname, String dob,String sex) throws Exception{
		
		log.info("::Email ID-"+uname+"\n Password: "+pswd);
			
		waitUntilPresent(createacc,10);
		
		safeClick(createacc, 30);
		
		safeClick(individualandfamily, 30);
		safeClick(yes_assistance, 30);
		safeClick(continuebtn, 30);
		
		safeClearAndType(email, uname, 30);
		safeClearAndType(pwd, pswd, 30);
		safeClearAndType(confirmpswd, pswd, 30);
		safeClick(crtaccount, 30);
		
		safeClearAndType(fstname, Fname, 30);
		safeClearAndType(lstname, Lname, 30);
		safeClearAndType(bdate, dob, 30);
		safeClick(no_ssn, 30);
		
			String gender;
			gender=sex.trim().toLowerCase();
			System.out.println(gender);
			
			if (gender.equals("male")){
				
			
				safeClick(male, 30);
			
		}
		
		else{
			
			safeClick(female, 30);
		}
			
			safeClick(cntn, 30);
			waitUntilPresent(contnu,10);
			safeClick(contnu, 30);
			
			
			
	}

	
public void createAccount(String[] emailaddrs,String[] pswd) throws InterruptedException{
	
	int numOfActs=emailaddrs.length;
	int numOfpswds=pswd.length;
	if(numOfActs==numOfpswds){
		for(int i=0;i<numOfActs;i++){		
			driver.findElement(createacc).click();
			
			Thread.sleep(8000);
			
			driver.findElement(individualandfamily).click();
			Thread.sleep(8000);
			
			driver.findElement(yes_assistance).click();
			
			driver.findElement(continuebtn).click();
				
			driver.findElement(email).sendKeys(emailaddrs[i]);
			
			driver.findElement(pwd).sendKeys(pswd[i]);
			
			driver.findElement(confirmpswd).sendKeys("Abcd@1234");
			
			driver.findElement(crtaccount).click();
		}
	}else{
		System.out.println("Email addresses acount passwords count mismatched");
	}
}
	
	public void login(){
	
		driver.findElement(login).click();
	}
	
	
}


