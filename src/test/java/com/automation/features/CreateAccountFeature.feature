#Author: your.email@your.domain.com
Feature: Create Account feature
  Sign in link provides create account feature

  Scenario: Create Account using sign in link
    Given user is on Home Page
    When user clicks on Sign In link
    Then user enter emailid
      | gouribha@yahoo.com |
    And user clicks on Create Account button
    Then user enters personal information of firstname, lastname and password
      | James | Bond | jamesbond |
    And user enters address information 
      | James | Bond | Tesla | main road, Tempe | Tempe | Arizona | 12345 | United States | 9823564578 | Florida |
    Then user clicks on Register button
    And user is on My Account page

    
    #of firstname, lastname,company,address,city,state, "<postalcode>", "<country>", "<mobilephone>", "<aliasaddress>"