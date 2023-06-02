$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/FeatureFile/nykaa.feature");
formatter.feature({
  "line": 1,
  "name": "we can check and order cosmetic product thorough nykaa shoping application",
  "description": "",
  "id": "we-can-check-and-order-cosmetic-product-thorough-nykaa-shoping-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user login the account by using login module",
  "description": "",
  "id": "we-can-check-and-order-cosmetic-product-thorough-nykaa-shoping-application;user-login-the-account-by-using-login-module",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ExistingUserLogin"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the nykaa application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click the signin button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on signin with mobile or email option it pop up for entring login details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter the registered mobile number or email id",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user need to enter the opt received in registered email or mobile number",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user need to clcik verify to confirm the opt with server",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "if user otp matches with server it sucessfully login in to the nykaa application",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user entered otp is not matches with server it ask for resend and enter the opt received",
  "keyword": "But "
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_launch_the_nykaa_application()"
});
formatter.result({
  "duration": 2232714000,
  "status": "passed"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 36217600,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat com.BaseClassMethods.Base.ScrollAndClick(Base.java:335)\r\n\tat com.StepDefinitionNykaa.Nykaa_Project_StepDefinition.user_click_the_signin_button(Nykaa_Project_StepDefinition.java:30)\r\n\tat ✽.When user click the signin button(src/test/java/com/FeatureFile/nykaa.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_click_on_signin_with_mobile_or_email_option_it_pop_up_for_entring_login_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_enter_the_registered_mobile_number_or_email_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_click_the_proceed_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.it_ask_for_the_opt_received_in_registered_email_or_mobile_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_need_to_clcik_verify_to_confirm_the_opt_with_server()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.if_user_otp_matches_with_server_it_sucessfully_login_in_to_the_nykaa_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Nykaa_Project_StepDefinition.user_entered_otp_is_not_matches_with_server_it_ask_for_resend_and_enter_the_opt_received()"
});
formatter.result({
  "status": "skipped"
});
});