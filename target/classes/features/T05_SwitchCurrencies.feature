@automate
Feature: Guest could switch between currencies US-Euro


  Background: User opens the browser


  Scenario: Guest could switch between currencies US-Euro
    When Select Euro from currency dropdown list
    Then Price is Euro