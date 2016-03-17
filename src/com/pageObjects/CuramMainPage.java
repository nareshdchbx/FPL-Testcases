package com.pageObjects;

import org.openqa.selenium.By;




public interface CuramMainPage {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
			

	
	
	public static By ApplyForHelpPayingHealthInsurance = By.linkText("Apply for help paying for your health coverage");
	
	
//	public static By ApplyForPrivateHealthInsurance = By.linkText("Apply for private health coverage without financial help");
//	
//	public static By FindApplication = By.linkText("Find an already submitted application");
//	
	public static By logout123 = By.xpath(".//*[@id='loginForm']/div[8]/input");
	
}
