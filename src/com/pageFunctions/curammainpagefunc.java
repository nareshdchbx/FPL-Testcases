package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.CuramMainPage;

public class curammainpagefunc implements CuramMainPage {
	
public WebDriver driver;
	
	public curammainpagefunc(WebDriver d) {
		this.driver=d;
	}

	public void click(){
		
		// curam = By.xpath("//*[@id='curamUAIframe']");
		
		driver.switchTo().frame("curamUAIframe");
		driver.findElement(ApplyForHelpPayingHealthInsurance).click();
		
		driver.switchTo().defaultContent();
//		driver.findElement(ApplyForPrivateHealthInsurance).click();
//		driver.findElement(FindApplication).click();
//		

}
}