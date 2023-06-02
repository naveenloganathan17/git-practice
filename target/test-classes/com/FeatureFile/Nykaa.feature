Feature: we can check and order cosmetic product thorough nykaa shoping application

@ExistingUserLogin
Scenario: user login the account by using login module
Given user Launch the nykaa application
When user click the signin button
And user click on signin with mobile or email option it pop up for entring login details
And user enter the registered mobile number or email id
And user click the proceed button 
And user need to enter the opt received in registered email or mobile number
And user need to clcik verify to confirm the opt with server 
Then if user otp matches with server it sucessfully login in to the nykaa application
But user entered otp is not matches with server it ask for resend and enter the opt received

@AddToCart
Scenario: user search for product
When user move the cursor over the menu of product it shows all subproduct under it
And user move the cursor over the required subproduct menu and clcik the subproduct
And user need to handle the windows to switch to required subproduct window
And user need to search the required product in the search option provided in the page
Then user need to press the enter key to see the relevent matched product for the search keyword 
And user have to select the required product displayed on the page by click over it
And user need to handle the windows to switch to required clicked product page
Then user need to click on add to cart button to add the required item to cart

@PlaceOrder
Scenario: placing order by using cash on delevery options
When user click on bag icon shown in nykaa application it shows all product added to cart
And user need to switch to the frame shown by using frame index number
And user need to click on qunatity selection option
And user can change the quantity of items as required by chaginging the quantity from cart
And once user confirmed the requirements click on proceed
And User to need to clcik on existing delivery Address shown
And click on cash on delevery option to proceed further
Then click on place order button to finish the check out process