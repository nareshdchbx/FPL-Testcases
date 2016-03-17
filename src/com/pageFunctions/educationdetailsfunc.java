package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.educationdetails;



public class educationdetailsfunc extends com.selenium.SafeActions implements educationdetails {

	
	public educationdetailsfunc(WebDriver d) {
		super(d);
		
	}

	public void opt(){
		waitUntilPresent(fifthopt,10);
		selectFrame(curamUAIframe, 30);
		
		safeMouseClick(fifthopt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	

}
