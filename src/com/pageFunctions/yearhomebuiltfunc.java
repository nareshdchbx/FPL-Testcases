package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.yearhomebuilt;

import com.selenium.SafeActions;

public class yearhomebuiltfunc extends SafeActions implements yearhomebuilt {

	
	public yearhomebuiltfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void opt(){
		waitUntilPresent(fourthopt,10);
		selectFrame(curamUAIframe, 60);
		safeMouseClick(fourthopt, 60);
		safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
		
	}
	
	
}
