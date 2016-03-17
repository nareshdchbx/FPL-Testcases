package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.incomefromstatesystem;

public class incomefromstatesystemfunc extends com.selenium.SafeActions implements incomefromstatesystem {

	
	public incomefromstatesystemfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void click(){
		
		waitUntilPresent(addincm,10);
		selectFrame(curamUAIframe, 30);

		safeClearAndType(addincm, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	


}
