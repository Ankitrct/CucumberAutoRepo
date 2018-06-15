@FullExecution
Feature: Launch application

Background: Launch url and login
Given Launch application url

@Smoke @Regression
Scenario: Verify user is navigated to home page

Given User is navigated to the home page
Then Close the browser session


Scenario: Verify new user is able resgister new account 

Given User is navigated to the home page
And Click on registration link
Then Enter firstname , lastname , phonenumber , username , email id and password

| firstname  |  lastname | phonenumber | username    |  emailid        | password   |
| Jack	     | Parker    | 1111111111  | JackTest1   |  test@gmail.com | 234@Test12 | 
| Gerry	     | Brown     | 2222222222  | GerryTest1  |  test1@gmail.com| 568@Test12 | 

And Select marital status as single
And Select hobby as dance
And Select country as United States
And Select DOB
And Enter details in about yourself section
And Click submit button
But Verify that the new user is able to register account
Then Close the browser session


@Smoke 
Scenario Outline: Verify user is able to register and test it with multiple dataset

Given User is navigated to the home page
And Click on registration link
And Enter "<firstname>" as firstname
And Enter "<lastname>" as Lastname
And Select marital status as single
And Select hobby as dance
And Select country as United States
And Select DOB
And Enter "<phonenumber>" as contact number
And Enter "<username>" as username
And Enter "<emailid>" as email
And Enter details in about yourself section
And Enter "<password>" as password
And Re-enter passwrod "<passowrd>" as confirm passowrd
And Click submit button
But Verify that the new user is able to register account
Then Close the browser session
Examples:
| firstname  |  lastname | phonenumber | username    |  emailid        | password   |
| Jerry	     | Dan    | 1112223333  | JerryTest1  |  test@gmail.com | 234@Test12 | 
| David	     | Brown     | 2222255555  | DavidTest1  |  test1@gmail.com| 568@Test12 | 
