@automate
Feature: User could reset her/his password successfully


  Background: User opens the browser
    Given User navigates to the login page
    And User clicks on forget password button


  Scenario: User could reset his/her password successfully
    When Enter Email "omarzakaria@gmail.com"
    And Click on recovery button
    Then User will be able to reset his password successfully