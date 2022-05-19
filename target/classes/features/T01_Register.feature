@automate
Feature: User could register with a valid data


  Background: User opens the browser
     Given User Navigates to registration Page


  Scenario: User Register with a valid username and a valid password
    When Select Gender "male"
    And User Enter "Omar" and "Zakaria"
    And Select Birthday Date "5" "February" "2000"
    And Email Address "omarzakaria@gmail.com"
    And Enter Company name "Udacity"
    And Select Newsletter "UnCheck"
    And Add Password "014702580369" and Password Confirm "014702580369"
    And User click on registration button
    Then User Could Register successfully