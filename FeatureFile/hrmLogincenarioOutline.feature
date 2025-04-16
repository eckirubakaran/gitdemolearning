Feature: User on the HRM Website

  Scenario Outline: User Testing a Login Page
    Given User on the Login Page
    When User entering a values "<userName>" and "<passWord>"
    And User Clicking a Login button
    Then Website take a User to Home Page

    Examples: 
      | userName | passWord |
      | Admin    | admin123 |
      | Admin    | admin    |
