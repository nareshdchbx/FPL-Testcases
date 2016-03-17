package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.moreabtu;

import com.selenium.SafeActions;

public class refugeemoreabtufunc extends SafeActions implements moreabtu {


	public refugeemoreabtufunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin(String ssn,String enrlmnt,String ctzn) throws InterruptedException{
	
		waitUntilPresent(havessn,10);
		selectFrame(curamUAIframe, 60);
		safeClearAndType(havessn, "yes", 30);
		pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssnno, ssn, 30);
		pressTabKey_Action(ssnno, 10);
		
		safeClearAndType(citizen, ctzn, 30);
		pressTabKey_Action(citizen, 10);
		
		safeClearAndType(immigrationstatus, "yes", 30);
		pressTabKey_Action(immigrationstatus, 10);
		
		safeClearAndType(supportdoc, "I-571 (Refugee Travel Document)", 30);
		pressTabKey_Action(supportdoc, 10);
		
		safeClearAndType(livedinus, "yes", 30);
		pressTabKey_Action(livedinus, 10);
		
		safeClearAndType(military, "no", 30);
		pressTabKey_Action(military, 10);
		
		safeClearAndType(dependentveteran, "no", 30);
		pressTabKey_Action(dependentveteran, 10);
		
		safeClearAndType(enrollment,enrlmnt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
public void fillin1(String ssn1,String enrlmnt1,String ctzn1) throws InterruptedException{
	waitUntilPresent(havessn,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(havessn, "yes", 30);
	pressTabKey_Action(havessn, 10);
	
	safeClearAndType(ssnno, ssn1, 30);
	pressTabKey_Action(ssnno, 10);
	
	safeClearAndType(citizen, ctzn1, 30);
	pressTabKey_Action(citizen, 10);
	
	safeClearAndType(immigrationstatus, "yes", 30);
	pressTabKey_Action(immigrationstatus, 10);
	
	safeClearAndType(supportdoc, "I-571 (Refugee Travel Document)", 30);
	pressTabKey_Action(supportdoc, 10);
	
	safeClearAndType(livedinus, "yes", 30);
	pressTabKey_Action(livedinus, 10);
	
	safeClearAndType(military, "no", 30);
	pressTabKey_Action(military, 10);
	
	safeClearAndType(dependentveteran, "no", 30);
	pressTabKey_Action(dependentveteran, 10);
	
	safeClearAndType(enrollment,enrlmnt1, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
		
	}

public void fillin2(String ssn2,String enrlmnt2,String ctzn2) throws InterruptedException{
	waitUntilPresent(havessn,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(havessn, "yes", 30);
	pressTabKey_Action(havessn, 10);
	
	safeClearAndType(ssnno, ssn2, 30);
	pressTabKey_Action(ssnno, 10);
	
	safeClearAndType(citizen, ctzn2, 30);
	pressTabKey_Action(citizen, 10);
	
	safeClearAndType(immigrationstatus, "yes", 30);
	pressTabKey_Action(immigrationstatus, 10);
	
	safeClearAndType(supportdoc, "I-571 (Refugee Travel Document)", 30);
	pressTabKey_Action(supportdoc, 10);
	
	safeClearAndType(livedinus, "yes", 30);
	pressTabKey_Action(livedinus, 10);
	
	safeClearAndType(military, "no", 30);
	pressTabKey_Action(military, 10);
	
	safeClearAndType(dependentveteran, "no", 30);
	pressTabKey_Action(dependentveteran, 10);
	
	safeClearAndType(enrollment,enrlmnt2, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}
	
}

	
	

