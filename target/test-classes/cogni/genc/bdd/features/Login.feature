@tags
Feature: Login Functionality of OpenCart Web Application

	As a user of OpenCart website
	I want to be able to login into my account
	So that I can access account related features and manage orders
	
	Background:
		Given I am on the OpenCart login page

@smoke	     
Scenario: Validate successful login with valid credentials
Given I have entered a vald username and password
When I click on the login button
Then I should be logged in successfully

Scenario Outline: Unsuccessful login with invalid or empty credentials
	Given I have entered invalid "<username>" and "<password>"
	When I click on the login button
	Then I should see an error message indicating "<error_message>"
	
	Examples:
	     |username									|password								|error_message																																|
	     |invalid@gmail.com		|invalidPassword			|Warning: No match for E-Mail Address and/or Password.		|
	     |abcc@mail,com				|validPassword				|Warning: No match for E-Mail Address and/or Password.		|
	     |valid@gmail.com			|abcde										|Warning: No match for E-Mail Address and/or Password.		|
	    

Scenario: Validate navigating to the forgotten password page
	When I click on the "Forgotten Password" link
	Then I should be redirected to the password reset page

    