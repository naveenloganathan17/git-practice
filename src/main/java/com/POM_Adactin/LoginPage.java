package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declare the element as private
	//Generate the Getters
	// WebElement refname=driver.findElement(By.xpath("Value"));
	//driver. is replaced by using pageFactory.iniElements code from POM class method, for that Chrome Driver is assigned from runner Class
	public static WebDriver driver;//null Driver
	
	//Login Page	
	@FindBy(id="username")
	private WebElement user;	
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement loginbtn;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	// Search Hotel
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	@FindBy(id="datepick_out")
	private WebElement datepick_out;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(id="Reset")
	private WebElement reset;
	

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getReset() {
		return reset;
	}

	//Select Hotel Booking
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;	
	@FindBy(id="continue")
	private WebElement continuebtn;
	@FindBy(id="cancel")
	private WebElement cancelbtn;
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	public LoginPage(WebDriver dri) {
		driver=dri;//Chrome
		PageFactory.initElements(driver, this);
	}
}
