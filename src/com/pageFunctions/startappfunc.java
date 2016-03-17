

package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.startapp;

import com.selenium.SafeActions;

public class startappfunc extends SafeActions implements startapp {
	

	public startappfunc(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	public void click(){
		
		
		selectFrame(curamUAIframe, 30);
		safeMouseClick(startapplication, 30);
		
		
		
		defaultFrame();
		
		
		
		//driver.switchTo().frame(driver.findElement(curamUAIframe));
	
		//driver.findElement(startapplication).click();
		
		
	
		}
	
	
	
	public void click1(){
		
		safeClick(startapplication,30);
	}
	
	
}
