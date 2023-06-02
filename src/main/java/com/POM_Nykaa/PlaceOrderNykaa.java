package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderNykaa {
	
	public WebDriver driver;//null Driver 
	
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
	public PlaceOrderNykaa(WebDriver dri) {
		driver=dri;
		PageFactory.initElements(driver, this);
	}
}
