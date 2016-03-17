package com.pageFunctions;



import org.openqa.selenium.WebDriver;

import com.pageObjects.taxfiler;

import com.selenium.SafeActions;

public class taxfilerfunc extends SafeActions implements taxfiler {

	public taxfilerfunc(WebDriver d) {
		super(d);
		
	}

	public void click(){
		waitUntilPresent(taxfiler,50);
			 selectFrame(curamUAIframe, 30);
				
				safeMouseClick(taxfiler, 60);
				safeMouseClick(nextbtn, 60);
				 defaultFrame();
					waitForPageToLoad(30);
				
			     }
		

	
public void click1(){

	waitUntilPresent(taxfiler,25);
			 selectFrame(curamUAIframe, 30);
			safeMouseClick(taxfiler, 60);
			safeMouseClick(taxfiler1, 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);
		
		 }

	
	

public void click2(){
	waitUntilPresent(taxfiler,25);
		selectFrame(curamUAIframe, 30);
		safeMouseClick(taxfiler, 60);
		safeMouseClick(taxfiler1, 30);
		safeMouseClick(taxfiler2, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	 }

	


public void click3(){
	waitUntilPresent(taxfiler,25);
		 selectFrame(curamUAIframe, 30);
			safeMouseClick(taxfiler, 60);
			safeMouseClick(taxfiler1, 30);
			safeMouseClick(taxfiler3, 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);
			
		 }



}
