Feature: TrainBooking

Background: Launch Application
 Given user launch the browser and application "https://www.redbus.in/train-tickets/train-seat-availability"
 @sanity
  Scenario: Book a train in Redbus Application
    When user enters the value in from place
    |Erode|Trichy|Chennai|Coimbatore|
    And user enters the value in to place    
    |Location1|Pune|
    |Location2|kolkata|
    |Location3|Kerala|
    |Location4|Mumbai|
    And user selects a date
    And user clicks on free cancellation
    And user clicks on search train 
    Then validate the train displayed in the UI
    
    #Scenario: Book a train in Redbus Application
    #When user enters the value in from place
    #|Chennai|Erode|Trichy|Coimbatore|
    #And user enters the value in to place
    #|Location1|Mumbai|
    #|Location2|kolkata|
    #|Location3|Kerala|
    #|Location4|Pune|
    #And user selects a date
    #And user clicks on free cancellation
    #And user clicks on search train
    #Then validate the train displayed in the UI
    #
    #Scenario: Book a train in Redbus Application
    #When user enters the value in from place
    #|Coimbatore|Trichy|Chennai|Erode|
    #And user enters the value in to place
    #|Location1|Pune|
    #|Location2|kolkata|
    #|Location3|Kerala|
    #|Location4|Mumbai|
    #And user selects a date
    #And user clicks on free cancellation
    #And user clicks on search train 
    #Then validate the train displayed in the UI
    #
    #Scenario: Book a train in Redbus Application
    #When user enters the value in from place
    #|Chennai|Trichy|Erode|Coimbatore|
    #And user enters the value in to place
    #|Location1|Karur|
    #|Location2|kolkata|
    #|Location3|Erode|
    #|Location4|Mumbai|
    #And user selects a date
    #And user clicks on free cancellation
    #And user clicks on search train 
    #Then validate the train displayed in the UI