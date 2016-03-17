package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.submitapp;

import com.selenium.SafeActions;


public class submitappfunc extends SafeActions  implements submitapp {

	public submitappfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin_app(String fnname,String lnname)
	{
		waitUntilPresent(IAgree1,10);
		selectFrame(curamUAIframe, 30);
		
		safeMouseClick(IAgree1, 30);
		safeMouseClick(IAgree2, 30);
		safeMouseClick(renewal2, 30);
		safeMouseClick(IAgree3, 30);
		safeMouseClick(IAgree4, 30);
		safeMouseClick(IAgree5, 30);
		safeClearAndType(firstname, fnname, 30);
		safeClearAndType(lastname, lnname, 30);
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
		
	}
	

}
