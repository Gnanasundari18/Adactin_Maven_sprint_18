
Feature: To validate the Hotel select functionality

Scenario Outline: To verify the user can able login with correct credentials

Given User to be there in Adactin login page

When User has to fill the "<Username>" and "<password>"

And User has to click the Login button

When User has to select the Location Field

And User has to select the Hotels

And User has to select the Roomtype

And User has to select the Number of rooms

And User has to choose the check in Date

And User has to choose the Check out Date

And User has to fill the Select hotel page

And User has to fill the Book a hotel page

Then Verify user is able to print the orderno

Examples:
|Username|password|
|Gnanasundari|sundari18|



