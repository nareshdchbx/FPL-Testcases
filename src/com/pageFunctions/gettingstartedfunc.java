package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.gettingStarted;




public class gettingstartedfunc extends com.selenium.SafeActions implements gettingStarted {

	

	public gettingstartedfunc(WebDriver d) {
		super(d);
		
	}

	public void click(){
		waitUntilPresent(Formyselfandormyfamily,10);
		selectFrame(curamUAIframe, 30);
		safeMouseClick(Formyselfandormyfamily, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
}
