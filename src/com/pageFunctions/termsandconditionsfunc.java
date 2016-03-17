package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.termsconditions;

import com.selenium.SafeActions;;

public class termsandconditionsfunc extends SafeActions  implements termsconditions {
	
	public WebDriver driver;
	
	public termsandconditionsfunc(WebDriver d){
		super(d);
		this.driver=d;
	}

	public void click() throws Exception{
	
		waitUntilPresent(IAgree,10);
		selectFrame(curamUAIframe, 30);
		
		safeMouseClick(IAgree, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}

}
