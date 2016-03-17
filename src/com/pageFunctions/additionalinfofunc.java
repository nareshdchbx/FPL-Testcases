package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.additionalinfo;



public class additionalinfofunc extends com.selenium.SafeActions implements additionalinfo {
	
	
public additionalinfofunc(WebDriver d) {
		super(d);
		
	}


	public void fillin(String plan,String date,String benefits) throws InterruptedException{
		waitUntilPresent(coveragestartdate,10);
		selectFrame(curamUAIframe, 60);
		
		safeClearAndType(coveragestartdate, date, 60);
		safeClearAndType(enrolledplan, plan, 60);
		
		safeClearAndType(otherbenfits, benefits, 60);
		safeClick(nextbtn, 60);
				
		defaultFrame();
		waitForPageToLoad(60);
		
	
	}
	
public void fillin1(String plan1,String date1,String benefits1) throws InterruptedException{
	waitUntilPresent(enrolledplan,10);
	selectFrame(curamUAIframe, 30);
		
		safeClearAndType(enrolledplan, plan1, 60);
				
				safeClearAndType(coveragestartdate, date1, 60);
				
				safeClearAndType(otherbenfits, benefits1, 60);
				safeMouseClick(nextbtn, 60);
				defaultFrame();
				waitForPageToLoad(60);
		
	
	}

public void fillin2(String plan2,String date2,String benefits2) throws InterruptedException{
	waitUntilPresent(enrolledplan,10);
	selectFrame(curamUAIframe, 30);
	
safeClearAndType(enrolledplan, plan2, 60);
		
		safeClearAndType(coveragestartdate, date2, 60);
		
		safeClearAndType(otherbenfits, benefits2, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
}


}
