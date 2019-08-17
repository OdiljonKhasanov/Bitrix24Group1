$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\ActivityStream\\Tasks\\Task.feature");
formatter.feature({
  "name": "As a user I should be able to create a task from activity stream.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@createtask"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user logs in as a \"helpdesk\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Verify that user should able to create new task by clicking on task in activity stream",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createtask"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Task\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should type \"Meeting rooms\" inside things to do field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should send image from the path \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});