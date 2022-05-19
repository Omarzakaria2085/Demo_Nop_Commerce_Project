@automate
Feature: Guest could filter with color


  Background: User opens the browser
    Given User navigates to shoes category


  Scenario: Guest could filter with color
    When Filter by Red Color
    Then Adidas items showed