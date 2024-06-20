Feature: Facebook

Background: Launch Application
 Given user launch the facebook application "https://www.facebook.com/"
 @smoke
  Scenario Outline: Create New Account in Facebook
    Given user click create new account
    When User pass the value in first name box "<first name>"
    And User pass the value in surname box "<last name>"
    And User pass the value in mobile number box "<mobile number>"
    And User pass the value in New password box "<password>"
    And User select a date "<date>"
    And User select a month "<month>"
    And User select a year "<year>"
    And User select the gender
   Then user click the signup "<sc>"

    Examples: 
      |first name  | last name    | date | month | year | mobile number | password | sc   |
      | ponmalar   |    malar     |   6  | Jun   | 2021 | 8798432190    | malar    | sc1  |
      #| poyyali    |    raj       |   7  | Jun   | 2021 | 8798432191    | raju     | sc2  |
      #| mohamed    |    meeran    |   8  | Jun   | 2021 | 8798432192    | meera    | sc3  |
      #| jeni       |    sukumar   |   9  | Jun   | 2021 | 8798432193    | suku     | sc4  |
      