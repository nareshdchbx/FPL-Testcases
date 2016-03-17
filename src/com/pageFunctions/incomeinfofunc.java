package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.incomeinfo;



public class incomeinfofunc extends com.selenium.SafeActions implements incomeinfo {

	
	public incomeinfofunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void yes_income(){
		
		waitUntilPresent(incomeinfo,10);
		
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(incomeinfo, "yes", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
		
	}

public void no_income(){
	
	
	waitUntilPresent(incomeinfo,10);
	selectFrame(curamUAIframe, 30);
		
		safeClearAndType(incomeinfo, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);

	}


}


