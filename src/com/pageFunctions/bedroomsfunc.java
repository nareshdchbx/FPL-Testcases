package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.bedrooms;

import com.selenium.SafeActions;

public class bedroomsfunc extends SafeActions implements bedrooms {
	

	
	public bedroomsfunc(WebDriver d) {
		super(d);
		
	}

	public void opt(){
		waitUntilPresent(fourthopt,10);
		selectFrame(curamUAIframe, 30);
		safeMouseClick(fourthopt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	

}
