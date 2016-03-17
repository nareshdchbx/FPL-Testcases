package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.taxfilestatus;

import com.selenium.SafeActions;

public class taxfilestatusfunc extends SafeActions implements taxfilestatus {

	
	public taxfilestatusfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void yes_filetaxes(){
		waitUntilPresent(filetaxes,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(filetaxes, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		midWait(2);
	}

public void no_filetaxes(){
	waitUntilPresent(filetaxes,10);
	selectFrame(curamUAIframe, 30);
		
		safeClearAndType(filetaxes, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		midWait(2);
	}
}
