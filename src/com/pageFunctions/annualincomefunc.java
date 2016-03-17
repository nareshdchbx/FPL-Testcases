package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.annualincome;
import com.selenium.SafeActions;


public class annualincomefunc extends SafeActions implements annualincome {
	

	public annualincomefunc(WebDriver d) {
		super(d);
		
	}

	public void fillin(){
		waitUntilPresent(income,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(income, "yes", 30);
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
	
	}
}


