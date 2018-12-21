# Created by malexander at 12/19/2018
Feature: Login Action
  # Enter feature description here

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigates to LogIn Page
    And User enters UserName and Password
    Then Message displayed Login Successfully

  Scenario: Successful Logout
    Given A users logs into the site
    When User LogOut from the Application
    Then Message displayed LogOut Successfully