package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.moreabtuadddetails;

import com.selenium.SafeActions;

public class moreabtudetailsfunc extends SafeActions implements moreabtuadddetails {

		
		public moreabtudetailsfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

		public void select(){
			waitUntilPresent(pregnancy,10);
			selectFrame(curamUAIframe, 60);
		safeClick(pregnancy, 30);
		safeClick(yes_pregnancy, 30);
		safeClearAndType(noofchildren, "1", 30);
		safeClearAndType(duedate, "12/09/2016", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
		}
}
