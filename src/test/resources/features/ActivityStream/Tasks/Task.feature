@vehicles
Feature: Task
  As a user I should be able to create a task from activity stream.Bac
 Background:
   Given user is on the landing page
   When user logs in as a "helpdesk"




  Scenario: Verify that user cagitn create new task by clicking on a task in activity stream
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "Cars" page name is displayed
    And user verifies that default page number is 1