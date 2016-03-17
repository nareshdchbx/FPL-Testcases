package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.CommonElements;


import com.selenium.SafeActions;

public class commonelelmentsfunc extends SafeActions implements CommonElements {


	
	public commonelelmentsfunc(WebDriver d) {
		super(d);
	
		
	}

	public void click1() throws Exception {
		waitUntilElementVisible(xyz,10);
		selectFrame(curamUAIframe, 60);
		//waitUntilElementVisible(xyz,60);
		safeClick(nextbtn, 60);
		waitForPageToLoad(60);
		defaultFrame();
		
		//waitUntilElementVisible(xyz,60);
		
		
		
	}
public void click() throws Exception {
			
	waitUntilPresent(nextbtn,10);
	
	      selectFrame(curamUAIframe, 60);
			
			safeMouseClick(nextbtn, 60);
			//safeJavaScriptClick(nextbtn, 60);
		
			waitForPageToLoad(60);
			waitUntilEleDisappear(By.xpath(".//div[@dojoattachpoint='_underlayNode']"), 60);
			defaultFrame();
			
				midWait(2);
			
	
	}

public void click2() throws Exception {
	
	
	
	safeJavaScriptClick(nextbtn, 60);
	
	
	waitForPageToLoad(60);


}

	

}
