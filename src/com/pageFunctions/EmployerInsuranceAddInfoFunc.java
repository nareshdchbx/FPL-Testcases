package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.EmployerInsuranceAddInfo;
import com.selenium.SafeActions;




public class EmployerInsuranceAddInfoFunc extends SafeActions implements EmployerInsuranceAddInfo  {
	
public WebDriver driver;
	
	public EmployerInsuranceAddInfoFunc(WebDriver d) {
		super(d);
	}

public void fillin(){
	waitUntilPresent(emplyrname,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(emplyrname, "Deepak", 30);
	safeClearAndType(EIN, "235454854", 30);
	safeClearAndType(empyetyp, "yes", 30);
	safeClearAndType(adrsln1, "8125 48th ave", 30);
	safeClearAndType(cty, "college park", 30);
	safeClearAndType(stt, "MD", 30);
	safeClearAndType(zpcode, "20002", 30);
	safeClearAndType(costplan, "united", 30);
	safeClearAndType(empcontribution, "450", 30);
	safeClearAndType(contributionfreq, "monthly", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

		
}

}
