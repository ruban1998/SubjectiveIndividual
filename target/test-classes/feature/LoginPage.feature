Feature: Verifying adactin hotel details

 

    Scenario Outline: verifying login details with valid credentials
    Given user is on Login page
    When  user enters "<username>" and "<password>"
    Then  user click login button
    When  user enters valid PIN
    Then  user click validate button
    Then  user click the signout button

Examples: 

         |username|password|
				 |1234556666|MavDemo@02|
         |1234556666|MavDemo@01|

         
