@automate
Feature: Guest could add different products to Shopping cart


  Background: User opens the browser


  Scenario: Adding different products to Shopping cart
    When Click on product title
    And Click on add to cart button in single product page
    Then Product shown in his cart