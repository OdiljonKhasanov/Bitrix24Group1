@VYT-4121
Feature: Login
  As a user I should be able to create a task from activity stream.

  Background:
    Given user is on the landing page


  @helpdeskUser
  Scenario Outline: Login as "user"
    Then user logs in as  "user"
    And user verifies that NextbaseCRM 24 page name is displayed
    And user should create the task
    Examples:
    | user  |
    |hruser |
    |marketinguser|
    |helpdeskuser |





