package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import com.pageObjects.SecurityQuestions;
import com.selenium.SafeActions;



public class Securityqsnspage extends SafeActions implements SecurityQuestions {
	
 public WebDriver driver;


	
   
 public Securityqsnspage(WebDriver d) {
		super(d);
		this.driver = d;
		
	}

	public void filing_ans() {
		
		Select dropdown1 = new Select(driver.findElement(Question1));
		Select dropdown2 = new Select(driver.findElement(Question2));
		Select dropdown3 = new Select(driver.findElement(Question3));
		
	   dropdown1.selectByIndex(1);
	   dropdown2.selectByIndex(2);
	   dropdown3.selectByIndex(3);
//	   safesele(drop,index)
		driver.findElement (Answer1).sendKeys("test");
		driver.findElement (Answer2).sendKeys("test");
		driver.findElement (Answer3).sendKeys("test");
		driver.findElement(ContinueBtn).click();
		
	}
	
	public void filing_ans1() {
		
		waitUntilPresent(Question1, 60);
		Select dropdown1 = new Select(driver.findElement(Question1));
		dropdown1.selectByIndex(1);
		driver.findElement (Answer1).sendKeys("test");
		Select dropdown2 = new Select(driver.findElement(Question2));
		dropdown2.selectByIndex(2);
		driver.findElement (Answer2).sendKeys("test");
		Select dropdown3 = new Select(driver.findElement(Question3));
		dropdown3.selectByIndex(3);
	   
		driver.findElement (Answer3).sendKeys("test");
		driver.findElement(Contnu).click();

	
}

	
}
