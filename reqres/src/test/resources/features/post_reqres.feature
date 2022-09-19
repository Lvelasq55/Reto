#Author: Lvelasq55@gmail.com

Feature: As user
  I want to create in reqres
  To to register new users

  Background: Connect to the service
    Given Im conected to the service

  @Post
  Scenario: Create user successful
    When I create a new user with name "Pedro" and job "Qa"
    Then I should see the code is 201
    And I should see he correct schema on Json for Post service