@automate
Feature: Create a successful Order


  Background: User opens the browser


  Scenario: Create a successful Order
    When Click on First Product Title
    And Click on add to cart button in single product page
    And User Navigates to Add To Cart Page
    And Check Terms and Click Checkout
    And Checkout as a Guest
    And Fill CheckOut Data "Omar", "Zakaria", "omarzakaria@gmail.com", "Egypt", "Giza", "6th of October", "12125", "01101880422"
    And Select Ground Transport
    And Select Check-Money Order
    And Confirm Payment Data
    And Confirm Order
    Then Order Created Successfully