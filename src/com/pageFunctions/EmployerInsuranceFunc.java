package com.pageFunctions;



import org.openqa.selenium.WebDriver;

import com.pageObjects.EmployerInsurance;
import com.selenium.SafeActions;





public class EmployerInsuranceFunc extends SafeActions implements EmployerInsurance {
	
	
public WebDriver driver;
	
	public EmployerInsuranceFunc(WebDriver d) {
		super(d);
	}
	
	public void click(){
		
	
		waitUntilPresent(firstmem,10);
		selectFrame(curamUAIframe, 30);
		safeMouseClick(firstmem, 30);
		safeMouseClick(secondmem, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}

}

