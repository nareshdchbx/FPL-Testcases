package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.othermembersinapp;

import com.selenium.SafeActions;



public class othermembersinappfunc extends SafeActions implements othermembersinapp {

	
	public othermembersinappfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	public void fillin(String newmem){
		
		waitUntilPresent(othersinapp,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(othersinapp, newmem, 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
	
	}
public void fillin1(String newmem1){
	waitUntilPresent(othersinapp,10);	
	selectFrame(curamUAIframe, 60);
		safeClearAndType(othersinapp, newmem1, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
public void fillin2(String newmem2){
	waitUntilPresent(othersinapp,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(othersinapp, newmem2, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

}

}
