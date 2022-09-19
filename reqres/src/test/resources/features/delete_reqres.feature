#Author: Lvelasq55@gmail.com

Feature: As user
  I want to delete in reqres
  To see list user

  Background: Connect to the service
    Given Im conected to the service

  @Get
  Scenario: Delete users successful
    When I use the delete with path
    Then I should see the status code after delete is 204