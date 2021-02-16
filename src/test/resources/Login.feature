Feature: To Validate the login functionality

  Background: 
    Given user has to lunch chrome and hit the url
@smoke @sanity
  Scenario: To verify login functionlity with valid username and ivalid pssword in FB
    When user has enter the username and password
      | syed farith | suresh  | 1234567 | 21-03 |
      | Mohammed    | Muzamil | 1234567 | 21-05 |
      | Mohamme     | Muzmil  |  134567 | 31-05 |
    And click the login button
    Then user unable to enter the homepage

  @sanity
  Scenario: To Validate the forgot password link
    When user has to click the forgot password link
    And user has to enter the mobile number
    And Click thr search button
    Then user has to navigate the otp page

  @sanity
  Scenario Outline: To Validate the login Functionality
    When User enter "<username>" and "<password>"
    And User Click the bUtton
    Then User Should be invalid credientials page

    Examples: 
      | username | password   |
      | java     | java@123   |
      | sql      | sql@123    |
      | pyton    | pyton@123  |
      | hadoop   | haddo@2123 |
