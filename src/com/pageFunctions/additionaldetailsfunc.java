package com.pageFunctions;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pageObjects.additionaldetails;
import com.selenium.SafeActions;





public class additionaldetailsfunc extends SafeActions implements additionaldetails {
	Logger log =Logger.getLogger("additionaldetailsfunc");
	
public additionaldetailsfunc(WebDriver d) {
		super(d);
		
	}

	public void fillin(){
		
		
		waitUntilPresent(blindinfo,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(blindinfo, "no", 30);
	
		
		safeClearAndType(disability, "no", 30);
		
		safeClearAndType(helpdailyactivities, "no", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
	}


	
public void fillin1(){
	waitUntilPresent(blindinfo1,10);
	selectFrame(curamUAIframe, 30);
		
safeClearAndType(blindinfo1, "no", 30);
		
		safeClearAndType(disability1, "no", 30);
		
		safeClearAndType(helpdailyactivities1, "no", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
	}

public void fillin2(){
	waitUntilPresent(blindinfo1,10);
	
	selectFrame(curamUAIframe, 30);
	safeClearAndType(blindinfo1, "no", 30);
	
	safeClearAndType(disability1, "yes", 30);
	
	safeClick(disabled,30);
	
	safeClearAndType(helpdailyactivities1, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin3(){
	waitUntilPresent(blindinfo2,10);
	selectFrame(curamUAIframe, 30);
	safeClearAndType(blindinfo2, "no", 30);
	
	safeClearAndType(disability2, "no", 30);
	
	safeClearAndType(helpdailyactivities2, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin4(){
	waitUntilPresent(blindinfo3,10);
	selectFrame(curamUAIframe, 30);
	
	safeClearAndType(blindinfo3, "no", 30);
	
	safeClearAndType(disability3, "no", 30);
	
	safeClearAndType(helpdailyactivities3, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin5(){
	waitUntilPresent(blindinfo4,10);
	selectFrame(curamUAIframe, 30);
	safeClearAndType(blindinfo4, "no", 30);
	
	safeClearAndType(disability4, "no", 30);
	
	safeClearAndType(helpdailyactivities4, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin6(){
	waitUntilPresent(blindinfo5,10);
	selectFrame(curamUAIframe, 30);
	
	safeClearAndType(blindinfo5, "no", 30);
	
	safeClearAndType(disability5, "no", 30);
	
	safeClearAndType(helpdailyactivities5, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
	
}
public void fillin7(){
	waitUntilPresent(blindinfo6,10);
	selectFrame(curamUAIframe, 30);
	
	safeClearAndType(blindinfo6, "no", 30);
	
	safeClearAndType(disability6, "no", 30);
	
	safeClearAndType(helpdailyactivities6, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin8(){
	waitUntilPresent(blindinfo7,10);
	selectFrame(curamUAIframe, 30);
	
	safeClearAndType(blindinfo7, "no", 30);
	
	safeClearAndType(disability7, "no", 30);
	
	safeClearAndType(helpdailyactivities7, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

}

