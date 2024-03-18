#Autor: William Maldonado
@stories
Feature: Login
  As a user
  I want to login to the application
  So that I can access my account

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    Given I go to Menu commerce International and enter HDC app
    Then I see the message "i"