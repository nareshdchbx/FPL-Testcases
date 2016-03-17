package com.pageFunctions;



import org.openqa.selenium.WebDriver;

import com.pageObjects.moreabtu;
import com.selenium.SafeActions;

public class moreabtufunc extends SafeActions implements moreabtu {

	public moreabtufunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin(String ssn,String enrlmnt) throws InterruptedException{

		waitUntilPresent(havessn,10);
		selectFrame(curamUAIframe, 60);
		
		safeClearAndType(havessn, "yes", 60);
		pressTabKey_Action(havessn, 10);
		safeClearAndType(ssnno, ssn, 60);
		safeClearAndType(citizen, "yes", 60);
		pressTabKey_Action(citizen, 10);
		safeClearAndType(naturalcitizen, "no", 60);
		safeClearAndType(enrollment, enrlmnt, 60);
		safeClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
	}
	
	public void fillin1(String ssn,String enrlmnt) throws InterruptedException{

		waitUntilPresent(ruamericanindian,10);
		
		selectFrame(curamUAIframe, 60);
		
		safeClearAndType(ruamericanindian, "YES", 60);
		safeClearAndType(havessn, "yes", 60);
		pressTabKey_Action(havessn, 10);
		safeClearAndType(ssnno, ssn, 60);
		safeClearAndType(citizen, "yes", 60);
		pressTabKey_Action(citizen, 10);
		safeClearAndType(naturalcitizen, "no", 60);
		safeClearAndType(enrollment, enrlmnt, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	}
	
}
