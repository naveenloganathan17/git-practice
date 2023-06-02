package com.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BaseClassMethods.Base;
import com.Configuration.Configreader;
import com.Configuration.FileReadermanager;
import com.POM_Nykaa.NykaaPOM;
import com.Runner.Nykaa_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nykaa_StepDefinition extends Base {
	public static WebDriver driver = Nykaa_Runner.driver;
	NykaaPOM d = new NykaaPOM(driver);

	@Given("user Launch the nykaa application")
	public void user_launch_the_nykaa_application() throws IOException {
		Configreader c = new Configreader();
		get(c.getUrl());// by using properties file configuration
	}

	@When("user click the signin button")
	public void user_click_the_signin_button() {
		click(d.getSigninBtn());

	}

	@When("user click on signin with mobile or email option it pop up for entring login details")
	public void user_click_on_signin_with_mobile_or_email_option_it_pop_up_for_entring_login_details() {
		click(d.getSigninLink());
	}

	@When("user enter the registered mobile number or email id")
	public void user_enter_the_registered_mobile_number_or_email_id() throws IOException {
		sendKeys(d.getSigninInput(), FileReadermanager.GetFileRead().Getconfig().getUsername());
		// by using properties file configuration & FileReaderManager
	}

	@When("user click the proceed button")
	public void user_click_the_proceed_button() {
		click(d.getSigninSubmit());
	}

	@When("user need to enter the opt received in registered email or mobile number")
	public void it_ask_for_the_opt_received_in_registered_email_or_mobile_number() {

	}

	@When("user need to clcik verify to confirm the opt with server")
	public void user_need_to_clcik_verify_to_confirm_the_opt_with_server() {

	}

	@Then("if user otp matches with server it sucessfully login in to the nykaa application")
	public void if_user_otp_matches_with_server_it_sucessfully_login_in_to_the_nykaa_application() {

	}

	@Then("user entered otp is not matches with server it ask for resend and enter the opt received")
	public void user_entered_otp_is_not_matches_with_server_it_ask_for_resend_and_enter_the_opt_received() {

	}

	@When("user move the cursor over the menu of product it shows all subproduct under it")
	public void user_move_the_cursor_over_the_menu_of_product_it_shows_all_subproduct_under_it() {

	}

	@When("user move the cursor over the required subproduct menu and clcik the subproduct")
	public void user_move_the_cursor_over_the_required_subproduct_menu_and_clcik_the_subproduct() {

	}

	@When("user need to handle the windows to switch to required subproduct window")
	public void user_need_to_handle_the_windows_to_switch_to_required_subproduct_window() {

	}

	@When("user need to search the required product in the search option provided in the page")
	public void user_need_to_search_the_required_product_in_the_search_option_provided_in_the_page() {

	}

	@Then("user need to press the enter key to see the relevent matched product for the search keyword")
	public void user_need_to_press_the_enter_key_to_see_the_relevent_matched_product_for_the_search_keyword() {

	}

	@Then("user have to select the required product displayed on the page by click over it")
	public void user_have_to_select_the_required_product_displayed_on_the_page_by_click_over_it() {

	}

	@Then("user need to handle the windows to switch to required clicked product page")
	public void user_need_to_handle_the_windows_to_switch_to_required_clicked_product_page() {

	}

	@Then("user need to click on add to cart button to add the required item to cart")
	public void user_need_to_click_on_add_to_cart_button_to_add_the_required_item_to_cart() {

	}

	@When("user click on bag icon shown in nykaa application it shows all product added to cart")
	public void user_click_on_bag_icon_shown_in_nykaa_application_it_shows_all_product_added_to_cart() {

	}

	@When("user need to switch to the frame shown by using frame index number")
	public void user_need_to_switch_to_the_frame_shown_by_using_frame_index_number() {

	}

	@When("user need to click on qunatity selection option")
	public void user_need_to_click_on_qunatity_selection_option() {

	}

	@When("user can change the quantity of items as required by chaginging the quantity from cart")
	public void user_can_change_the_quantity_of_items_as_required_by_chaginging_the_quantity_from_cart() {

	}

	@When("once user confirmed the requirements click on proceed")
	public void once_user_confirmed_the_requirements_click_on_proceed() {

	}

	@When("User to need to clcik on existing delivery Address shown")
	public void user_to_need_to_clcik_on_existing_delivery_address_shown() {

	}

	@When("click on cash on delevery option to proceed further")
	public void click_on_cash_on_delevery_option_to_proceed_further() {

	}

	@Then("click on place order button to finish the check out process")
	public void click_on_place_order_button_to_finish_the_check_out_process() {

	}
}
