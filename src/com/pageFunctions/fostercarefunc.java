package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.selenium.SafeActions;

public class fostercarefunc extends SafeActions implements com.pageObjects.fostercare {
	
	
public WebDriver driver;
	
	public fostercarefunc(WebDriver d) {
		super(d);
	}

	public void fillin() throws InterruptedException{
		
		waitUntilPresent(student,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(student, "yes", 30);
		pressTabKey_Action(student, 10);
		safeClearAndType(studenttype, "Full Time", 30);
		safeClearAndType(schooltype, "Undergraduate", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	
	}
}