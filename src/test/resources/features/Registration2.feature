@Regression
Feature: Registration page

  @tags
  Scenario: Registration test Scenario
    Given Launch browser`
    And User navigate to demo site URL
    And user Click on register
    And user enter first name
    And user enter last name
    And user enter phone
    And user enter email
    And user click on submit
    Then verify user registered page
