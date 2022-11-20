Feature: login page feature
Scenario: login page title
Given user is on login page
When user gets the title of the page
Then title should be "Swag Labs"

Scenario: check button login
Given user is on login page
Then button login should be displayed

Scenario: login with correct credetials
Given user is on login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user click on login button
Then user gets the title of the page
And page title should be "Swag Labs"


