Feature: To validate the search Functionality

Scenario Outline: To verify the user can able search the desired item

Given User has to be there in the BestBuy home Page

When User has to enter the search item in "<search>" bar


And User Click the search icon



Then Verify the user is navigating into the search page
Examples:
 |search|
 |microwave oven|
 |instant cameras|
 |Electric Guitars|
 |Over-Ear Headphones|
 |Backpacks|
 |Women Watches|
 |iPhone|
 |Cardio Machines|
 |Baby Monitors|
 |Travel, Luggage & Bags|