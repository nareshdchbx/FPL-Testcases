package com.pageObjects;

import org.openqa.selenium.By;


public interface SecurityQuestions {
	


	  public static By Question1 = By.id("question0");
		
		public static By Question2 = By.id("question1");
		
		public static By Question3 = By.id("question2");
		
		public static By Answer1 = By.id("Bharosa_Register_Pad0DataField");
		
		public static By Answer2 = By.id("Bharosa_Register_Pad1DataField");
		
		public static By Answer3 = By.id("Bharosa_Register_Pad2DataField");
		
		public static By ContinueBtn = By.xpath("//*[@id='loginForm']/div[8]/input");
		
		public static By Contnu = By.xpath("//*[@title='Continue']");
	}

