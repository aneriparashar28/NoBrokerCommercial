Feature: To test the functionalities of NoBroker website

  Background: 
    Given the User should be logged in the NoBroker website

  @EnterDetails
  Scenario: to validate if user is taken to the property listings after providing the valid informations
    When user selects the commercial option
    And user enters all the required details in the given section
    Then the user is taken to the property listing page

  @NriCarnival
  Scenario Outline: to validate if the user is able to register for nri carnival
    When Click on the no broker logo
    And scroll down to view the enquire now button
    And select the enquire now button
    And click on the nri carnival
    And click on register now
    And User enter details with <name>,<email>,<mobileno>
    And user selects the city
    And user selects the budget
    Then click on submit button

    Examples: 
      | name | email             | mobileno   |
      | joey | joey123@gmail.com | 8986475876 |

  
  @CapitalGain 
  Scenario: The user can enter the details in the capital gain form 
    When user Clicks on the NoBroker logo
    And user scrolls down to view the enquire now button
    And user selects the enquire now button
    And user clicks on capital gain option 
    And user enters the purchase price and sale price 
        |10000000|200000000|
    And user selects parchase time, income slab and sale time from the drop down   
    And user clicks on the submit option 
    
  @defectform
  Scenario: user enters the personal information in the form displayed 
  When user is taken to the next scenario through the privious one
  And user enters the details in the form name, email and  mobile 
        |chandler|chandler@gmail.com|6735668798|
  And click the submit button
  
  @SethZuri
  Scenario: user is displayed the seth zuri properties 
  When user is directed to the url 
  And the user clicks on Seth Zuri option
  Then the user is taken to the property listed pages 
  
  
  
  
  
    
      
  