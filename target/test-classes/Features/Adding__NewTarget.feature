#Author: rajesh@synity.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Adding a New Target

  @SanityTest
  Scenario Outline: To validate adding a new target functionality
    Given User is on home page
    And User should be displayed with collect link on left hand navigation bar
    When User click on collect link
    Then User should be displayed header frame with Targets details
    And The corresponding Target Sources in the detail frame of the page should be displayed
    And User should be displayed with add button in the Targets details in header frame
    And User should be displayed with rows with value
    And User should be displayed with Test Connection icon and it should be enabled
    When User cliks on Test Connection icon
    Then user should be displayed with success message
    And User clicks on add button to add the target
    Then User should be displayed with targetdropdown list
    And Verify Connection Type and Schema Owner field should not be aditable
    And User should be able to select <TargetValue> from the drop down list
    And User should be displayed with save and cancel button
    When User cliks on save button
    Then User should be able to see the newly added target details in header frame
    Then The value of rows should be updated

    Examples: 
      | TargetValue |
      | QETestDB1   |
