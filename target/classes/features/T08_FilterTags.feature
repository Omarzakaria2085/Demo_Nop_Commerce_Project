@automate
Feature: Guest could filter with color


  Background: User opens the browser
    Given Hover on menu item and select Category


  Scenario: Guest could filter with color
    When Filter by Cool Tag
    Then User navigates to cool tag page