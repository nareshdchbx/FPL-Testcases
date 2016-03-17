package com.pageFunctions;



import org.openqa.selenium.WebDriver;

import com.pageObjects.infoabtyou;


import com.selenium.SafeActions;


public class infoabtufunc extends SafeActions implements infoabtyou{
	
	
	public infoabtufunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}


	public void fillin (String Fname, String Lname,String dob,String sex,  String addrl1,  String ct,  String st, 
			String zip1,String elig){
		waitUntilPresent(firstname,10);
			selectFrame(curamUAIframe, 60);
			safeClearAndType(firstname, Fname, 60);
			safeClearAndType(lastname, Lname, 60);
			safeClearAndType(bdate, dob, 60);
			safeClearAndType(gender, sex, 60);
			safeClearAndType(ruhomeless, "no", 60);
			pressTabKey_Action(ruhomeless,60);
			safeClearAndType(addressline1, addrl1, 60);	
		    safeClearAndType(city, ct, 60);
		    safeClearAndType(state, st, 60);
			safeClearAndType(zipcode1, zip1, 60);
			safeClearAndType(mailaddrs, "yes", 60);	
			safeClearAndType(eligibility4coverage, elig, 60);
			pressTabKey_Action(eligibility4coverage,60);
			safeClick(nextbtn, 60);
			
			defaultFrame();
			waitForPageToLoad(60);
		
	}

	
	public void fillin1 (String fname, String lname,String db,String gndr,  String addrl1,  String ct,  String st, 
			String zip1,String elig){
		waitUntilPresent(firstname,10);
		selectFrame(curamUAIframe, 60);
		
		safeClearAndType(firstname, fname, 60);

		
		safeClearAndType(lastname, lname, 60);
		
		
		safeClearAndType(bdate, db, 60);

		safeClearAndType(gender, gndr, 60);
		
		safeClearAndType(ruhomeless, "no", 60);
		
		pressTabKey_Action(ruhomeless,60);
		safeClearAndType(addressline1, addrl1, 10);
		
       safeClearAndType(city, ct, 60);
		
		safeClearAndType(state, st, 60);
		safeClearAndType(zipcode1, zip1, 60);
		safeClearAndType(tempabsentfrmstate, "yes", 60);
		safeClearAndType(mailaddrs, "yes", 60);
		
		safeClearAndType(eligibility4coverage, elig, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}
		
	}


