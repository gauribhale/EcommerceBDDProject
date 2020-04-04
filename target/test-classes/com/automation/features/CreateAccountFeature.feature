#Author: your.email@your.domain.com
Feature: Create Account feature
  Sign in link provides create account feature

  Scenario: Create Account using sign in link
    Given user is on Home Page
    When user clicks on Sign In link
    Then user is on Login Page
    Then user enters personal and address information and clicks on register button
      | emailid           | firstname | lastname | password    | company | address            | city   | state | postalcode | country       | mobilephone | aliasaddress |
      | donaldt@gmail.com | Donald    | Trump    | donaldtrump | Google  | Trump Tower,Austin | Austin | Texas |      56789 | United States |  8130479046 | Austin       |
    Then user is on My Account page
