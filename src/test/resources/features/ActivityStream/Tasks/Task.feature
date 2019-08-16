@createtask
Feature: Task
  As a user I should be able to create a task from activity stream.Bac
 Background:
   Given user is on the landing page
   When user logs in as a "helpdesk"




  Scenario: Verify that user should able to create new task by clicking on task in activity stream
    Then user navigates to "Task"
    And user should type "Meeting rooms" inside things to do field
    And user should send image from the path ""