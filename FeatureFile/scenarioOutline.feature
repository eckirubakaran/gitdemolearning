Feature: User On the Registerion page

  Scenario Outline: User Has to create a New Login Id
    Given User open a Sign Up Page
    When User enter a <firstname> and <lastname> as well as <email>
    And User enter a <password> and <confirmpassword>
    And User Click the Register Button
    Then The Page takes a User to Home page

    Examples: 
      | firstname | lastname | email              | password  | confirmpassword |
      | Eshwer    | Kahan    | eshu@123gmail.com  | eshu@123  | eshu@123        |
      | Pooja     | Kannan   | pooja@123gmail.com | pooja@123 | pooja@123       |
