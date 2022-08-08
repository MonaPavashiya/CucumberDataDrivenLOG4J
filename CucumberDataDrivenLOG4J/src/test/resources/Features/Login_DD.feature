Feature: Login in website

  Scenario Outline: Check login is successful
    Given User Launch Chrome browser
    When user opens URL "https://www.saucedemo.com/"
    And user entering <Username> and <Password>
    And click on login
    Then page title should be "Swag Labs"
    When user clicks on ReactButton
    Then User clicks on logout link
    And user close browser

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |
      | Mona          | m123         |
