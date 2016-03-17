package com.pageFunctions;

import org.openqa.selenium.WebDriver;

import com.pageObjects.CreateAccountPage;

import com.selenium.SafeActions;

public class DCGOV_Reg extends SafeActions implements CreateAccountPage{

	public DCGOV_Reg(WebDriver d) {
		super(d);
	
	}

	public void complete_form(String Fname,String Lname,String Uname,String Pwd,String confrmpwd)
	{
		
		
		safeClearAndType(FirstName, Fname, 30);
		safeClearAndType(LastName, Lname, 30);
		safeClearAndType(UserName, Uname, 30);
		safeClearAndType(Password, Pwd, 30);
		safeClearAndType(ConfirmPassword, confrmpwd, 30);
		
	}
	
	public void click_signup() {
		
	
		safeClick(CreateAccountBtn, 30);
	}

}
