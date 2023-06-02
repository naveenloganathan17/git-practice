package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressRegistrationNykaa {
	public WebDriver driver;//null Driver
	
	@FindBy(xpath = "//p[text()='Add New Address']")
	private WebElement addNewAddress;

	@FindBy(xpath = "//textarea[@placeholder='Road Name/ Area /Colony']")
	private WebElement address;

	@FindBy(xpath = "//input[@placeholder='House/ Flat/ Office No.']")
	private WebElement doorNo;

	@FindBy(xpath = "//input[@placeholder='Pincode']")
	private WebElement pinCode;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement name;

	@FindBy(xpath = "//input[@placeholder='Phone']\"")
	private WebElement phoneNo;

	@FindBy(xpath = "//input[@placeholder='Email ID (Optional)']")
	private WebElement emailId;

	@FindBy(xpath = "//button[text()='Ship to this address']")
	private WebElement shipToThisAddress;

	public WebElement getAddNewAddress() {
		return addNewAddress;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getDoorNo() {
		return doorNo;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getShipToThisAddress() {
		return shipToThisAddress;
	}
	public NewAddressRegistrationNykaa(WebDriver dri) {
		driver=dri;
		PageFactory.initElements(driver, this);
	}
}
