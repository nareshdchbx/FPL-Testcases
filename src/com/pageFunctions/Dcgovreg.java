package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.DcGovRegPage;



public  class Dcgovreg extends com.selenium.SafeActions implements DcGovRegPage {
	
	public Dcgovreg(WebDriver d) {
		super(d);
		
	}

	public void click_createaccountpage()
	{
		
		
		safeClick(createaccountpage, 30);

	}

}
