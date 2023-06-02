package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;

import com.BaseClassMethods.Base;

public class PageObjectManagerNykaa extends Base{
	
	public static WebDriver driver;
	
	//Declare class as private
	private NewUserLoginNykaa newLogin;	
	private ExistingUserLoginNykaa existingLogin;
	private AddToCartNykaa addToCart;
	private NewAddressRegistrationNykaa newAddress;
	private PlaceOrderNykaa placeOrder;
	
	//use getter and setter to access in public(use getter only)
	//Inside constructor initialize the class

	public NewUserLoginNykaa getNewLogin() {
		newLogin=new NewUserLoginNykaa(driver);
		return newLogin;
	}
	public ExistingUserLoginNykaa getExistingLogin() {
		existingLogin=new ExistingUserLoginNykaa(driver);
		return existingLogin;
	}
	public AddToCartNykaa getAddToCart() {
		addToCart=new AddToCartNykaa(driver);
		return addToCart;
	}
	public NewAddressRegistrationNykaa getNewAddress() {
		newAddress=new NewAddressRegistrationNykaa(driver);
		return newAddress;
	}
	public PlaceOrderNykaa getPlaceOrder() {
		placeOrder=new PlaceOrderNykaa(driver);
		return placeOrder;
	}
	public PageObjectManagerNykaa(WebDriver d) {
		driver=d;
		//PageFactory.initElements(driver, this);
	}
}
