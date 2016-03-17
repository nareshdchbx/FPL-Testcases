package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.brokerdetails;

import com.selenium.SafeActions;

public class brokerdetailsfunc extends SafeActions implements brokerdetails {
	

	public brokerdetailsfunc(WebDriver d) {
		super(d);
		
	}

	public void opt(){
		waitUntilPresent(submission,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(submission, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
}
}
