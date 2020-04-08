#Author: your.email@your.domain.com
Feature: Login Feature
  Sign in link provides login feature

  Scenario Outline: Login using sign in link
    Given user is on home page
    When user clicks on sign in link
    Then user enters "<emailid>" and "<password>"
    And user clicks on sign in button
    Then user is on my account page

    Examples: 
      | emailid          | password    |
      | donald@gmail.com | donaldtrump |
