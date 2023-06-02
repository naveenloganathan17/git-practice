package com.POM_Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartNykaa {
	
	public WebDriver driver;//null Driver
	
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
	public AddToCartNykaa(WebDriver dri) {
		driver=dri;
		PageFactory.initElements(driver, this);
	}
}
