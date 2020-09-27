#Author: your.email@your.domain.com
Feature: Create Account feature
  Register link provides create account feature

  Scenario Outline: Create Account using register link
    Given user is on home page
    And user clicks on register link
    When user enters firstname "<firstname>", lastname "<lastname>", emailid "<emailid>" and password "<password>" and clicks on register button
    Then user should be successfully registered
    And user with email "<emailid>" should redirect to home page

    Examples: 
      | firstname | lastname | emailid           | password    |
      | Donald    | Trump    | dtrump0@gmail.com | donaldtrump |
