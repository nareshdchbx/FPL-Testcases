package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.streetresidence;

import com.selenium.SafeActions;

public class streetresifunc extends SafeActions implements streetresidence{

	public streetresifunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
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
