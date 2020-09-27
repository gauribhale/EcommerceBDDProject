#Author: your.email@your.domain.com
Feature: Login Feature
  Sign in link provides login feature

  Scenario Outline: Login using login link (Successful login)
    Given user is on home page
    And user navigates to login page
    When user enters valid emailid "<emailid>" and password "<password>"
    Then user with email "<emailid>" should redirect to home page

    Examples: 
      | emailid              | password   |
      | gouribhale@gmail.com | Gauri_6494 |

  Scenario Outline: Login using login link (Unsuccessful login)
    Given user is on home page
    And user navigates to login page
    When user enters invalid emailid "<emailid>" and password "<password>"
    Then error message should be displayed as "<error_msg>"

    Examples: 
      | emailid              | password   | error_msg                                                        |
      |                      | Gauri_6494 | Login was unsuccessful. Please correct the errors and try again. |
      | gouribhale@gmail.com |            | Login was unsuccessful. Please correct the errors and try again. |
      | gouribhale@gmail.com | gauri      | Login was unsuccessful. Please correct the errors and try again. |
