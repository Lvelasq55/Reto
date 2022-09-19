#Author: Lvelasq55@gmail.com

Feature: As user
  I want to search in reqres
  To see list user

  Background: Connect to the service
    Given Im conected to the service

  @Get
  Scenario: List users successful
    When I use the get with path
    Then I should see the status code is 200
    And I should see he correct schema on Json for Get service
