
Feature: Work in Banggood


  Scenario: Searching for products in Bangood
    Given Launch the browser and go to Banggood website and serach for digital camera
    When select the camera and add it to cart
    Then check url having Digital-Camera

