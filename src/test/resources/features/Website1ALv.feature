@WIP4

Feature: 1aLv product search and order process test

  Scenario: Searching for a notebook and going through the ordering process
    Given Open 1aLv homepage
    When Accept all cookies
    And Initiate product search
    And Choose specific category and subcategory
    And Choose needed product
    And Add product to cart and go to cart
    And Validate product name and price
    And Choose to continue to order
    And Get in unregistered with email
    And Choose where to receive item
    And Fill in customer info
    And Click on save and continue
    And Choose pay upon receival
    Then Validate user info and price


