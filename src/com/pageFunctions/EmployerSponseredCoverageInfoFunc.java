package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.EmployerSponseredCoverageInfo;
import com.selenium.SafeActions;



public class EmployerSponseredCoverageInfoFunc extends SafeActions implements EmployerSponseredCoverageInfo {
	
	
public WebDriver driver;
	
	public EmployerSponseredCoverageInfoFunc(WebDriver d) {
	super(d);
	}
	
	
	
public void fillin() {
	
	waitUntilPresent(coverageoffer,10);
	selectFrame(curamUAIframe, 30);
		
		 safeClearAndType(coverageoffer, "yes", 30);
			pressTabKey_Action(coverageoffer, 10);
			safeClick(employee, 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);
		
	}

}
	
