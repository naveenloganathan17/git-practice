package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingUserLoginNykaa {

		//WebElements for Existing User Login
	
		public WebDriver driver;//null Driver
		
		@FindBy(xpath="//button[text()='Sign in']")
		private WebElement signinBtn;
		
		@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
		private WebElement signinLink;
		
		
		@FindBy(xpath="//input[@name='emailMobile']")
		private WebElement signinInput;
		
		
		@FindBy(id="submitVerification")
		private WebElement signinSubmit;
		
		@FindBy(xpath="//header[text()='login']")
		private WebElement loginForExistingUser;
		
		@FindBy(xpath = "//input[@name='otpValue']")
		private WebElement otpInput;

		@FindBy(xpath = "//button[@class='button big fill full ']")
		private WebElement otpSubmit;

		public WebElement getSigninBtn() {
			return signinBtn;
		}

		public WebElement getSigninLink() {
			return signinLink;
		}

		public WebElement getSigninInput() {
			return signinInput;
		}

		public WebElement getSigninSubmit() {
			return signinSubmit;
		}

		public WebElement getLoginForExistingUser() {
			return loginForExistingUser;
		}

		public WebElement getOtpInput() {
			return otpInput;
		}

		public WebElement getOtpSubmit() {
			return otpSubmit;
		}	
		public ExistingUserLoginNykaa(WebDriver dri) {
			driver=dri;
			PageFactory.initElements(driver, this);
		}
}
