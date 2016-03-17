package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.supportdocdetails;

import com.selenium.SafeActions;

public class supportdocdetailsfunc extends SafeActions implements supportdocdetails {


	public supportdocdetailsfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin(String alienno) {
		waitUntilPresent(sprtdoc,10);
		selectFrame(curamUAIframe, 30);
		safeClearAndType(sprtdoc, alienno, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	
	}
	
public void fillin1(String alienno1) {
	waitUntilPresent(sprtdoc,10);
	selectFrame(curamUAIframe, 30);
		safeClearAndType(sprtdoc, alienno1, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}

public void fillin2(String alienno2) {
	waitUntilPresent(sprtdoc,10);
	selectFrame(curamUAIframe, 30);
	
	safeClearAndType(sprtdoc, alienno2, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	

}
	
	
}
