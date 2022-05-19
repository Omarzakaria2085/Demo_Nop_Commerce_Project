@automate
Feature: Guest could add different products to Wishlist


  Background: User opens the browser


  Scenario: Guest could add different products to Wishlist
    When Click on product title
    And Click on wishlist icon in single product page
    And User navigates to wishlist
    Then Product shown in his wishlist