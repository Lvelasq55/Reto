#Author: Lvelasq55@gmail.com

Feature: As user
  I want to update in reqres
  To to modify users information

  Background: Connect to the service
    Given Im conected to the service

  @Put
  Scenario: Update user successful
    When I update user with name "Juan" and job "Developer"
    Then I should see the code 200
    And I should see he correct schema on Json for Put service