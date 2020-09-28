$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Eclipse/cucumber_fundtransfer.zip_expanded/CucumberTest/src/test/resources/feature/FundTransfer.feature");
formatter.feature({
  "name": "verify details for demo bank",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify login details with valid credetials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on bank page",
  "keyword": "Given "
});
formatter.match({
  "location": "FundTransferSteps.user_is_on_bank_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "FundTransferSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttons",
  "keyword": "And "
});
formatter.match({
  "location": "FundTransferSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the PIN number and Click on Validate PIN",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferSteps.user_has_to_enter_the_PIN_number_and_Click_on_Validate_PIN()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the fund tranfers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the fund transfer button",
  "keyword": "Given "
});
formatter.match({
  "location": "FundTransferSteps.user_click_the_fund_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill the form",
  "keyword": "When "
});
formatter.match({
  "location": "FundTransferSteps.user_fill_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the transfer button",
  "keyword": "And "
});
formatter.match({
  "location": "FundTransferSteps.click_the_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the OTP page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferSteps.the_OTP_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the OTP and Clicking validate VAT",
  "keyword": "When "
});
formatter.match({
  "location": "FundTransferSteps.user_enter_the_OTP_and_Clicking_validate_VAT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "successful transfer page with transaction details is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferSteps.successful_transfer_page_with_transaction_details_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the sign out",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the sign out button",
  "keyword": "Given "
});
formatter.match({
  "location": "FundTransferSteps.user_click_the_sign_out_button()"
});
formatter.result({
  "status": "passed"
});
});