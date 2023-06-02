package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NykaaPOM {
	// Sign in WebElements

	public WebDriver driver;// null Driver

	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement signinBtn;

	@FindBy(xpath = "//button[text()='Sign in with Mobile / Email']")
	private WebElement signinLink;

	@FindBy(xpath = "//input[@name='emailMobile']")
	private WebElement signinInput;

	@FindBy(id = "submitVerification")
	private WebElement signinSubmit;

	@FindBy(xpath = "//header[text()='login']")
	private WebElement loginForExistingUser;

	// ____NewUserRegistration__________________

	@FindBy(xpath = "//header[text()='register']")
	private WebElement registerForNewUser;

	@FindBy(id = "fullName")
	private WebElement customerName;

	@FindBy(id = "customerEmail")
	private WebElement customerEmail;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveUser;

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
	// _________________________________________

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

	// Add to cart Elements

	@FindBy(xpath = "(//a[text()='makeup'])[2]")
	private WebElement makeup;

	@FindBy(linkText = "Face Brush")
	private WebElement facebrush;

	@FindBy(xpath = "//input[@placeholder=\"Search on Nykaa\"]")
	private WebElement searchBox;

	@FindBy(xpath = "//div[text()=\"Bronson Professional Supreme Makeup Brush Set Of 10 Pcs\"]")
	private WebElement requiredProduct;

	@FindBy(xpath = "//span[@class=\"btn-text\"]")
	private WebElement addToCart;
	

	public WebElement getMakeup() {
		return makeup;
	}

	public WebElement getFacebrush() {
		return facebrush;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getRequiredProduct() {
		return requiredProduct;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	// Place order
	@FindBy(xpath = "//span[@class=\"cart-count\"]")
	private WebElement cartIcon;

	@FindBy(xpath = "//p[@data-test-id=\"select-quantity\"]")
	private WebElement quantitySelect;

	@FindBy(xpath = "//div[@label=\"1\"]")
	private WebElement oneQuantity;
	@FindBy(xpath = "//div[@label=\"2\"]")
	private WebElement twoQuantity;
	@FindBy(xpath = "//div[@label=\"3\"]")
	private WebElement threeQuantity;
	@FindBy(xpath = "//div[@label=\"4\"]")
	private WebElement fourQuantity;
	@FindBy(xpath = "//div[@label=\"5\"]")
	private WebElement fiveQuantity;

	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceedBtn;

	@FindBy(xpath = "//button[text()='Deliver here']")
	private WebElement deliverHere;

	@FindBy(xpath = "//p[text()='Cash on delivery']")
	private WebElement cod;

	@FindBy(xpath = "//button[text()='Place order']")
	private WebElement placeOrder;
	
	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getQuantitySelect() {
		return quantitySelect;
	}

	public WebElement getOneQuantity() {
		return oneQuantity;
	}

	public WebElement getTwoQuantity() {
		return twoQuantity;
	}

	public WebElement getThreeQuantity() {
		return threeQuantity;
	}

	public WebElement getFourQuantity() {
		return fourQuantity;
	}

	public WebElement getFiveQuantity() {
		return fiveQuantity;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

	public WebElement getDeliverHere() {
		return deliverHere;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	// Add new Address
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

	public NykaaPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
