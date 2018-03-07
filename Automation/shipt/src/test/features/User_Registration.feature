Feature: User registration functionality

  Background:
    Given User enters "https://www.shipt.com"

  Scenario: Registration functionality is available
    When User click on Sign Up button
    Then User should be on registration page
