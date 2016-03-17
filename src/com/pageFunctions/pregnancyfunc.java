
package com.pageFunctions;



import org.openqa.selenium.WebDriver;

import com.pageObjects.pregnancy;

import com.selenium.SafeActions;

public class pregnancyfunc extends SafeActions implements pregnancy {

	public pregnancyfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void fillin() throws InterruptedException{
		waitUntilPresent(preg,10);
		selectFrame(curamUAIframe, 60);
		safeClearAndType(preg, "yes", 30);
		pressTabKey_Action(preg, 10);
		safeClearAndType(children, "1", 30);
		safeClearAndType(duedate, "10/12/2016", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}
}