package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.infoabtprimeapplicant;
import com.selenium.SafeActions;



public class infoabtprimeapplicantfunc extends SafeActions implements infoabtprimeapplicant {
	


	public infoabtprimeapplicantfunc(WebDriver d) {
		super(d);
		
	}

	public void fillin(String f1name,String l1name,String db1,String gndr1,String livsvt) throws InterruptedException{
		
		waitUntilPresent(firstname,10);
		selectFrame(curamUAIframe, 30);
	
		safeClearAndType(firstname, f1name, 30);
		safeClearAndType(lastname, l1name, 30);
		safeClearAndType(dob, db1, 30);
		safeClearAndType(gender, gndr1, 30);
		safeClearAndType(liveswith, livsvt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
		
	}
}
