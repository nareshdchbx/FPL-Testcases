package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.addpeople;



public class addpeoplefunc extends com.selenium.SafeActions implements addpeople {
	
	public addpeoplefunc(WebDriver d) {
		super(d);
		
	}


	public  void no_morepeople(){
		waitUntilPresent(anymorepeople,10);
		selectFrame(curamUAIframe, 30);
	
safeClearAndType(anymorepeople, "no", 30);
safeMouseClick(nextbtn, 60);
defaultFrame();
waitForPageToLoad(60);


	}
	
	public  void yes_morepeople(){
		waitUntilPresent(anymorepeople,10);
		selectFrame(curamUAIframe, 30);
		
	safeClearAndType(anymorepeople, "yes", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
	
	}
}
