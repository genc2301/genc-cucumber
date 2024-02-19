@tag
Feature: Registration of Open Cart ecommerce aplication
  As a user of OpenCart website
	I want to be able to register
	So that I can open a new account in the application

Background:
		Given I am on the OpenCart login page
		
	@datatable
  Scenario Outline: Validate creation of new account in OPen Cart application
    Given I am on the register account page
    When I enter my personal details and continue
    					|FName		|LName  |Email                         |Telephone|
    					|Rohit   	|Ranjan  |rohit679@gmail.com  |8988776162|
    					|Ritesh   |Ranjan   |ritesh679@gmail.com |8918706162|
    					|Rahul    |Kumar   |rahul179@gmail.com  |8958736162|
    Then new user account should get created