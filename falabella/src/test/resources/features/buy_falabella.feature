#Author: Lvelasq55@gmail.com

Feature: As an online user
  I want to enter falabella
  To make a purchase with extended guarantee

  @BuyFalabella
  Scenario: Purchase with extended warranty
    Given I enter falabella
    When I select the product "Xiaomi" with extended warranty
    Then I valid the value of the product on the dispatch page
