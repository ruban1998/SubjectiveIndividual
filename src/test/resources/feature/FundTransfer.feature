Feature: verify details for demo bank
 
 Scenario: verify login details with valid credetials
    Given user is on bank page     
    When user enters username and password  
    And user click login buttons
    Then user has to enter the PIN number and Click on Validate PIN

 
Scenario: verify the fund tranfers
        Given user click the fund transfer button
        When user fill the form
        And click the transfer button
        Then the OTP page is displayed
        When user enter the OTP and Clicking validate VAT
        Then successful transfer page with transaction details is displayed
    
Scenario: verify the sign out
        Given user click the sign out button