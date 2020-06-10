$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SIVA/eclipse-workspace/Day1cumer/src/test/resources/featurefolder/adactin1.feature");
formatter.feature({
  "name": "To validate the Hotel select functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify the user can able login with correct credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User to be there in Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to fill the \"\u003cUsername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select the Location Field",
  "keyword": "When "
});
formatter.step({
  "name": "User has to select the Hotels",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select the Roomtype",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select the Number of rooms",
  "keyword": "And "
});
formatter.step({
  "name": "User has to choose the check in Date",
  "keyword": "And "
});
formatter.step({
  "name": "User has to choose the Check out Date",
  "keyword": "And "
});
formatter.step({
  "name": "User has to fill the Select hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User has to fill the Book a hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "Verify user is able to print the orderno",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ]
    },
    {
      "cells": [
        "Gnanasundari",
        "sundari18"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the user can able login with correct credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User to be there in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Adactin.user_to_be_there_in_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the \"Gnanasundari\" and \"sundari18\"",
  "keyword": "When "
});
formatter.match({
  "location": "Adactin.user_has_to_fill_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the Location Field",
  "keyword": "When "
});
formatter.match({
  "location": "Adactin.user_has_to_select_the_Location_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the Hotels",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_select_the_Hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the Roomtype",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_select_the_Roomtype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the Number of rooms",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_select_the_Number_of_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to choose the check in Date",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_choose_the_check_in_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to choose the Check out Date",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_choose_the_Check_out_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the Select hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_Select_the_Adults_per_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the Book a hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.user_has_to_fill_the_Book_a_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is able to print the orderno",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.verify_user_is_able_to_print_the_orderno()"
});
formatter.result({
  "status": "passed"
});
});