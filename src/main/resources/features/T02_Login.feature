@automate
Feature: User could log in with valid email and password


  Background: User opens the browser
     Given User navigates to the login page


  Scenario: User could log in with a valid email and a valid password
    When Enter Email "omarzakaria@gmail.com" and Enter Password "014702580369"
    And Click on login button
    Then User could login successfully