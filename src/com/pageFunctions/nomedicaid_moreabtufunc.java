package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.nomedicaid_moreabtu;
import com.selenium.SafeActions;

public class nomedicaid_moreabtufunc extends SafeActions implements nomedicaid_moreabtu {


	public nomedicaid_moreabtufunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin(String ssn,String enrlmnt) throws InterruptedException{
		
		waitUntilPresent(ssnno,10);
		selectFrame(curamUAIframe, 60);
		safeClearAndType(ssnno, ssn, 30);
		safeClearAndType(enrollment, enrlmnt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	}
}
	
	
	
	
	
	