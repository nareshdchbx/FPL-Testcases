package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.businessutilities.Butility;
import com.pageObjects.eligibilityresults;



	
	
	public class eligibilityresultsfunc implements eligibilityresults {
		
		public WebDriver driver;
			
			public eligibilityresultsfunc(WebDriver d) {
				this.driver=d;
			}
			
			public void click() throws InterruptedException{
				
				
				driver.switchTo().frame("curamUAIframe");
				Butility.scrollIntoElementView(driver,results);
				Thread.sleep(5000);
				Butility.saveScreenShot(driver);
				Thread.sleep(2000);
				driver.findElement(results).click();
				driver.switchTo().defaultContent();
				
				
			}
		}



