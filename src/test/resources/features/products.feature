Feature: Verify Aspiration Functionality

Background: Verify that user is able to navigate to product page
		Given I am on the Login page URL "https://www.aspiration.com/"
  	When I click on Spend & Save button
  	Then I verify two card products present on product page

  
Scenario: Verify input modal displayed on Get Aspiration Product
  	When I click on Get Aspiration Product
  	Then I should see a modal containing input field
  	
  	
Scenario Outline: Verify the modals displayed on Get Aspiration Product
		When I click on Get Aspiration Plus Product
  	Then I should see the cost of yearly as "<yearlyCost>"
  	Then I should see the cost of monthly as "<monthlyCost>"
Examples:
    |yearlyCost|monthlyCost|
    |$71.88    |$7.99      |

    
