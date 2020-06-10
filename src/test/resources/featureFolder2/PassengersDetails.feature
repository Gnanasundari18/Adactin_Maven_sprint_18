Feature: To validate the Passengers & Payment Details Page

Scenario: TO Verify the User has to fill the deatils

Given User has to fill the USERNAME , LASTNAME,
And 		PHONE NO, CONTENT EMAIL, VERIFY EMAIL
			
When  User has to fill the card number, exp month and year

And User has to fill the security code and address

Then To verify the user has to get the alert box
