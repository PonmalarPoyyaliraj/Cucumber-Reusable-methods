$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Facebook.feature");
formatter.feature({
  "name": "Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create New Account in Facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click create new account",
  "keyword": "Given "
});
formatter.step({
  "name": "User pass the value in first name box \"\u003cfirst name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User pass the value in surname box \"\u003clast name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User pass the value in mobile number box \"\u003cmobile number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User pass the value in New password box \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select a date \"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select a month \"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select a year \"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select the gender",
  "keyword": "And "
});
formatter.step({
  "name": "user click the signup \"\u003csc\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "date",
        "month",
        "year",
        "mobile number",
        "password",
        "sc"
      ]
    },
    {
      "cells": [
        "ponmalar",
        "malar",
        "6",
        "Jun",
        "2021",
        "8798432190",
        "malar",
        "sc1"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the facebook application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_launch_the_facebook_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Account in Facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click create new account",
  "keyword": "Given "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_click_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the value in first name box \"ponmalar\"",
  "keyword": "When "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_pass_the_value_in_first_name_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the value in surname box \"malar\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_pass_the_value_in_surname_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the value in mobile number box \"8798432190\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.User_pass_the_value_in_mobile_number_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the value in New password box \"malar\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_pass_the_value_in_New_password_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select a date \"6\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_select_a_date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select a month \"Jun\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_select_a_month(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select a year \"2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_select_a_year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the gender",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_select_the_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the signup \"sc1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Facebook.user_click_the_signup(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Redtrain.feature");
formatter.feature({
  "name": "TrainBooking",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser and application \"https://www.redbus.in/train-tickets/train-seat-availability\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.user_launch_the_browser_and_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a train in Redbus Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enters the value in from place",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.user_enters_the_value_in_from_place(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the value in to place",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.user_enters_the_value_in_to_place(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a date",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.user_selects_a_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on free cancellation",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.user_clicks_on_free_cancellation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search train",
  "keyword": "And "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.user_clicks_on_search_train()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the train displayed in the UI",
  "keyword": "Then "
});
formatter.match({
  "location": "in.Redbus.StepDefinition.Validatetrain.validate_the_train_displayed_in_the_UI()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});