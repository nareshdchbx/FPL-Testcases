package com.pageFunctions;



import org.openqa.selenium.WebDriver;

import com.pageObjects.dependencyontaxreturn;



public class dependencyontaxreturnfunc extends com.selenium.SafeActions implements dependencyontaxreturn {
	
	
public dependencyontaxreturnfunc(WebDriver d) {
		super(d);
		
	}

	
	public void select(){
		
		waitUntilPresent(dependency,10);
		selectFrame(curamUAIframe, 60);
		safeClearAndType(dependency, "no", 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
public void fillin(){
	waitUntilPresent(singledependency,10);
	selectFrame(curamUAIframe, 60);

		safeClearAndType(singledependency, "no", 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	

	}


public void select12(){
	
	waitUntilPresent(dependency,10);
	selectFrame(curamUAIframe, 60);
		safeClearAndType(dependency, "yes", 60);
		pressTabKey_Action(dependency, 10);
		safeClick(taxclaimer, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}

public void select2(){
	waitUntilPresent(dependency,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(dependency, "yes", 60);
	pressTabKey_Action(dependency, 10);
	safeClick(taxclaimer1, 60);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void select3(){
	
	waitUntilPresent(dependency,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(dependency, "no", 60);
	pressTabKey_Action(dependency, 10);
	safeClearAndType(dependent, "no", 60);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

}




public void select1(){
	waitUntilPresent(dependency,10);
	 selectFrame(curamUAIframe, 60);
	safeClearAndType(dependency, "Yes", 60);
	pressTabKey_Action(dependency,5);	
	safeClick(taxclaimer, 60);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
 }




}

