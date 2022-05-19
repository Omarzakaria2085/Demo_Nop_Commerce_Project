@automate
Feature: Guest could add different products to compare list


  Background: User opens the browser


  Scenario: Adding different products to compare list
    When Click on First Product Title
    And Click on add to compare button in first product page
    And Click on second product title
    And Click on add to compare button in second product page
    And User navigates to compare page
    Then Products shown in his compare list