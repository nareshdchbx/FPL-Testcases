package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.incomeadjustments;



public class incomeadjustmentsfunc extends com.selenium.SafeActions implements incomeadjustments  {

	
	public incomeadjustmentsfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin(){
		
		waitUntilPresent(adjustments,10);
		selectFrame(curamUAIframe, 30);
		safeClearAndType(adjustments, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
}
}
