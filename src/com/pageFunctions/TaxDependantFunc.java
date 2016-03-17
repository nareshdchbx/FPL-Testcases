package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.TaxDependant;

import com.selenium.SafeActions;

public class TaxDependantFunc extends SafeActions implements TaxDependant {

	public TaxDependantFunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin(){
		waitUntilPresent(accom,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(accom, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
		
	}
	
public void fillin1(){
	waitUntilPresent(accom,10);	
	selectFrame(curamUAIframe, 30);
		safeClearAndType(accom, "no", 30);
		pressTabKey_Action(accom, 10);
		safeClearAndType(accom1, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}


}
