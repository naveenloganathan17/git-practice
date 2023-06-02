package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserLoginNykaa {
	
		//WebElements for New User Login
	
		public WebDriver driver;//null Driver
	
		@FindBy(xpath="//button[text()='Sign in']")
		private WebElement signinBtn;
		
		@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
		private WebElement signinLink;
		
		
		@FindBy(xpath="//input[@name='emailMobile']")
		private WebElement signinInput;
		
		
		@FindBy(id="submitVerification")
		private WebElement signinSubmit;
		
		@FindBy(xpath="//header[text()='register']")
		private WebElement registerForNewUser;	
		
		@FindBy(xpath = "//input[@name='otpValue']")
		private WebElement otpInput;

		@FindBy(xpath = "//button[@class='button big fill full ']")
		private WebElement otpSubmit;
		
		@FindBy(id="fullName")
		private WebElement customerName;
		
		@FindBy(id="customerEmail")
		private WebElement customerEmail;
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement saveUser;
		
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
		public WebElement getOtpInput() {
			return otpInput;
		}

		public WebElement getOtpSubmit() {
			return otpSubmit;
		}		
		
		public WebElement getRegisterForNewUser() {
			return registerForNewUser;
		}

		public WebElement getCustomerName() {
			return customerName;
		}

		public WebElement getCustomerEmail() {
			return customerEmail;
		}

		public WebElement getSaveUser() {
			return saveUser;
		}
		public NewUserLoginNykaa(WebDriver dri) {
			driver=dri;
			PageFactory.initElements(driver, this);
		}
}
