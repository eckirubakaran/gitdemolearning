Feature: Login TestCase

Scenario: Entering Correct UserName and Password 

Given User on the Login Page 
When User Entering the Values "Admin" and "admin123"
And User Clicking the Login button
Then The Website Taking a User to Next page

