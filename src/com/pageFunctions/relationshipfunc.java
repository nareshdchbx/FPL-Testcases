package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.relationship;

import com.selenium.SafeActions;

public class relationshipfunc extends SafeActions implements relationship {

	
	public relationshipfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	public void fillin(String rltn){
		waitUntilPresent(relation,10);
		selectFrame(curamUAIframe, 60);
		safeClearAndType(relation, rltn, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
}
public void fillin1(String rltn26,String rltn27){
		
	waitUntilPresent(relation,10);	
	selectFrame(curamUAIframe, 60);
		safeClearAndType(relation, rltn26, 30);
		safeClearAndType(relation1, rltn27, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		

}

public void fillin2(String rltn1,String rltn2,String rltn3,String rltn4,String rltn5,String rltn6,String rltn7){
	
	waitUntilPresent(relation,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(relation, rltn1, 30);
	safeClearAndType(relation1, rltn2, 30);
	safeClearAndType(relation2, rltn3, 30);
	safeClearAndType(relation3, rltn4, 30);
	safeClearAndType(relation4, rltn5, 30);
	safeClearAndType(relation5, rltn6, 30);
	safeClearAndType(relation6, rltn7, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
	}

public void fillin3(String rltn8,String rltn9,String rltn10,String rltn11,String rltn12,String rltn13){
	
	waitUntilPresent(relation,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(relation, rltn8, 30);
	safeClearAndType(relation1, rltn9, 30);
	safeClearAndType(relation2, rltn10, 30);
	safeClearAndType(relation3, rltn11, 30);
	safeClearAndType(relation4, rltn12, 30);
	safeClearAndType(relation5, rltn13, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

	}

public void fillin4(String rltn14,String rltn15,String rltn16,String rltn17,String rltn18){
	waitUntilPresent(relation,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(relation, rltn14, 30);
	safeClearAndType(relation1, rltn15, 30);
	safeClearAndType(relation2, rltn16, 30);
	safeClearAndType(relation3, rltn17, 30);
	safeClearAndType(relation4, rltn18, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

	}

public void fillin5(String rltn19,String rltn20,String rltn21,String rltn22){
	waitUntilPresent(relation,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(relation, rltn19, 30);
	safeClearAndType(relation1, rltn20, 30);
	safeClearAndType(relation2, rltn21, 30);
	safeClearAndType(relation3, rltn22, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}
	
public void fillin6(String rltn23,String rltn24,String rltn25){
	waitUntilPresent(relation,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(relation, rltn23, 30);
	safeClearAndType(relation1, rltn24, 30);
	safeClearAndType(relation2, rltn25, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

}


}
