Feature: Launch application

Scenario: Verify user is able to launch the application url

Given Launch application url
Then User is navigated to the home page
Then Close the browser session


#Feature: Register user

Scenario: Verify new user is able resgister new account 

Given Launch application url
Then User is navigated to the home page
And Click on registration link
And Enter firstname
And Enter Lastname
And Select marital status as single
And Select hobby as dance
And Select country as United States
And Select DOB
And Enter phone number
And Enter username
And Enter e-mail id
And Enter details in about yourself section
And Enter password
And Re-enter password to confirm
And Click submit button
But Verify that the new user is able to register account
Then Close the browser session