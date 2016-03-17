package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.incomedetails;




public class incmpgfunc extends com.selenium.SafeActions implements incomedetails {
	
	
	
	public incmpgfunc(WebDriver d) {
		super(d);
	
	}

	public void click(){
		waitUntilPresent(otherincome,10);
		selectFrame(curamUAIframe, 30);
		safeClearAndType(otherincome, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	


}
