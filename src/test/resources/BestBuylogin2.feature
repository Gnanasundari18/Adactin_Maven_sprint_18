
Feature: To validate the Login Functionality

Background:
Given User has to be there in the BestBuy Login Page 

Scenario: To verify the user can able to login with correct credentials
When User ahs to fill the username and password

					|username|password|
					|sundari.4g@gmailc.com|qwerstsdf|
					|satesh@gmail.com|123435566|
					|nans@gmail.com|sundari18&|

And User click the login button

Then Verify user in navigating the login page


Scenario: To verify the user can create an account

When User has to able to click the Create an Account link 

And User has to fill the firstname, lastname,Emailid and password

And User has to able to click the signup button

Then USer can able to create an account successfully

